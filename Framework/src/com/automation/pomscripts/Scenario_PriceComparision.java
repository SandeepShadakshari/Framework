package com.automation.pomscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.generic.Base_Test;

public class Scenario_PriceComparision extends Base_Test
{
	@FindBy(xpath="//ul[@class='top-menu']/li[4]/a")
	private WebElement apparel_shoes;
	
	@FindBy(id="products-orderby")
	private WebElement sort_by_drop;
	
	@FindBy(id="products-pagesize")
	private WebElement disp_drop;
	
	@FindBy(id="products-viewmode")
	private WebElement view_drop;
	
	@FindBy(xpath="//a[text()='Blue Jeans']/../following-sibling::div[3]/div[2]/input")
	private WebElement blue_jeans_addtoCart;
	
	@FindBy(xpath = "//a[text()='Casual Golf Belt']/../following-sibling::div[3]/div[2]/input")
	private WebElement casual_belt_addtoCart;
	
	@FindBy(xpath="//span[contains(text(),' cart')]")
	private WebElement Shop_cart_link;
	
	@FindBy(xpath = "//tr[@class='cart-header-row']/../following-sibling::tbody/tr[1]/td[1]/input[1]")
	private WebElement cbox_bluejeans;
	
	@FindBy(xpath="//tr[@class='cart-header-row']/../following-sibling::tbody/tr[2]/td[1]/input[1]")
	private WebElement cbox_belt;
	
	@FindBy(xpath="//tr[@class='cart-header-row']/../following-sibling::tbody/tr[1]/td[6]/span[2]")
	private WebElement blue_jeans_tp;
	
	@FindBy(xpath="//tr[@class='cart-header-row']/../following-sibling::tbody/tr[2]/td[6]/span[2]")
	private WebElement belt_tp;
	
	@FindBy(xpath="//input[@name='updatecart']")
	private WebElement update_cart_btn;
	
	@FindBy(xpath="//input[@id='termsofservice']")
	private WebElement terms_cbox;
	
	@FindBy(id="checkout")
	private WebElement check_out_btn;
	
	public Scenario_PriceComparision(WebDriver driver)
	{
		super(driver);
	}
	
	public WebElement apparel_Shoes()
	{
		return apparel_shoes;
	}
	
	public WebElement sortDrop()
	{
		return sort_by_drop;
	}
	
	public WebElement dispDrop()
	{
		return disp_drop;
	}
	
	public WebElement viewDrop()
	{
		return view_drop;
	}
	
	public WebElement blueJeansCart()
	{
		return blue_jeans_addtoCart;
	}
	
	public WebElement casualBeltCart()
	{
		return casual_belt_addtoCart;
	}
	
	public WebElement shoppingCart()
	{
		return Shop_cart_link;
	}
	
	public WebElement blueJeansCbox()
	{
		return cbox_bluejeans;
	}
	
	public WebElement beltCbox()
	{
		return cbox_belt;
	}
	
	public WebElement jeansPrice()
	{
		return blue_jeans_tp;
	}
	
	public WebElement beltPrice()
	{
		return belt_tp;
	}
	
	public WebElement updateCartBtn()
	{
		return update_cart_btn;
	}
	
	public WebElement termsCbox()
	{
		return terms_cbox;
	}
	
	public WebElement checkOutBtn()
	{
		return check_out_btn;
	}
}