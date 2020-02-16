package com.CloudApp_Project;

import org.testng.annotations.Test;

public class Sign_Up_Your_Team extends Base_Class

{
	@Test  

	public void createteam() throws InterruptedException
	{ 
		Create_Team_Objects ct= new Create_Team_Objects();
		ct.clickcreateteam();
		Create_Organization_Objects co = new Create_Organization_Objects();
		co.create_organization("Organization1");
		co.click();
		System.out.println(co.success());
		co.Email("test@automation.com");
		co.submit(); 
		Thread.sleep(1000);
		System.out.println(co.invite());
		co.done();		
	}
}
