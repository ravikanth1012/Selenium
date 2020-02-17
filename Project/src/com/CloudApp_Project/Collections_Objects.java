package com.CloudApp_Project;

import org.openqa.selenium.By;

public class Collections_Objects extends Base_Class

{		
	public void Add_New_Collection(String Collection_Name)
	{
		driver.findElement(By.id("name")).sendKeys(Collection_Name);
		
		}
	public void Add_New_Collection()
	{
		driver.findElement(By.xpath("//input[@value='Add new Collection']")).click();
	}
	
	public void Collection_Click(String Add_Collection)
	{
		driver.findElement(By.linkText("https://qa.getcloudapp.com/collections/aAfBBn/"));
	}

}
