package org.test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.FlipkartPojo;
import org.utilities.demoqaformPojo;


public class TestngQno4 extends BaseClass{
	@BeforeClass
	private void browserLaunch()
	{
		launchChrome();
		launchUrl("https://www.flipkart.com");
	}
	@AfterClass
	private  void closeBrowser()
	{
		System.out.println("Close Browser");
			}
	@BeforeMethod
	private  void startTime()
	{
		printStartTime();	
		}
	@AfterMethod
	private  void endTime()
	{
		printEndTime();
	}
	@Test(dataProvider="login")
	private void tc1(String s1,String s2) throws IOException, InterruptedException
	{  
	
		FlipkartPojo l = new FlipkartPojo();
		fill(l.getUname(),s1);
		fill(l.getPass(),s2);			
			}
	
	@DataProvider(name="login")
	public Object[][] data()
	{
		return  new Object[][] {
			{"aaa", "123"},
			{"bbb","234"}	
		
	};
	}
	
	

}
