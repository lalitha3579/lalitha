package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_MultipleTestData {

   public static void main(String[] args) throws IOException {
    
	    FileInputStream file=new FileInputStream("./src/SingleTestData/MultipleTestData.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		int rowCount=sheet.getLastRowNum();
		
		for(int i=0;i<rowCount;i++)
		{
		  Row row=sheet.getRow(i);
		  
		  int cellCount=row.getLastCellNum();
		  
		  for(int k=0;k<cellCount;k++)
		  {
			  Cell cell=row.getCell(k);
			  String data=cell.getStringCellValue();
			  System.out.print(data+"         ");
		  }  
			
		  System.out.println();
		
		}
		
			
   }

}
