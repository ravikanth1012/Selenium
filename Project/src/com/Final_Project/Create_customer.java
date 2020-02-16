package com.Final_Project;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Create_customer extends Base_class
{

@BeforeMethod

public void clickprojectandcustomers()
{
	((RemoteWebDriver) cd).findElementByLinkText("Projects & Customers").click();
	((RemoteWebDriver) cd).findElementByXPath("//input[@value='Add New Customer']").click(); 
	
}

@Test

public void create()

{

	((RemoteWebDriver) cd).findElementByXPath("//input[@type='text']").sendKeys("ACTITIME-10");

	((RemoteWebDriver) cd).findElementByXPath("//textarea[@name='description']").sendKeys("GOOD APPLICATION");

	((RemoteWebDriver) cd).findElementByName("createCustomerSubmit").click();
}

@AfterMethod

public void verification()

{
	String Message = ((RemoteWebDriver) cd).findElementByClassName("successmsg").getText();// Get text

	System.out.println(Message);
}

}

