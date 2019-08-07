package com.Links;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_HomePaga_Links {

	public static void main(String[] args) {
	
        WebDriver driver=null; 
		
		String url="http://newtours.demoaut.com/";
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");

		driver=new ChromeDriver();
		
		driver.get(url);
		
        driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		int linksCount=links.size();
		
		System.out.println("The total no.of links on newtours homepaga are:"+linksCount);
		
	    for(int i=0;i<linksCount;i++)
	    {
	    	String linkName=links.get(i).getText();
	    	System.out.println(i+"   "+linkName);    	
	    }
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
    }

}
