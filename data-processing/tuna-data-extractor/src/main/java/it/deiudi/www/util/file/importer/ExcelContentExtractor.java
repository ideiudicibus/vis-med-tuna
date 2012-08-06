/*    */ package it.deiudi.www.util.file.importer;
/*    */ 
/*    */ import java.util.Collection;
/*    */ import java.util.LinkedList;
/*    */ import jxl.Cell;
import jxl.Sheet;
/*    */ 
/*    */ public class ExcelContentExtractor
/*    */   implements RowExtractor
/*    */ {
/* 12 */   private int rowPadding = 1;
/*    */ 
/* 14 */   private String sheetName = null;
/*    */ 
/* 16 */   private Sheet s = null;
/*    */ 
/* 18 */   public ExcelContentExtractor(Sheet s, int rowPadding) { this.s = s;
/* 19 */     this.sheetName = s.getName();
/*    */ 
/* 21 */     this.rowPadding = rowPadding; }
/*    */ 
/*    */   public Collection<Object> getRawRows()
/*    */     throws RawRowsException
/*    */   {
/* 26 */     Collection<Object>  elements = new LinkedList<Object> ();
/*    */ 
/* 29 */     int rows = this.s.getRows();
/*    */ 
/* 32 */     int cols = this.s.getColumns();
/*    */ 
/* 37 */     for (int i = this.rowPadding; i < rows; i++)
/*    */     {
/* 39 */       String[] rowDescriptor = new String[cols];
/*    */ 
/* 41 */       for (int j = 0; j < cols; j++)
/*    */       {
/* 44 */         Cell a = this.s.getCell(j, i);
/*    */ 
/* 46 */         String cellContent = null;
/* 47 */         cellContent = a.getContents();
/* 48 */         rowDescriptor[j] = cellContent;
/*    */       }
/*    */ 
/* 52 */       elements.add(rowDescriptor);
/*    */     }
/*    */ 
/* 56 */     return elements;
/*    */   }
/*    */ 
/*    */   public String getSheetName() {
/* 60 */     return this.sheetName;
/*    */   }
/*    */ 
/*    */   public void setSheetName(String sheetName) {
/* 64 */     this.sheetName = sheetName;
/*    */   }
/*    */ 
/*    */   public void init()
/*    */     throws Exception
/*    */   {
/*    */   }
/*    */ 
/*    */   public void setSource(String fileName)
/*    */   {
/*    */   }
/*    */ }

/* Location:           /Users/ignazio/projects/einvoice-integration/trunk/target/ares118/WEB-INF/lib/importer-0.0.1-SNAPSHOT.jar
 * Qualified Name:     it.katalys.www.util.file.importer.ExcelContentExtractor
 * JD-Core Version:    0.6.0
 */