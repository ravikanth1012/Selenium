package com.CloudApp_Project;

import org.testng.annotations.Test;

public class Create_Collections extends Base_Class

{
	@Test
	
	public void Create_Collection()
	{
		Collections_Objects collect = new Collections_Objects();
		 String text = collect.Add_New_Collection("92");
		 System.out.println(text);
		collect.Add_New_Collection_Button();
		collect.Collection_Click(text);
		collect.Delete_Collection();
		collect.Pop_up();
	}
}
