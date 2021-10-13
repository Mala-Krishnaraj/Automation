package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.utilities.BaseClass;
import org.testng.annotations.Test;

public class GroupSample extends BaseClass {
	@BeforeClass(alwaysRun=true)
	private void browserLaunch()
		{
		launchChrome();
	}
	@AfterClass
	private void closebrowser()
	{
        System.out.println("Close Browser");
}
	@BeforeMethod
	private void startTime()
	{
		printStartTime();
	}
	@AfterMethod
	private void endTime()
	{
		printEndTime();
	}
	
	@Test()
	private void tc1()
	{
		System.out.println("Test Case 1");
	}
	
	@Test(groups= "test1")
	private void tc2()
	{
		System.out.println("Test Case 2");
	}
	
	@Test(groups="test2")
	private void  tc3()
	{
		System.out.println("Test Case 3");
	}
	@Test(groups="test3")
	private void tc4()
	{
		System.out.println("Test case 4");
	}
	
	
	
	
	
	
}