package com.orange;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_LogInTest {

	public static void main(String[] args) throws InterruptedException {
		
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
		
		String expected_AfterLogInText="Welcom";
		
		System.out.println("The expected text afterlogin is:"+expected_AfterLogInText);
		
		//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		
		WebElement LogIn=driver.findElement(By.id("btnLogin"));
				
		LogIn.click();
		
		//<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
		
		WebElement WelcomeText=driver.findElement(By.id("welcome"));
		
		String actual_LogInText=WelcomeText.getText();
		 
		System.out.println("The actual login test is:"+actual_LogInText);
		
		if(actual_LogInText.contains(expected_AfterLogInText))
		{
			System.out.println("Login successful-pass");
		}
		else
		{
			System.out.println("Login failed-fail");
		}
	    	
		WelcomeText.click();
		
		Thread.sleep(10000);
		
		//<a href="/orangehrm-4.0/symfony/web/index.php/auth/logout">Logout</a>
		
		WebElement LogOut=driver.findElement(By.linkText("Logout"));
		
		LogOut.click();
		
		//driver.close();	
	}

}
