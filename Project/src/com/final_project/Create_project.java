package com.final_project;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Create_project extends Base_class

{
	
@BeforeMethod

public void clickprojectandcustomers()

{
	((RemoteWebDriver) cd).findElementByLinkText("Projects & Customers").click();
	((RemoteWebDriver) cd).findElementByXPath("//input[@value='Add New Project']").click();
}

@Test

public void create()

{
	WebElement w1=((RemoteWebDriver) cd).findElementByName("customerId");//Drop-down Handling

	Select s1= new Select(w1);//Select the option

	s1.selectByValue("3");

	System.out.println(s1.getOptions().size());//Printing Drop-down options size

	List<WebElement> s2 = s1.getOptions(); //List of options in Drop-down

	for (int i=1;i<=s2.size()-1;i++)
	{ 
		System.out.println(s2.get(i).getText());
	}

	((RemoteWebDriver) cd).findElementByLinkText("Projects & Customers").click();
	
	((RemoteWebDriver) cd).findElementById("RemainOnThePageButton").click();
	
	((RemoteWebDriver) cd).findElementByName("name").sendKeys("SELENIUM@104");
	
	((RemoteWebDriver) cd).findElementByName("description").sendKeys("GOOD APPLICATION");
	
	((RemoteWebDriver) cd).findElementByName("createProjectSubmit").click();
}

@AfterMethod

public void verifications()
{
	System.out.println(((RemoteWebDriver) cd).findElementByClassName("successmsg").getText());	
}





}