package com.CloudApp_Project;

import org.testng.annotations.Test;

public class Main_Test_Case1 extends Base_Class

{
	@Test  
	
	public void createteam() throws InterruptedException
	{
		Create_Team ct= new Create_Team();
		ct.clickcreateteam();
		Create_Organization_Account co = new Create_Organization_Account();
		co.create_organization("Organization1");
		co.click();
		System.out.println(co.success());
		co.Email("test.user5@qualitlabs.com");
		co.submit();
		co.invite();
		System.out.println(co.invite());
		co.done();		
	}
}
