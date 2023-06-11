package com.automation.testscripts;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.automation.generic.Base_Class;
import com.automation.generic.Conversion;
import com.automation.generic.JavaScript_Class;
import com.automation.generic.Select_DropDown_Options;
import com.automation.pomscripts.Scenario_PriceComparision;
import com.aventstack.extentreports.Status;

@Listeners(com.automation.generic.ListenerClass.class)
public class TS_PriceComparision_DemoWebshop extends Base_Class
{
	@Test
	public void priceCompare() throws InterruptedException
	{
		Scenario_PriceComparision spc=new Scenario_PriceComparision(driver);
		spc.apparel_Shoes().click();
		test.log(Status.INFO, "Apparel&shoes tab is clicked");
		Thread.sleep(1000);
		WebElement sort_drop = spc.sortDrop();
		Select_DropDown_Options.select_By_index(sort_drop, 1);
		Thread.sleep(1000);
		WebElement disp_drop = spc.dispDrop();
		Select_DropDown_Options.select_By_VisibleText(disp_drop,"12");
		Thread.sleep(1000);
		WebElement view_drop = spc.viewDrop();
		Select_DropDown_Options.select_By_VisibleText(view_drop, "List");
		Thread.sleep(1000);
		JavaScript_Class.scroll_Down_Using_add(spc.blueJeansCart());
		Thread.sleep(1000);
		spc.blueJeansCart().click();
		Thread.sleep(1000);
		spc.casualBeltCart().click();
		//Thread.sleep(5000);
		spc.shoppingCart().click();
		Thread.sleep(1000);
		String Belt_Price = spc.beltPrice().getText();
		Thread.sleep(1000);
		String Jeans_Price = spc.jeansPrice().getText();
		Thread.sleep(1000);
		double Belt_Converted = Conversion.convert(Belt_Price);
		Thread.sleep(1000);
		double jeans_Converted = Conversion.convert(Jeans_Price);
		if(Belt_Converted > jeans_Converted)
		{
			test.log(Status.INFO, "Belt is costly");
			spc.beltCbox().click();
			Thread.sleep(1000);
			spc.updateCartBtn().click();
		}
		else if(jeans_Converted > Belt_Converted)
		{
			test.log(Status.INFO, "pant is costly");
			spc.blueJeansCbox().click();
			Thread.sleep(1000);
			spc.updateCartBtn().click();
		}
		else
		{
			test.log(Status.INFO, "Both are equal");
			spc.termsCbox().click();
			spc.checkOutBtn().click();
		}
	}
}