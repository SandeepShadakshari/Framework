package com.automation.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.automation.pomscripts.Login_Page;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Base_Class implements Framework_Constants
{
	public ExtentHtmlReporter reporter;
	public ExtentReports reports;
	public ExtentTest test; 
	public static WebDriver driver;
	public Login_Page login;
	
	@BeforeTest
	public void repConfig()
	{
		reporter=new ExtentHtmlReporter(EXTENT_PATH);
		reports=new ExtentReports();
		reports.attachReporter(reporter);
		test= reports.createTest(REPORT_HEADING);
	}
	
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(TIME_OUT, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}
	
	@BeforeMethod
	public void log_in()
	{
		driver.get(Test_DataByPropertyFILE.getData("URL"));
		login=new Login_Page(driver);
		login.login_Link().click();
		login.username().sendKeys(Test_DataByPropertyFILE.getData("user_name"));
		login.password().sendKeys(Test_DataByPropertyFILE.getData("pass_word"));
		login.cbox().click();
		login.login_btn().click();
	}
	
	@AfterMethod
	public void log_out()
	{
		login.logout_Link().click();
	}
	
	@AfterTest
	public void repClose()
	{
		reports.flush();
	}
}
