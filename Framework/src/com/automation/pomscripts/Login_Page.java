package com.automation.pomscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.generic.Base_Test;

import net.bytebuddy.implementation.bind.annotation.Super;

public class Login_Page extends Base_Test
{
	@FindBy(xpath = "//a[contains(text(),' in')]")
	private WebElement login_link;
	
	@FindBy(id="Email")
	private WebElement user_name;
	
	@FindBy(id="Password")
	private WebElement pass_word;
	
	@FindBy(id="RememberMe")
	private WebElement rem_cbox;
	
	@FindBy(xpath="//input[contains(@value,' in')]")
	private WebElement log_btn;
	
	@FindBy(xpath = "//a[contains(text(),' out')]")
	private WebElement logout_link;
	
	public Login_Page(WebDriver driver)
	{
		super(driver);
	}
	
	public WebElement login_Link()
	{
		return login_link;
	}
	
	public WebElement username()
	{
		return user_name;
	}
	
	public WebElement password()
	{
		return pass_word;
	}
	
	public WebElement cbox()
	{
		return rem_cbox;
	}
	
	public WebElement login_btn()
	{
		return log_btn;
	}
	
	public WebElement logout_Link()
	{
		return logout_link;
	}
}
