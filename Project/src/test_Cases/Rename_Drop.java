package test_Cases;

import org.testng.annotations.Test;

import object_Repository.Base_Class;
import object_Repository.Rename_Drop_Objects;

public class Rename_Drop extends Base_Class

{
	@Test

	public void Rename_The_Drop() throws InterruptedException
	{
		Rename_Drop_Objects Rename = new Rename_Drop_Objects();
		Rename.Edit_Drop_Button();
		Rename.Name_Text_Field("Rename Drop");
		Rename.Rename_Button();
		String text= Rename.Success_Msg();
		System.out.println(text);

	}


}
