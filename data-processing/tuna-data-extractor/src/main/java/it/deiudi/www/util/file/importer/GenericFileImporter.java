/*    */ package it.deiudi.www.util.file.importer;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.InputStream;
/*    */ 
/*    */ public class GenericFileImporter
/*    */   implements FileImporter
/*    */ {
/*    */   private File inputFile;
/*    */   private InputStream is;
/*    */ 
/*    */   public File getInputFile()
/*    */   {
/* 13 */     return this.inputFile;
/*    */   }
/*    */ 
/*    */   public InputStream getInputStream() {
/* 17 */     return this.is;
/*    */   }
/*    */ 
/*    */   public void importFile(File f) throws Exception {
/* 21 */     this.is = new FileInputStream(f);
/*    */   }
/*    */ 
/*    */   public void importFile(InputStream is) throws Exception {
/* 25 */     this.is = is;
/*    */   }
/*    */ 
/*    */   public void setInputFile(File inputFile)
/*    */   {
/* 30 */     this.inputFile = inputFile;
/*    */   }
/*    */
public void setInputStream(InputStream is) {
	this.is=is;
	
} }

/* Location:           /Users/ignazio/projects/einvoice-integration/trunk/target/ares118/WEB-INF/lib/importer-0.0.1-SNAPSHOT.jar
 * Qualified Name:     it.katalys.www.util.file.importer.GenericFileImporter
 * JD-Core Version:    0.6.0
 */