package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewtoursRegisterClick {

	public static void main(String[] args) {
		
		WebDriver driver=null; 
		
		String url="http://newtours.demoaut.com/";
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");

		driver=new ChromeDriver();
		
		driver.get(url);
		
		//<a href="mercuryregister.php">REGISTER</a>
		
		//driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.partialLinkText("REG")).click();
		
		
		
		
	}

}
