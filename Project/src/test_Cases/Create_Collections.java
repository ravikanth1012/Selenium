package test_Cases;

import org.testng.annotations.Test;

import object_Repository.Base_Class;
import object_Repository.Collections_Objects;

public class Create_Collections extends Base_Class

{ 
	@Test
	
	public void Create_Collection() throws InterruptedException
	{
		Collections_Objects collect = new Collections_Objects();
		 String text = collect.Add_New_Collection("collection29");
		 System.out.println(text);
		collect.Add_New_Collection_Button();
		collect.Collection_Click(text);
		collect.Delete_Collection();
		collect.Pop_up();
	}
}
