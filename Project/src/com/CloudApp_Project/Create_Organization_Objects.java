package com.CloudApp_Project;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Create_Organization_Objects extends Base_Class

{


	public void create_organization( String orgname)
	{

		driver.findElement(By.id("name")).sendKeys(orgname);
	}
	public void click()
	{

		driver.findElement(By.name("commit")).click();
	}
	public String success() throws InterruptedException
	{
		Thread.sleep(3000);
		String text= driver.findElement(By.xpath("//div[@class='flash alert alert-success']")).getText();
		Assert.assertEquals(text,"Your Team has been successfully created");
		return text ;

	}

	public void Email(String email)
	{

		driver.findElement(By.id("emails[]")).sendKeys(email);
	}

	public void submit() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//input[@type='submit'][1]")).click();
	}

	public String invite() throws InterruptedException
	{
		String text1= driver.findElement(By.xpath("//div[@class='flash alert alert-success']")).getText(); 
		Assert.assertEquals(text1,"Invitation sent");
		return text1;

	} 

	public void done() throws InterruptedException 
	{
		
		driver.findElement(By.xpath("//input[@type='submit'][2]")).click();
	}




}
