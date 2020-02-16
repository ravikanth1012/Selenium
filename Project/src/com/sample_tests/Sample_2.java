package com.sample_tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_2 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation drivers\\chrome driver\\chromedriver.exe");

		ChromeDriver cd= new ChromeDriver();//Open Chrome browser

		cd.get("https://qa.getcloudapp.com/login");//Get URL

		cd.manage().window().maximize();// To maximize window
		
		Thread.sleep(300); 
		
        cd.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		cd.findElementById("email").sendKeys("test.user1@qualitlabs.com");//Enter Username 

		cd.findElementById("password").sendKeys("Test@1234"); //Enter password

		cd.findElementByName("commit").click();// Click submit
		
		
		
		

	
	
	
}
}