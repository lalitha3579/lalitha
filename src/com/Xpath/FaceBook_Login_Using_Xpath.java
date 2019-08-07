package com.Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_Login_Using_Xpath {

	public static void main(String[] args) {
		
        WebDriver driver=null; 
		
		String url="https://en-gb.facebook.com/login/";
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");

		driver=new ChromeDriver();
		
		driver.get(url);
		
        driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//<input type="text" class="inputtext _55r1 inputtext _1kbt inputtext _1kbt" name="email" id="email" tabindex="0" placeholder="Email address or phone number" value="" autofocus="1" aria-label="Email address or phone number">
		
		WebElement email=driver.findElement(By.xpath("//*[@ placeholder='Email address or phone number']"));
		
		email.sendKeys("lalitharaomca@gmail.com");
		
		//<input type="password" class="inputtext _55r1 inputtext _1kbt inputtext _1kbt" name="pass" id="pass" tabindex="0" placeholder="Password" aria-label="Password">
		
		WebElement password=driver.findElement(By.xpath("//*[@ placeholder='Password' and @ name='pass']"));
		
		password.sendKeys("lalitha@777");
		
		//driver.close();
		
	}

	

}
