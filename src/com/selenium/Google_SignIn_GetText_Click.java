package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_SignIn_GetText_Click {

	public static void main(String[] args)  {
		
		WebDriver driver=null;
		String url="https://www.google.com/";
		
		System.setProperty("webdriver.chrome.driver", "./driverfiles/chromedriver.exe");

		driver=new ChromeDriver();
		
		driver.get(url);
		 
		WebElement signIn=driver.findElement(By.id("gb_70"));
		
		String signEementText=signIn.getText();
	 
		System.out.println("The Text of the SignIn element is:"+signEementText);
		
		signIn.click();
		
		System.out.println("The title of the signin webpage is:"+driver.getTitle());
		
		//driver.close();
   }

}
