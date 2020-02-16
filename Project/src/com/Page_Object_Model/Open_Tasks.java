package com.Page_Object_Model;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Open_Tasks {

	@FindBy(linkText="Projects & Customers")
	private WebElement projectandcustomer;

	public Open_Tasks()
	{
	PageFactory.initElements(Base_Class.driver,this);
	}
	
	public void clickonprojectandcustomers()
	{
		projectandcustomer.click();	
	}
	
	}
	