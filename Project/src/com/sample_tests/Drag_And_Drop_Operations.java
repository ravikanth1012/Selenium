package com.sample_tests;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.google.common.io.Files;
public class Drag_And_Drop_Operations {

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation drivers\\chrome driver\\chromedriver.exe");

		ChromeDriver cd= new ChromeDriver();//Open Chrome browser

		cd.get("https://marcojakob.github.io/dart-dnd/basic/");//Get URL

		cd.manage().window().maximize();// To maximize window

		WebElement w1 = cd.findElementByClassName("document"); //Drag and Drop Operations

		WebElement w2 = cd.findElementByClassName("trash");

		Actions a1=new Actions(cd); 

		a1.dragAndDrop(w1,w2).perform();

		EventFiringWebDriver ef=new EventFiringWebDriver(cd);

		File f1=ef.getScreenshotAs(OutputType.FILE);

		File f2=new File("C:\\screenshot\\login.jpg");

		Files.move(f1,f2);

		cd.close();
	}
}


