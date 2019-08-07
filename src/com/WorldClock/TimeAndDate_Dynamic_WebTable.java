package com.WorldClock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TimeAndDate_Dynamic_WebTable extends BasicTest {

	@Test
	
	public void dynamicWebTable()
	{
		
		///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/thead/tr/th/h3
		
		WebElement table=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div"));
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		
		for(int i=0;i<rows.size();i++)
		{
			
			List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
		
			for(int j=0;j<cols.size();j++)
			{
				
				String data=cols.get(j).getText();
				
				System.out.print(data+"          ");
				
			}
			
			System.out.println();
		}
			
	}
		
}
	

