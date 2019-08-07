package com.Monster;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Monster__Multiple_Single_optional_values {

	public static void main(String[] args) {
			
		String url="/https://www.monsterindia.com/sponsered_popup.html";
		
		WebDriver driver=null;
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");

	    driver=new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
