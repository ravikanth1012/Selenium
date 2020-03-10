package object_Repository;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Collections_Objects extends Base_Class

{	
	public void Add_collecction_button() 
	{
		
		driver.findElement(By.xpath("//a[@id= 'add-collection-button']")).click();
	} 

	public String Add_New_Collection(String Collection_Name)
	{
		driver.findElement(By.id("collection-name")).sendKeys(Collection_Name);
		return Collection_Name;
	}

	public void Enter()
	{
		driver.findElement(By.id("collection-name")).sendKeys(Keys.ENTER);
	}
	
	public void Collection_Click( String Collection_Name)
	{
		driver.findElement(By.xpath("//a[@title= '"+ Collection_Name +"']")).click();
		
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
