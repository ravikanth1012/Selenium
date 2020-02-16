package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Customer {

	@FindBy(name="name")
	private WebElement entercustomername;
	@FindBy(name="createCustomerSubmit")
	private WebElement submitbutton;
	
	public Create_Customer()
	{
		PageFactory.initElements(Base_Class.driver, this);
	}
	
	public void entercusname(String customname)
	{
		entercustomername.sendKeys(customname);
	}
	public void clickonsubmitbutton()
	{
		submitbutton.click();
		
	}
	
	
}