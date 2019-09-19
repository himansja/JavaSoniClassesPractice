package capg.QAAutoamtion.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadingClass {

	static LinkedHashMap<String,LinkedHashMap<String, LinkedHashMap<String,String>>> getFileData;
	public static void excelreading(String filename) throws IOException {
		
		String rootfolder=System.getProperty("user.dir");
		
		String filePath=rootfolder+"/TestData/"+filename;
		 
		FileInputStream f = new FileInputStream(filePath);
	
		XSSFWorkbook wb = new XSSFWorkbook(f);
		
		int sheetcount=wb.getNumberOfSheets();
		
		//System.out.println(sheetcount);
		
		getFileData = new 
				LinkedHashMap<String,LinkedHashMap<String, LinkedHashMap<String,String>>>();
		for(int i=0;i<sheetcount;i++) {
			//System.out.println(wb.getSheetAt(i).getSheetName());
			
			//if(wb.getSheetAt(i).getSheetName().equalsIgnoreCase("Login")) {
				
			
				//XSSFSheet st=wb.getSheetAt(i);
			
				String stName=wb.getSheetAt(i).getSheetName();
				XSSFSheet st=wb.getSheetAt(i);
				
				int noofRows=st.getPhysicalNumberOfRows();
				//System.out.println(noofRows);
				
				XSSFRow headrRowObj=st.getRow(0);
				
				LinkedHashMap<String, LinkedHashMap<String,String>> sheetMap= new LinkedHashMap<String, LinkedHashMap<String,String>>();
				
				for(int j=1; j<noofRows;j++) {
					
					XSSFRow rowObj=st.getRow(j);
					
					int noOfCells=rowObj.getLastCellNum();
					
					String uniqueCol= st.getRow(j).getCell(0).toString();
					
					LinkedHashMap<String, String> rowMap= new LinkedHashMap<String,String>();
					
					for(int k=0; k<noOfCells;k++) {
						String cellObj=rowObj.getCell(k).toString();
						String headrKey =headrRowObj.getCell(k).toString();
						
						//System.out.println(headrKey);
						//System.out.println(cellObj);
						
						rowMap.put(headrKey, cellObj);
						
					}
					
					//System.out.println(rowMap);
					sheetMap.put(uniqueCol, rowMap);
				}
				//System.out.println(sheetMap);
				getFileData.put(stName, sheetMap);
				
			//}
		}
		
		System.out.println(getFileData);

	}

	public LinkedHashMap<String, LinkedHashMap<String,String>> getSheetData(String sheetName) {
		LinkedHashMap<String, LinkedHashMap<String,String>> sheetData=getFileData.get(sheetName);
		return sheetData;
	}
	
	public LinkedHashMap<String, String> getTestCaseData(String sheetName, String TestCaseId) {
		LinkedHashMap<String,String>testdata=getFileData.get(sheetName).get(TestCaseId);
		return testdata;
	}
	
	public String getColData(String sheetName, String TestCaseId,String colName) {
		String coldata=getFileData.get(sheetName).get(TestCaseId).get(colName);
		return coldata;
	}
	
}
