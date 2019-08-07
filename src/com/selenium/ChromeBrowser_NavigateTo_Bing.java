package com.selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser_NavigateTo_Bing {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://bing.com");
		
		//driver.get("https://en-gb.facebook.com/login/");
		
		//driver.navigate().to("https://en-gb.facebook.com/login/");
		
		//driver.get("https://google.com");
		
		//driver.get("");
		
		//driver.close();
		
	
	}

}
