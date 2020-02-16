package com.CloudApp_Project;
import org.openqa.selenium.By;

public class Create_Organization_Account extends Base_Class

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
	Thread.sleep(2000);
	String s= driver.findElement(By.xpath("//div[@class='flash alert alert-success']")).getText();
	//System.out.println(s);
	//Assert.assertTrue(s.equals("Your Team has been successfully created"));
	return s ;
	
	}
	
	public void Email(String email)
	{
		
	driver.findElement(By.id("emails[]")).sendKeys(email);
	}
	
	public void submit() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit'][1]")).click();
	}
	
	public String invite() throws InterruptedException
	{
	Thread.sleep(2000);
	String s1= driver.findElement(By.xpath("//div[@class='flash alert alert-success']")).getText();
	System.out.println(s1);
	//Assert.assertTrue(s1.equals("Invitation sent"));
	return s1 ;
	}
	
	public void done() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@type='submit'][2]")).click();
	}
	
	
	

}
