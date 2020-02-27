package object_Repository;

import org.openqa.selenium.By;

public class Rename_Drop_Objects extends Base_Class
{

	public void Edit_Drop_Button()
	{
		driver.findElement(By.xpath("//a[@class= 'edit-item action-icon mr-1']")).click();
	}

	public void Name_Text_Field(String Rename)
	{
		driver.findElement(By.className("form-control")).sendKeys(Rename);
	}

	public void Rename_Button()
	{
		driver.findElement(By.xpath("//input[@value='Rename']")).click();
	}

	public String Success_Msg() throws InterruptedException
	{
		String text= driver.findElement(By.xpath("//div[@class='flash alert alert-success']")).getText();
		return text;
	}

}
