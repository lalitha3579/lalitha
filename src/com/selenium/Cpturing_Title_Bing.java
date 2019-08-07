package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cpturing_Title_Bing {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://bing.com");
		
		String title_Bing_Homepage=driver.getTitle();
		
		System.out.println("The Title of Bing HomePage is:"+title_Bing_Homepage);
		
		//driver.close();
				
	}

}
