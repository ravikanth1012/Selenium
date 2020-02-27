package object_Repository;

import org.openqa.selenium.By; 

public class Create_Team_Objects extends Base_Class

{ 

	public void clickcreateteam()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Create New Team')]")).click();

	}
}
