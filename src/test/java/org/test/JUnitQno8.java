package org.test;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.utilities.BaseClass;
import org.utilities.adactinPojo;

public class JUnitQno8 extends BaseClass {
	
	@BeforeClass
	public static void browserLaunch()
	{
		launchChrome();
		launchUrl("http://adactinhotelapp.com/index.php");
		printTitle();
		
	}
//	@AfterClass
//	public static void closeBrowser()
//	{
//		closeChrome();
//			}
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

	@Test()
	public void tc1() throws IOException, InterruptedException{
		adactinPojo a =new adactinPojo();
//		btnClick(a.getSno());
//		staticWait(2000);
//		btnClick(a.getCont());
//				


}
	
	
}
