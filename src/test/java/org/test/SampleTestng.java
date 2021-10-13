package org.test;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;


import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class SampleTestng  {
	@BeforeClass
	private void browserLaunch()
	{
		System.out.println("Browser");
	}
	@AfterClass
	private  void closeBrowser()
	{
		System.out.println("Close Browser");
			}
	@BeforeMethod
	private  void startTime()
	{
		System.out.println("Start time");	
		}
	@AfterMethod
	private  void endTime()
	{
		System.out.println("End time");
	}
	@Test
	private void tc1() throws IOException, InterruptedException
	{  
		System.out.println("Test Case1");
		}

}
