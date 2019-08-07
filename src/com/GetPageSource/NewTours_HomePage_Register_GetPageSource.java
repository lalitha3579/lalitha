package com.GetPageSource;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_HomePage_Register_GetPageSource {

	public static void main(String[] args) {
		
        WebDriver driver=null; 
		
		String url="http://newtours.demoaut.com/";
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");

		driver=new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String expectedElement="REGISTER";
		
		System.out.println("Expected element is :"+expectedElement);
		
		String newToursHomePageSourcecode=driver.getPageSource();
		
		if(newToursHomePageSourcecode.contains(expectedElement))
		{
			System.out.println("Element found");
		}
		else
		{
		   System.out.println("Element not Found");
		}
        
		driver.close();
		
	}

}
