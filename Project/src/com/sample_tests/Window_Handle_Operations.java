package com.sample_tests;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Window_Handle_Operations {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation drivers\\chrome driver\\chromedriver.exe");

		ChromeDriver cd= new ChromeDriver();//Open Chrome browser

		cd.get("http://127.0.0.1:81/login.do");//Get URL

		cd.manage().window().maximize();// To maximize window
 
		cd.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS); //Implicity Wait

		cd.findElementByName("username").sendKeys("admin"+Keys.TAB+"manager"+Keys.TAB+"//input[@type='submit']"+Keys.ENTER);//Enter Username and Password
		
		cd.findElementByLinkText("Reports").click();
		
		cd.findElementByXPath("//img[@alt='Click Here to Pick up the date']").click();
		
		String Old = cd.getWindowHandle();
		Set <String> curr = cd.getWindowHandles();
		
		for(String s:curr)
		{
			if(!s.equals(Old))
			{
				cd.switchTo().window(s);
				break;
			}
		}
		
		cd.findElementByClassName("calendarCurrentDay").click();
		
		
		
		
		
		
	
		
		
		
	


		
		
		
		
	}

}
