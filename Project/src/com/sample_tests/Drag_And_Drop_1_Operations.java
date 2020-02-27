package com.sample_tests;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drag_And_Drop_1_Operations {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Automation drivers\\chrome driver\\chromedriver.exe");
 
		ChromeDriver cd= new ChromeDriver();//Open Chrome browser

		cd.get("http://newtours.demoaut.com/");//Get URL

		cd.manage().window().maximize();// To maximize window
		
		//Regisiteration process 
 
		cd.findElementByLinkText("REGISTER").click();

		cd.findElementByName("firstName").sendKeys("firstName");

		cd.findElementByName("lastName").sendKeys("lastName");

		cd.findElementByName("phone").sendKeys("1234567890");

		cd.findElementById("userName").sendKeys("gmail@gmail.com");

		cd.findElementByName("address1").sendKeys("Qspiders Hyderabad");

		cd.findElementByName("city").sendKeys("Hyderabad");

		cd.findElementByName("state").sendKeys("Telangana");

		cd.findElementByName("postalCode").sendKeys("500085");

		WebElement w1= cd.findElementByName("country");//Drop-down Handling

		Select s1= new Select(w1);//Select the options in Drop-down
		
		s1.selectByValue("92");

		cd.findElementByName("email").sendKeys("username");

		cd.findElementByName("password").sendKeys("password");

		cd.findElementByName("confirmPassword").sendKeys("password");

		cd.findElementByName("register").click();//Registration complete

		System.out.println(cd.findElementByXPath("//b[text()=' Note: Your user name is username.']").getText());

		//Fight Ticket Booking
		
		cd.findElementByLinkText("Flights").click();

		WebElement w2 = cd.findElementByName("passCount");

		Select s2=new Select(w2);

		s2.selectByValue("1");

		WebElement w3 = cd.findElementByName("fromPort");

		Select s3=new Select(w3);

		s3.selectByValue("Sydney");

		WebElement w4 = cd.findElementByName("fromMonth");

		Select s4=new Select(w4);

		s4.selectByValue("2");

		WebElement w5 = cd.findElementByName("toDay");

		Select s5=new Select(w5);

		s5.selectByValue("4");

		WebElement w6 = cd.findElementByName("toPort");

		Select s6=new Select(w6);

		s6.selectByValue("London");

		WebElement w7 = cd.findElementByName("toMonth");

		Select s7=new Select(w7);

		s7.selectByValue("2");

		WebElement w8 = cd.findElementByName("toDay");

		Select s8=new Select(w8);

		s8.selectByValue("6");

		WebElement w9 = cd.findElementByName("toMonth");

		Select s9=new Select(w9);

		s9.selectByValue("2");

		WebElement w10 = cd.findElementByName("airline");

		Select s10=new Select(w10);

		s10.selectByVisibleText("Pangea Airlines");

		cd.findElementByName("findFlights").click();

		cd.findElementByName("reserveFlights").click();

		cd.findElementByName("passFirst0").sendKeys("FirstName");

		cd.findElementByName("passLast0").sendKeys("LastName");

		WebElement w11=cd.findElementByName("pass.0.meal");

		Select s11=new Select(w11);

		s11.selectByValue("VGML");

		WebElement w12=cd.findElementByName("creditCard");

		Select s12=new Select(w12);

		s12.selectByValue("IK");

		cd.findElementByName("creditnumber").sendKeys("0987654321");

		WebElement w13=cd.findElementByName("cc_exp_dt_mn");

		Select s13=new Select(w13);

		s13.selectByVisibleText("01");

		WebElement w14=cd.findElementByName("cc_exp_dt_yr");

		Select s14=new Select(w14);

		s14.selectByValue("2010");

		cd.findElementByName("buyFlights").click();

		System.out.println(cd.findElementByCssSelector("font[size='+1']").getText());

		cd.findElementByCssSelector("a[href='mercurysignoff.php']").click();

		cd.quit();//Quit Browser
	}

}
