package com.ApplicationLogIn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NewTours_LogIn_MultipleData extends BasicTest {
	
	@Test
	
	public void logIn() throws IOException
	{
		
	  
	  FileInputStream file=new FileInputStream("./src/com/ApplicationData/ApplicationTestData.xlsx"); 	
		
	  XSSFWorkbook workBook=new XSSFWorkbook(file);
	  
	  XSSFSheet sheet=workBook.getSheet("sheet1");
	  
	  int rowCount=sheet.getLastRowNum();
	  
	  for(int i=1;i<=rowCount;i++)
	  {
		  
		  Row row=sheet.getRow(i);
		  
		  //<input type="text" name="userName" size="10">
          
		  driver.findElement(By.name("userName")).sendKeys(row.getCell(0).getStringCellValue());
		  
		  //<input type="password" name="password" size="10">
		  
		  driver.findElement(By.name("password")).sendKeys(row.getCell(1).getStringCellValue());
		  
		  driver.findElement(By.name("login")).click();
		  
		  String expeced_LogIn_Title="find";
		  
		  System.out.println("The expected login title is:"+expeced_LogIn_Title);
		  
		  String actual_Login_Title=driver.getPageSource();
		  
		  if(actual_Login_Title.contains(expeced_LogIn_Title))
		  {
			  System.out.println("Title matched login successfull-pass");
	          row.createCell(2).setCellValue("Title matched login successfull-pass");	  
		  }
		  else
		  {
			  System.out.println("Title not matched login unsuccessful-fail");
			  row.createCell(2).setCellValue("Title not matched login unsuccessful-fail");
		  }
		  
		  FileOutputStream file1=new FileOutputStream("./src/com/ApplicationResult/NewTours_LogInTest_Result.xlsx");
		  
		  workBook.write(file1);
		
		  driver.navigate().back();
	  }  
	  
   }
	
}        
