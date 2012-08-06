/*    */ package it.deiudi.www.util.file.importer;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.InputStream;
/*    */ import jxl.Workbook;
/*    */ 
/*    */ public class ExcelFileImporter
/*    */   implements FileImporter
/*    */ {
/*    */   private Workbook workbook;
/*    */   private File inputFile;
/*    */   private InputStream is;
/*    */ 
/*    */   public File getInputFile()
/*    */   {
/* 19 */     return this.inputFile;
/*    */   }
/*    */ 
/*    */   public InputStream getInputStream()
/*    */   {
/* 24 */     return this.is;
/*    */   }
/*    */ 
/*    */   public Workbook getWorkbook() {
/* 28 */     return this.workbook;
/*    */   }
/*    */ 
/*    */   public void setWorkbook(Workbook workbook) {
/* 32 */     this.workbook = workbook;
/*    */   }
/*    */ 
/*    */   public void setInputFile(File inputFile)
/*    */   {
/* 37 */     this.inputFile = inputFile;
/*    */   }
/*    */ 
/*    */   public void importFile(File f)
/*    */     throws Exception
/*    */   {
/* 43 */     this.is = new FileInputStream(f);
/* 44 */     this.workbook = Workbook.getWorkbook(this.is);
/* 45 */     this.is.close();
/*    */   }
/*    */ 
/*    */   public void importFile(InputStream is)
/*    */     throws Exception
/*    */   {
/* 51 */     this.workbook = Workbook.getWorkbook(is);
/* 52 */     is.close();
/*    */   }
/*    */
public void setInputStream(InputStream is) {
	
	this.is=is;
} }

/* Location:           /Users/ignazio/projects/einvoice-integration/trunk/target/ares118/WEB-INF/lib/importer-0.0.1-SNAPSHOT.jar
 * Qualified Name:     it.katalys.www.util.file.importer.ExcelFileImporter
 * JD-Core Version:    0.6.0
 */