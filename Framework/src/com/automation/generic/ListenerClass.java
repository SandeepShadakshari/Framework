package com.automation.generic;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass extends Base_Class implements ITestListener
{

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("TEST CASE PASS :"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("TEST CASE FAIL :"+result.getName());
		Generic_Screenshot.getPhoto(this.driver, result);
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("TEST CASE SKIPPED :"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		System.out.println("SuccessPercentage :"+result.getName());
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		System.out.println("FAILED DUE TO TIMEOUT :"+result.getName());
	}
	
}
