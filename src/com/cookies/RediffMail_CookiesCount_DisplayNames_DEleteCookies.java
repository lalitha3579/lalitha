package com.cookies;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffMail_CookiesCount_DisplayNames_DEleteCookies {

	public static void main(String[] args) {
		
        WebDriver driver=null; 
		
		String url="https://mail.rediff.com/cgi-bin/login.cgi";
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");

		driver=new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Set<Cookie>rediffMailCookies=driver.manage().getCookies();
		
		int cookiesCount=rediffMailCookies.size();
		
		System.out.println("The no.of cookies in rediff mail create account web page are:"+cookiesCount);
		
		for(Cookie var:rediffMailCookies)
		{
			System.out.println(var);
		}
		
		driver.manage().deleteAllCookies();
		
		rediffMailCookies=driver.manage().getCookies();
		
		cookiesCount=rediffMailCookies.size();
		
		System.out.println("The no.of cookies in rediff mail create account web page are:"+cookiesCount);
		
	    driver.quit();
	}

}
