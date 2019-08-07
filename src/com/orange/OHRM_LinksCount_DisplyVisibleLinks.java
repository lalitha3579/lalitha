package com.orange;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_LinksCount_DisplyVisibleLinks {

	public static void main(String[] args) {
		
        WebDriver driver=null; 
		
		String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
		
		System.setProperty("webdriver.chrome.driver", "./DriverFiles/chromedriver.exe");

		driver=new ChromeDriver();
		
		driver.get(url);
		
        driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String userName="admin";
		
		String passWord="admin";
		
		//<input name="txtUsername" id="txtUsername" type="text"><span class="form-hint">Username</span>
		
		WebElement UserName=driver.findElement(By.id("txtUsername"));
		
		UserName.sendKeys(userName);
		
		//<input name="txtPassword" id="txtPassword" type="password">
		
		WebElement PassWord=driver.findElement(By.id("txtPassword"));
		
		PassWord.sendKeys(passWord);
		
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		
	    WebElement LogIn=driver.findElement(By.id("btnLogin"));
						
		LogIn.click();
		
		List<WebElement>Links=driver.findElements(By.tagName("a"));
		
		int linksCount=Links.size();
		
		System.out.println("The total no.of links in ohrm are:"+linksCount);
		
		for(int i=0;i<linksCount;i++)
		{
			if(Links.get(i).isDisplayed()) 
			{
				String linkName=Links.get(i).getText();
				System.out.println(linkName);
			}
		}
		
		/*for(int i=0;i<linksCount;i++)
		{
			if(Links.get(i)!=isEmpty()) 
			{
				System.out.print("");
			}
			else
			{
				String linkName=Links.get(i).getText();
				System.out.println(linkName);
			}
		}*/
		
	}

}
