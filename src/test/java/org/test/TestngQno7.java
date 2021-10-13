package org.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.FlipkartPojo;

public class TestngQno7 extends BaseClass {
	
	@BeforeClass
	private void browserLaunch()
	{
		System.out.println("Browser  Launch");
	}
	@AfterClass
	private void closeBrowser()
	{
		System.out.println("Browser Closed");
	}
	@BeforeMethod
	private void starttime()
	{
		printStartTime();
	}
	@AfterMethod
	private void endtime()
	{
		printEndTime();
	}
//	@Ignore
//	@Test(dataProvider="login",priority=3)
//	private void tc1(String s1,String s2) throws InterruptedException
//	{
//		launchChrome();
//		launchUrl("https://www.flipkart.com/account/login");
//		FlipkartPojo f= new FlipkartPojo();
//		fill(f.getUname(),s1);
//		fill(f.getPass(),s2);
//		btnClick(f.getLogin());
//		staticWait(2000);
//	}
//	@Ignore
//	@Test(dataProvider="login",priority=1)
//	private void tc2(String s1,String s2) throws InterruptedException
//	{
//		launchFirefox();
//		launchUrl("https://www.flipkart.com/account/login");
//		FlipkartPojo f= new FlipkartPojo();
//		fill(f.getUname(),s1);
//		fill(f.getPass(),s2);
//		btnClick(f.getLogin());
//		staticWait(3000);
//	}
	@Test(dataProvider="login")
	private void tc3(String s1,String s2) throws InterruptedException
	{
		launchInternetExplorer();
		staticWait(3000);
		launchUrl("https://www.flipkart.com/account/login");
		
		FlipkartPojo f= new FlipkartPojo();
		fill(f.getUname(),s1);
		fill(f.getPass(),s2);
		btnClick(f.getLogin());
		//staticWait(2000);
	}
	
@DataProvider(name="login")
public Object[][] enter()
{
	return new Object[][] {{"A1","123"},{"B1","456"}
	};
	}
	
}


