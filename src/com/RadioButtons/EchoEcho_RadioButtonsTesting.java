package com.RadioButtons;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EchoEcho_RadioButtonsTesting{
	
	WebDriver driver=null;
	
	String url="http://www.echoecho.com/htmlforms10.htm";
	
	@BeforeTest
	
	public void setUp()
	{
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");

		driver=new ChromeDriver();
		
		driver.get(url);
		
        driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);

	}
	
    @AfterTest	
    
    public void tearDown()
    {
    	
    	driver.quit();
    
    }
    
    @Test
    
    public void radioButtonsTestingGroup1()
    {
    	
    	///html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td
    	
    	WebElement RadioButtonBlock=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
    	
    	//<input type="radio" name="group1" value="Milk">
    	//<input type="radio" name="group1" value="Butter" checked="">
    	//<input type="radio" name="group1" value="Cheese">
    	
    	List<WebElement>Group1_RadioButtons=RadioButtonBlock.findElements(By.name("group1"));
    	
    	int group1size=Group1_RadioButtons.size();
    	
    	System.out.println("The group1 elements count is:"+group1size);
    	
    	for(int i=0;i<group1size;i++)
    	{
    		
    		Group1_RadioButtons.get(i).click();
    		for( int j=0;j<group1size;j++)
    		{
    			
    			System.out.println(Group1_RadioButtons.get(j).getAttribute("value")+"  "+Group1_RadioButtons.get(j).getAttribute("checked"));
    			
    			//System.out.println(Group1_RadioButtons.get(j).getAttribute("value")+"  "+Group1_RadioButtons.get(j).isSelected());
    			
    		}
    		
    		
    	}
       }
 
    @Test
    
    public void radioButtonsTestingGroup2()
    {
    	
    	///html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td
    	
    	WebElement RadioButtonBlock=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
    	
    	//<input type="radio" name="group2" value="Water">
    	//<input type="radio" name="group2" value="Beer">
    	//<input type="radio" name="group2" value="Wine" checked="">
    	
    	List<WebElement>Group2_RadioButtons=RadioButtonBlock.findElements(By.name("group2"));
    	
    	int group2size=Group2_RadioButtons.size();
    	
    	System.out.println("The group2 elements count is:"+group2size);
    	
    	for(int i=0;i<group2size;i++)
    	{
    		
    		Group2_RadioButtons.get(i).click();
    		for( int j=0;j<group2size;j++)
    		{
    			
    			//System.out.println(Group2_RadioButtons.get(j).getAttribute("value")+"  "+Group2_RadioButtons.get(j).getAttribute("checked"));
    			
    			System.out.println(Group2_RadioButtons.get(j).getAttribute("value")+"  "+Group2_RadioButtons.get(j).isSelected());
    			
    		}
    		
    		
    	}
     }
    
    
}











