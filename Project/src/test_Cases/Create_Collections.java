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
		collect.Add_collecction_button();
		 String text = collect.Add_New_Collection("collection30");
		 collect.Enter();
		 System.out.println(text);
		collect.Collection_Click(text);
		collect.Delete_Collection();
		collect.Pop_up();
	}
}
