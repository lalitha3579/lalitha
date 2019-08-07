package com.validatingTitle;

import org.openqa.selenium.chrome.ChromeDriver;

public class Validating_Title_BingHomePage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://bing.com");
		
		String expected_BingHomePage_Title="Bing";
		System.out.println("The expected_BingHomePage_Title is:"+expected_BingHomePage_Title );
		
		String actual_BingHomePage_Title=driver.getTitle();
		System.out.println("The actual_BingHomePage_Title is:"+actual_BingHomePage_Title );
		
		if(actual_BingHomePage_Title.equals(expected_BingHomePage_Title))
		{
			System.out.println("Title mached - pass");
		}
		else
		{
			System.out.println("Title not mached - fail");
		}
		driver.close();
		
	}
		
}
