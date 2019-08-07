package com.Alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_CheckAvailability_Handle_Alert {

	public static void main(String[] args) throws InterruptedException {

        WebDriver driver=null; 
		
		String url="https://www.tsrtconline.in/oprs-web/";
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");

		driver=new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	    //<input type="button" name="searchBtn" id="searchBtn" class="chkavailabilityBtn" value="Check Availability" title="Search" onclick="validateBookingSearch(this.form, '/oprs-web/avail/services.do');">
		
		WebElement checkAvailabilityButton=driver.findElement(By.id("searchBtn"));
		
		checkAvailabilityButton.click();
		
		Alert alt=driver.switchTo().alert();
		
		String alertText=alt.getText();
		
		System.out.println("The text of an alert is:"+alertText);
		
		Thread.sleep(10000);
		
		alt.accept();
		
		driver.close();
		
}
	
}
