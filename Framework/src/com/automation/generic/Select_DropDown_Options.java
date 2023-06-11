package com.automation.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Select_DropDown_Options 
{
	public static Select select_class(WebElement ele)
	{
		Select sel=new Select(ele);
		return sel;
	}
	
	public static void select_By_index(WebElement ele,int index)
	{
		select_class(ele).selectByIndex(index);
	}
	
	public static void select_By_Value(WebElement ele,String value)
	{
		select_class(ele).selectByValue(value);
	}
	
	public static void select_By_VisibleText(WebElement ele,String text)
	{
		select_class(ele).selectByVisibleText(text);
	}
}
