package com.batch_execution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Final_Project.Base_class;

public class Project extends Base_class

{
@Test

public void creationproject()
{
	cd.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	cd.findElement(By.linkText("Projects & Customers")).click();
	cd.findElement(By.xpath("//input[@value='Add New Project']")).click();
	     WebElement w1=cd.findElement(By.name("customerId"));
	     Select s1=new Select(w1);
	     s1.selectByValue("2");
	     cd.findElement(By.name("name")).sendKeys("KUMAR1");
	     cd.findElement(By.xpath("//input[@value='Create Project']")).click();

}

}
