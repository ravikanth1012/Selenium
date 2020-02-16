package com.Final_Project;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main_Exceloperation extends Excel_Operations
{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException

	{

		String URL = Excel_Operations.readdata("Sheet1",1,2);
		String username = Excel_Operations.readdata("Sheet1",1,3);
		String password = Excel_Operations.readdata("Sheet1",1,4);
		System.setProperty("webdriver.chrome.driver","C:\\Automation drivers\\chrome driver\\chromedriver.exe");

		ChromeDriver cd= new ChromeDriver();//Open Chrome browser
		
		cd.get(URL);
		cd.manage().window().maximize();
		cd.findElementByName("username").sendKeys(username);
		cd.findElementByName("pwd").sendKeys(password);
		cd.findElementByXPath("//input[@type='submit']").click();
		String act = cd.getTitle();
		Excel_Operations.writedate("Sheet1", 1, 5, act);
		cd.findElementByClassName("logoutImg").click(); 
		cd.close();
		
		
		

	}
}