package com.Hybrid;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BasicTest {
	
    WebDriver driver=null;
	
	String url="http://newtours.demoaut.com/";
	
	@BeforeTest
	
	public void setUp()
	{
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");

		driver=new ChromeDriver();
		
		driver.get(url);
		
        driver.manage().window().maximize();
        
        driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		

	}
	
  /*  @AfterTest	
    
    public void tearDown()
    {
    	
    	driver.quit();
    
    }*/
	
	

}
