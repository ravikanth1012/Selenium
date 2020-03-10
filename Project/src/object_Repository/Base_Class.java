package object_Repository;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import data_Files.Excel_User_Data;

public class Base_Class extends Excel_User_Data 
{
	public static WebDriver driver;
 

	@BeforeTest 

	public void Openbrowser() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		String browser = Excel_User_Data.readData("Sheet1",1,6);
		String URL = Excel_User_Data.readData("Sheet1",1,2);
		if (browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Automation drivers\\chrome driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			driver.manage().window().maximize();
		}
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Automation drivers\\gecko drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else 
		{ 
			System.out.println("invalid data");
		}
		driver.get(URL);
	}   

	@BeforeClass

	public void login() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		String username = Excel_User_Data.readData("Sheet1",1,3);
		String password = Excel_User_Data.readData("Sheet1",1,4);
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.name("commit")).click();
		//WebDriverWait wait = new WebDriverWait(driver,30);	
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@data-testid='cloudapp-logo']")));
		String text= driver.findElement(By.xpath("//div[@class= 'flash alert alert-success']")).getText();
		System.out.println(text);
		String Tittle = driver.getTitle();
		System.out.println(Tittle);
		assertTrue(driver.getTitle().contains("CloudApp"));
		//assertEquals(text,"Welcome back!", "login not successfully");
 
	}

	@AfterClass

	public void logout() throws InterruptedException

	{ 
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@id= 'dropdownMenuLink'][2]")).click();
		WebElement w = driver.findElement(By.xpath("//a[@data-testid= 'nav-signout-link']"));
		Actions s= new Actions(driver);
		s.click(w);
		s.perform();
		String text1 =driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		System.out.println(text1);
		//Assert.assertEquals(text1, "Successfully Logged Out","logout not successfully");
	} 


	@AfterTest 

	public void closebrowser()
	{
		driver.close();

	}
}

