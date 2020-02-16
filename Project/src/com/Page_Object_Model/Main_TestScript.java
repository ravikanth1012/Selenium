package com.Page_Object_Model;

import org.testng.annotations.Test;

public class Main_TestScript extends Base_Class
{
	@Test
	
	public void createcustomer()
	{
		Open_Tasks op= new Open_Tasks();
		op.clickonprojectandcustomers();
		Active_Project_Customers ap = new Active_Project_Customers();
		ap.clickonaddnewcustomerbutton();
		Create_Customer cc= new Create_Customer();
		cc.entercusname("!@#1");
		cc.clickonsubmitbutton();
		System.out.println(ap.getsuccessmsg());
		
	}

}
