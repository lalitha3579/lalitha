package com.WorldClock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorldClock_FirstColoum_Data {
    
	WebDriver driver=null;
	
	String url="https://www.timeanddate.com/worldclock/";
	
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
	
    @AfterTest	
    
    public void tearDown()
    {
    	
    	driver.quit();
    
    }
    
    @Test
    
    public void WorldClock_FirstColoumData()
    {
    
    	for(int i=1;i<36;i++)
    	{
    	
    		WebElement city=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td[1]/a"));
    		
    		String cityName=city.getText();
    		
    		System.out.println(cityName);
    		
    		
    	}
    	
    	
    	
    	
    }
	
	

}
