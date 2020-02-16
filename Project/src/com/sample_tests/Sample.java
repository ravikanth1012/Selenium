package com.sample_tests;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Automation drivers\\chrome driver\\chromedriver.exe");
		
		ChromeDriver cd= new ChromeDriver();
		
		cd.get("http://127.0.0.1:81/login.do");
		cd.manage().window().maximize();
		String s= cd.getTitle();
		System.out.println(s);
		String s1= cd.getCurrentUrl();
		System.out.println(s1);
		cd.close();
	}

}