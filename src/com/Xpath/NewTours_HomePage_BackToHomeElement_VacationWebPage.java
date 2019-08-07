package com.Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTours_HomePage_BackToHomeElement_VacationWebPage {

	public static void main(String[] args) {
		
        WebDriver driver=null; 
		
		String url="http://newtours.demoaut.com/";
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");

		driver=new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//<a href="mercuryunderconst.php">Vacations</a>
		
		driver.findElement(By.linkText("Vacations")).click();
		
		//<img src=\"/images/forms/home.gif\" width=\"118\" height=\"23\" border=\"0\">
		
		WebElement backToHome=driver.findElement(By.xpath("//img[@ src='/images/forms/home.gif\']"));
		
		///html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img
		
		//WebElement backToHome=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[4]/td/a/img"));
		
		backToHome.click();	
		
		//driver.close();
		
	}

}
