package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class TestUtil extends com.TestBase.BaseTest{
  

  public TestUtil() throws IOException {
    super();
    //TODO Auto-generated constructor stub
  }
  public static Object[][] getdata(String name) throws InterruptedException, IOException{

		
		
		File file = new File("C:\\Users\\RayanAlOthaim\\OneDrive - JODAYN\\Documents\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheet(name);
		
		int rows = sheet.getLastRowNum();
		int columns = sheet.getRow(0).getLastCellNum();
		
		Object data[][] = new Object[rows][columns];
		
		for(int i=0 ; i<rows ; i++) {
			for (int k = 0 ; k<columns ; k++) {
				data[i][k] = sheet.getRow(i+1).getCell(k).toString();
			}
		}
    return data;
		
		
 }


}
