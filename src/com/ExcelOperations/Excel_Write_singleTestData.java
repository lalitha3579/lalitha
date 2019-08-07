package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write_singleTestData {

	public static void main(String[] args) throws IOException {
FileInputStream file=new FileInputStream("./src/SingleTestData/singletestdata.xlsx");
		
		XSSFWorkbook workbook= new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		Row row=sheet.createRow(3);
		
		Cell cell=row.createCell(3);
		
		cell.setCellValue("selenium");
		FileOutputStream file1= new FileOutputStream("./src/SingleTestData/singletestdata.xlsx");
		
		workbook.write(file1);
		
	}

}
