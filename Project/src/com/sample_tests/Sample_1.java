package com.sample_tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation drivers\\chrome driver\\chromedriver.exe");

		ChromeDriver cd= new ChromeDriver();//Open Chrome browser

		cd.get("http://127.0.0.1:81/login.do");//Get URL

		cd.manage().window().maximize();// To maximize window
		
		Thread.sleep(300); 
		
        cd.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		cd.findElementByName("username").sendKeys("admin");//Enter Username 

		cd.findElementByName("pwd").sendKeys("manager"); //Enter password

		cd.findElementByXPath("//input[@type='submit']").click();// Click submit

		String Tittle = cd.getTitle();//Get Tittle

		System.out.println(Tittle);

		cd.findElementByLinkText("Projects & Customers").click();

		cd.findElementByXPath("//input[@value='Add New Customer']").click(); 

		cd.findElementByXPath("//input[@type='text']").sendKeys("ACTITIME-1");

		cd.findElementByXPath("//textarea[@name='description']").sendKeys("GOOD APPLICATION");

		cd.findElementByName("createCustomerSubmit").click();

		String Message = cd.findElementByClassName("successmsg").getText();// Get text

		System.out.println(Message);

		cd.findElementByClassName("logoutImg").click(); //Logout

		cd.close(); // Close Browser
	}
}


