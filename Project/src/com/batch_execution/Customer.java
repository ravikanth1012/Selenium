package com.batch_execution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.final_project.Base_class;

public class Customer extends Base_class
{
@Test
public void creationCustomer()
{
	cd.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	cd.findElement(By.linkText("Projects & Customers")).click();
	cd.findElement(By.xpath("//input[@value='Add New Customer']")).click();
	cd.findElement(By.name("name")).sendKeys("SHIVA1");
	cd.findElement(By.name("createCustomerSubmit")).click();
}
}
