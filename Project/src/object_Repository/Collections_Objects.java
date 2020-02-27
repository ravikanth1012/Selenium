package object_Repository;

import org.openqa.selenium.By;

public class Collections_Objects extends Base_Class

{		
	public String Add_New_Collection(String Collection_Name)
	{
		driver.findElement(By.id("name")).sendKeys(Collection_Name);
		return Collection_Name;

	}
	public void Add_New_Collection_Button()
	{
		driver.findElement(By.xpath("//input[@value='Add new Collection']")).click();
	}

	public void Collection_Click( String Collection_Name)
	{
		driver.findElement(By.linkText(""+ Collection_Name +"")).click(); 
	}

	public void Delete_Collection()
	{
		driver.findElement(By.className("remote-link")).click();
	}

	public void Pop_up()
	{ 
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		driver.switchTo().alert().accept();
		

	}
}
