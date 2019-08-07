package com.selenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserAutomation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DaivaDarshan\\Desktop\\eclipse\\eclipse\\AUT\\JavaPrograms\\DriverFiles\\chromedriver.exe");
        ChromeDriver c=new ChromeDriver();
        
       // System.setProperty("webdriver.gecko.driver","C:\\Users\\DaivaDarshan\\Desktop\\eclipse\\eclipse\\AUT\\JavaPrograms\\DriverFiles\\geckodriver.exe");
       // FirefoxDriver f=new FirefoxDriver();
        
       // c.get("http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login");
        
        
	
	}

}
