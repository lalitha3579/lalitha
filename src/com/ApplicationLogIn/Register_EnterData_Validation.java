package com.ApplicationLogIn;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Register_EnterData_Validation extends BasicTest {
	
	@Test
	
	public void register_data_validation() throws IOException
	{
		////<a href="mercuryregister.php">REGISTER</a>
		
		driver.findElement(By.linkText("REGISTER")).click();
		 
		FileInputStream file=new FileInputStream("./src/com/ApplicationData/RegisterData.xlsx"); 	
			
		XSSFWorkbook workBook=new XSSFWorkbook(file);
		  
		XSSFSheet sheet=workBook.getSheet("sheet1");
		
		Row row;
		
		//<input maxlength="60" name="firstName" size="20">
		
	    driver.findElement(By.name("firstName")).sendKeys(sheet.getRow(0).getCell(0).getStringCellValue());
		
	    //<input maxlength="60" name="lastName" size="20">
	    
	    driver.findElement(By.name("lastName")).sendKeys(sheet.getRow(1).getCell(0).getStringCellValue());
	    
	    //<input maxlength="20" name="phone" size="15">
	    
	    driver.findElement(By.name("phone")).sendKeys(sheet.getRow(2).getCell(0).getRichStringCellValue());
	    
	    //<input name="userName" id="userName" size="35" maxlength="64">
	    
	    driver.findElement(By.name("userName")).sendKeys(sheet.getRow(3).getCell(0).getStringCellValue());
	    
	    //<input maxlength="60" name="address1" size="40">
	    
	    driver.findElement(By.name("address1")).sendKeys(sheet.getRow(4).getCell(0).getStringCellValue());
	    
	    //<input maxlength="60" name="city" size="15">
	    
	    driver.findElement(By.name("city")).sendKeys(sheet.getRow(5).getCell(0).getStringCellValue());
	    
	    //<input maxlength="40" name="state">
	    
	    driver.findElement(By.name("state")).sendKeys(sheet.getRow(6).getCell(0).getStringCellValue());
	    
	    //<input maxlength="20" name="postalCode" size="15">
	    
	    driver.findElement(By.name("postalCode")).sendKeys(sheet.getRow(7).getCell(0).getStringCellValue());
	    
	    //<select name="country" size="1">
        
	    driver.findElement(By.name("country")).sendKeys(sheet.getRow(8).getCell(0).getStringCellValue());
	    
	    
	    //<input name="email" id="email" size="20" maxlength="60">
	    
	    driver.findElement(By.name("email")).sendKeys(sheet.getRow(9).getCell(0).getStringCellValue());
	    
	    //<input maxlength="60" name="password" size="20" type="password">
	    
	    driver.findElement(By.name("password")).sendKeys(sheet.getRow(10).getCell(0).getStringCellValue());
	    
	    //<input maxlength="60" name="confirmPassword" size="20" type="password">
	    
	    driver.findElement(By.name("confirmPassword")).sendKeys(sheet.getRow(11).getCell(0).getStringCellValue());
	    
	    //<input type="image" name="register" src="/images/forms/submit.gif" width="60" height="23" border="0">
	
	    driver.findElement(By.tagName("input")).click();
	    		
	}
	
	
	

}






















