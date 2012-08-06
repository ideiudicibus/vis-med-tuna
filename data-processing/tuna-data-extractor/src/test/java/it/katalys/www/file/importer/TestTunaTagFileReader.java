package it.katalys.www.file.importer;

import static org.junit.Assert.assertNotNull;
import it.deiudi.www.medtuna.excel.model.Options;
import it.deiudi.www.medtuna.excel.model.Point;
import it.deiudi.www.medtuna.excel.model.TimemapDataItem;
import it.deiudi.www.util.date.DateUtils;
import it.deiudi.www.util.file.importer.ExcelContentExtractor;
import it.deiudi.www.util.file.importer.RawRowsException;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.junit.Test;

import com.google.common.collect.ObjectArrays;
import com.google.gson.Gson;
public class TestTunaTagFileReader  {
	
	@Test
	public void testImportSheet() throws BiffException, IOException, RawRowsException{
		
		
		InputStream is=this.getClass().getResourceAsStream("tuna-tags.xls");
		
		Workbook wb=Workbook.getWorkbook(is);
		assertNotNull(wb);
		//for(int i=0;i<=wb.getSheets().length;i++){
			int i=0;
			Sheet s=wb.getSheet(i);
			ExcelContentExtractor ecf=new ExcelContentExtractor(s, 1);
			Collection<Object> rowList=ecf.getRawRows();
			Gson gson = new Gson();
			
			ArrayList<TimemapDataItem> collection = new ArrayList<TimemapDataItem>();
			try{
				

			for(Object o: rowList){
				TimemapDataItem tmdi=new TimemapDataItem();
				String[] row=(String[]) o;
				String start=row[0]+"-"+row[1]+"-"+row[2];
				start=DateUtils.formatConverter(start, "yyyy-M-d", "yyyy-MM-dd");
				
				if(row[0].isEmpty()) throw new Exception("eof");
				tmdi.setStart(start);
				tmdi.setTitle("Relevation on "+ start);
				tmdi.setPoint(new Point(Float.parseFloat(row[3]),Float.parseFloat(row[4])));
				tmdi.setOptions(new Options(new String[]{row[0]},null,null));
				collection.add(tmdi);
				
				
			}
			
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
			TimemapDataItem tmdiTmp=collection.remove(0);
			String[] array=tmdiTmp.getOptions().getTags();
			array=ObjectArrays.concat("first", array);
			tmdiTmp.getOptions().setTags(array);
			collection.set(0, tmdiTmp);
			
			
			tmdiTmp=collection.remove(collection.size()-1);
			array=tmdiTmp.getOptions().getTags();
			array=ObjectArrays.concat("last", array);
			tmdiTmp.getOptions().setTags(array);
			collection.set(collection.size()-1, tmdiTmp);
			
			System.out.println(gson.toJson(collection));
			
		//}
		
		
	}

}
