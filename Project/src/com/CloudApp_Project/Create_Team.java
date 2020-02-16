package com.CloudApp_Project;

import org.openqa.selenium.By;
  
public class Create_Team extends Base_Class

{
	
	public void clickcreateteam()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Create New Team')]")).click();
		
	}
}
