package com.Page_Object_Model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Active_Project_Customers {

	@FindBy(xpath="//input[@value='Add New Customer']")
	private WebElement addnewcustomerbutton;
	@FindBy(className="successmsg")
	private WebElement retrivesuccessmsg;
	public Active_Project_Customers()
	
	{
	PageFactory.initElements(Base_Class.driver,this);
	}
	public void clickonaddnewcustomerbutton()
	{
		addnewcustomerbutton.click();
	}
	public String getsuccessmsg()
	{
		String s= retrivesuccessmsg.getText();
		return s;
	}
}
