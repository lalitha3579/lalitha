package com.validatingurl;

import org.openqa.selenium.chrome.ChromeDriver;

public class Capturingurl_faceBookHomePage_Validatingurl {

	public static void main(String[] args) {
		
		String url="https://en-gb.facebook.com/login/";
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		String expected_facebook_HomePageurl="facebook.com";
		System.out.println("The expected_facebook_HomePageurl is: "+expected_facebook_HomePageurl);
		
		String actual_facebook_HomePageurl=driver.getCurrentUrl();
		System.out.println("The actual_facebook_HomePageurl is: "+actual_facebook_HomePageurl);
		
		if(actual_facebook_HomePageurl.contains(expected_facebook_HomePageurl))
		{
			System.out.println("Successfully reached to facebook homepage - pass");
		}
		else
		{
			System.out.println("Failed to navigating to facebook homepage - fail");
		}
		
		//driver.close();
		
	}
}
