package com.DropDown;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_ElementsCount_DisplayCountryNames {

	public static void main(String[] args) throws IOException {
        
		WebDriver driver=null; 
		
		String url="http://newtours.demoaut.com/";
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");

		driver=new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//<a href="mercuryregister.php">REGISTER</a>
		
		WebElement register=driver.findElement(By.linkText("REGISTER"));
		
		register.click();
		
		//<select name="country" size="1">
        
		WebElement country=driver.findElement(By.name("country"));
		
		List<WebElement>countries=country.findElements(By.tagName("option"));
		
		int countriescount=countries.size();
		
		System.out.println("The total number of countries are:"+countriescount);
		
		FileInputStream file=new FileInputStream("./src/SingleTestData/countries.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		for(int i=0;i<countriescount;i++)
		{
			String countryname=countries.get(i).getText();
			
			System.out.println(countryname);
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			int j=0;
			    
			Row row=sheet.createRow(i);
				
			Cell cell=row.createCell(j);
				
			cell.setCellValue(countryname);
			     
			FileOutputStream file1=new FileOutputStream("./src/SingleTestData/countries.xlsx");
				
			workbook.write(file1);
			
       }
		
		driver.close();
		
	}

}
