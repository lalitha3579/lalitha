package com.facebooklogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_Login_Test {

	public static void main(String[] args) {
		
		WebDriver driver=null;
		String url="https://en-gb.facebook.com/login/";
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get(url);
		
		//<input type="text" class="inputtext _55r1 inputtext _1kbt _4rer inputtext _1kbt" 
		//name="email" id="email" tabindex="0" placeholder="Email address or phone number" 
		//value="" autofocus="1" aria-label="Email address or phone number" aria-describedby="js_zl">
		
		driver.findElement(By.id("email")).sendKeys("lalitharaomca");
		
		//<input type="password" class="inputtext _55r1 inputtext _1kbt inputtext _1kbt" 
		//name="pass" id="pass" tabindex="0" placeholder="Password" 
		//aria-label="Password">
		
		driver.findElement(By.id("pass")).sendKeys("lalitha@777");
		
		//<button value="1" class="_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy" 
		//id="loginbutton" name="login" tabindex="0" type="submit">Log In</button>
		
		driver.findElement(By.id("loginbutton")).click();
	
		driver.close();
	}

}
