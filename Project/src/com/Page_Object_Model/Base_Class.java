package com.Page_Object_Model;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.Final_Project.Excel_Operations;

public class Base_Class extends Excel_Operations
{

	public static WebDriver driver;

	@BeforeTest

	public void Openbrowser() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		String browser = Excel_Operations.readdata("Sheet1",1,6);
		String URL = Excel_Operations.readdata("Sheet1",1,2);
		if (browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Automation drivers\\chrome driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Automation drivers\\gecko drivers\\geckodriver.exe");

		}

		else 
		{ 
			System.out.println("invalid data");
		}
		driver.get(URL);
	}

	@BeforeClass

	public void login() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		String username = Excel_Operations.readdata("Sheet1",1,3);
		String password = Excel_Operations.readdata("Sheet1",1,4);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@AfterClass

	public void logout()
	{
		driver.findElement(By.className("logoutImg")).click();
	}

	@AfterTest

	public void closebrowser()
	{
		driver.close();

	}
}






