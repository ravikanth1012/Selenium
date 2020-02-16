package com.sample_tests;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_Of_Options_Drop_Down {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation drivers\\chrome driver\\chromedriver.exe");

		ChromeDriver cd= new ChromeDriver();//Open Chrome browser

		cd.get("http://127.0.0.1:81/login.do");//Get URL

		cd.manage().window().maximize();// To maximize window

		cd.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS); //Implicity Wait

		cd.findElementByName("username").sendKeys("admin");//Enter Username 

		cd.findElementByName("pwd").sendKeys("manager"); //Enter password

		cd.findElementByXPath("//input[@type='submit']").click();// Click submit

		cd.findElementByLinkText("Projects & Customers").click();

		cd.findElementByXPath("//input[@value='Add New Project']").click(); 

		WebElement w1=cd.findElementByName("customerId");//Drop-down Handling

		Select s1= new Select(w1);//Select the option

		s1.selectByValue("3");

		System.out.println(s1.getOptions().size());//Printing Drop-down options size
 
		List<WebElement> s2 = s1.getOptions(); //List of options in Drop-down

	 	for (int i=1;i<=s2.size()-1;i++)
		{ 
			System.out.println(s2.get(i).getText());
		}

		cd.findElementByLinkText("Projects & Customers").click();
		
		cd.findElementById("RemainOnThePageButton").click();
		
		cd.findElementByName("name").sendKeys("SELENIUM@101");
		
		cd.findElementByName("description").sendKeys("GOOD APPLICATION");
		
		cd.findElementByName("createProjectSubmit").click();
		
		System.out.println(cd.findElementByClassName("successmsg").getText());
		
		cd.findElementByClassName("logoutImg").click(); //Logout

		cd.quit(); // Close Browser
	}
}
