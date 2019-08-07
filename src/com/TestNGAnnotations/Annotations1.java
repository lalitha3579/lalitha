package com.TestNGAnnotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations1 {
	
	@BeforeTest
	public void gmailApplicationLaunch()
	{
	  System.out.println("Gmail application launch");
	}
	
	@Test(priority=1)
	public void logIN()
	{
	  System.out.println("Gmail application login funtionality testing");
	}
  
	@Test(enabled=false)
	public void inBox()
	{
	  System.out.println("Gmail application inbox funtionality testing ");
	}
	
	@AfterTest
	public void composeMail()
	{
	  System.out.println("Gmail application compose mail functionality testing");
	}
	
	@Test(priority=2)
	public void checkMail()
	{
	  System.out.println("Gmail application check mail functionality testing");
	}		

}
