package com.automation.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base_Test 
{
	public Base_Test(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}