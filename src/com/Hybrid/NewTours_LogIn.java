package com.Hybrid;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NewTours_LogIn extends BasicTest {
	
	@Test
	
	public void logIn() throws IOException
	{
	
	FileInputStream file=new FileInputStream("./src/com/NewToursLogIn/Configuration/NewTours.properties");
	
	Properties prop=new Properties();
	
	prop.load(file);
	
	FileInputStream file1=new FileInputStream("./src/com/NewTours_TestData/ApplicationTestData.xlsx"); 	
	
	XSSFWorkbook workBook=new XSSFWorkbook(file1);
	  
	XSSFSheet sheet=workBook.getSheet("sheet1");
	  
    int rowCount=sheet.getLastRowNum();
	  
	for(int i=1;i<=rowCount;i++)
	{
		  
		  Row row=sheet.getRow(i);
		  
		  //<input type="text" name="userName" size="10">
        
		  WebElement name=driver.findElement(By.name(prop.getProperty("uName")));
		  
		  String name1=row.getCell(0).getStringCellValue();
		  	  
		  name.sendKeys(name1);
		  
		  //<input type="password" name="password" size="10">

		  WebElement pass=driver.findElement(By.name(prop.getProperty("pName")));
		  
		  String pass1=row.getCell(1).getStringCellValue();

		  pass.sendKeys(pass1);
		  
		  //<input type="image" name="login" value="Login" src="/images/btn_signin.gif?osCsid=4a03c7cf31e82d1240ab8fffd9fe8e2c" width="58" height="17" alt="Sign-In" border="0">
		  
		  driver.findElement(By.name(prop.getProperty("lName"))).click();
		  
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
		  
		  FileOutputStream file2=new FileOutputStream(".//src/com/Hybrid/ResultTestData.xlsx");
		  
		  workBook.write(file2);
		
		  driver.navigate().back();  
	  }  
	  
   }
	
}
