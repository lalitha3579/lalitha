package com.WorldClock;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WorldClock_Display_TimeandData_ColoumRow {

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
    
    public void capturing_Complete_WebTableData()
    {
    	
    	///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
        ///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
    	  		
       	for(int i=1;i<=36;i++)
       	{	
    	   for(int j=1;j<=8;j++)
    	   {
    		   
    	    String data=driver.findElement(By.xpath("html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td["+j+"]")).getText();
    	    System.out.print(data+" ");
    	  
    	   }
    	   
    	   System.out.println();
    	   
       	}
       	
    }
    
}  
    	
    	     	    	   
    	   