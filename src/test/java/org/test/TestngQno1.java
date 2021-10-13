package org.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.utilities.BaseClass;
import org.utilities.FlipkartPojo;
import org.utilities.LoginPojo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngQno1 extends BaseClass {
	   public static WebDriver driver;

		@BeforeClass(alwaysRun=true)
		private void browserLaunch()
		{
			launchChrome();
		
		
	}
//		@AfterClass
//		private  void closeBrowser()
//		{
//			System.out.println("Close Browser");
//				}
//		@BeforeMethod
//		private  void startTime()
//		{
//		  printStartTime();	
//			}
//		@AfterMethod
//		private  void endTime()
//		{
//			printEndTime();
//		}
		@Parameters({"email","password"})
		@Test
		private void tc1(@Optional("123@gmail.com")String s1,@Optional("123")String s2) throws IOException, InterruptedException
		{  
			
				
			launchUrl("https://en-gb.facebook.com/");
			//String title = driver.getTitle();
			//SoftAssert s= new SoftAssert();
			//s.assertTrue(title.contains("Facebook"),"verify title");
		   LoginPojo m= new LoginPojo();
		   fill(m.getUser(),s1);
		   fill(m.getPass(),s2);
		    staticWait(3000);
		   btnClick(m.getBtnlogin());
		   System.out.println("Test Case =1"+Thread.currentThread().getId());
		   //s.assertAll();
			}
//		@Test
//		private void tc2()
//		{
//			System.out.println("Test Case =2"+Thread.currentThread().getId());
//		}
//		@Test
//		private void tc3()
//		{
//			System.out.println("Test Case =3"+Thread.currentThread().getId());
//		}
		
//		@Parameters({"browser"})
//		@Test(priority=-10)
//		private void tc4() throws IOException, InterruptedException
//		   else
//				{ 
//			       WebDriverManager.firefoxdriver().setup();
//			       driver=new FirefoxDriver();
//			       driver.get("https://www.flipkart.com")	;		
//			       FlipkartPojo l = new FlipkartPojo();
//					fill(l.getUname(),getData(2,0));
//					fill(l.getPass(),getData(2,1));				
//                     staticWait(4000);		
//                     System.out.println("Test Case =4"+Thread.currentThread().getId());
//		}

	}

	

