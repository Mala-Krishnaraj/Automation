package org.test;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

public class JunitOrder extends BaseClass {
	@BeforeClass
	public static void browserLaunch()
	{
		launchChrome();
		launchUrl("https://en-gb.facebook.com/");
		printTitle();
		
	}
	@AfterClass
	public static void closeBrowser()
	{
		closeChrome();
			}
	@Before
	public  void startTime()
	{
		printStartTime();
	}
	@After
	public  void endTime()
	{
		printEndTime();
	}
//	valid username, valid password
	@Test()
	public void tc1() throws IOException, InterruptedException
	{  launchUrl("https://en-gb.facebook.com/");
		LoginPojo l =new LoginPojo();
		fill(l.getUser(),getData(1,0));
		fill(l.getPass(),getData(1,1));
		Assert.assertEquals("InValid Username", "Anu", "Arun");
		btnClick(l.getBtnlogin());
		
		Thread.sleep(2000);
			}
	
//	valid username,invalid password
	@Ignore
	@Test
	public void tc2() throws IOException, InterruptedException 
	{ 
		launchUrl("https://en-gb.facebook.com/");	
		String url = driver.getCurrentUrl();
		System.out.println("Current Url:"+url);
		Assert.assertEquals("Verify the current url", "https://en-gb.facebook.com/", url);
		LoginPojo l=new LoginPojo();
		fill(l.getUser(),getData(2,0));
		fill(l.getPass(),getData(2,1));
		btnClick(l.getBtnlogin());		
		Thread.sleep(2000);
	}
	
	
//	//invalid username,valid password
	@Ignore
	@Test
	public void tc3() throws IOException, InterruptedException 
	{  
		launchUrl("https://en-gb.facebook.com/");
		String title = driver.getTitle();
	    System.out.println("Title="+title);
	    Assert.assertTrue("VerigyTitle", title.contains("Facebook"));
		LoginPojo l =new LoginPojo();
		fill(l.getUser(),getData(3,0));
		fill(l.getPass(),getData(3,1));
	    btnClick(l.getBtnlogin());	    
	    Thread.sleep(2000);
		
	}
//	//invalid username,invalid password
	@Ignore
	@Test
	public void tc4() throws IOException, InterruptedException 
	{
		launchUrl("https://en-gb.facebook.com/");
		LoginPojo l =new LoginPojo();
		fill(l.getUser(),getData(4,0));
		fill(l.getPass(),getData(4,1));
		btnClick(l.getBtnlogin());
		Thread.sleep(1000);
	}
	}
