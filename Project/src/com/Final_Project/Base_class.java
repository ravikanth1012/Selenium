package com.Final_Project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;


public class Base_class {
	
	public static WebDriver cd;

	@BeforeTest
	
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation drivers\\chrome driver\\chromedriver.exe");

		cd= new ChromeDriver();//Open Chrome browser

		cd.get("http://127.0.0.1:81/login.do");//Get URL

		cd.manage().window().maximize();// To maximize window
	}
	
	@BeforeClass
	
	public void login()
	{
		((RemoteWebDriver) cd).findElementByName("username").sendKeys("admin");//Enter Username 

		((RemoteWebDriver) cd).findElementByName("pwd").sendKeys("manager"); //Enter password

		((RemoteWebDriver) cd).findElementByXPath("//input[@type='submit']").click();// Click submit

		String Tittle = cd.getTitle();//Get Tittle
		
		System.out.println(Tittle);
		
		Assert.assertTrue(cd.getTitle().equals("actiTIME"));
		
		System.out.println(" Test is passed");
	}

	@AfterClass
	
	public void logout()
	
	{
		((RemoteWebDriver) cd).findElementByClassName("logoutImg").click(); //Logout
	}
	
	@AfterTest
	
	public void closebrowser()
	
	{
		cd.close();
	}
}



