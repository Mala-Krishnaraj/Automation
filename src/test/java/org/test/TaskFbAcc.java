package org.test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.utilities.BaseClass;
import org.utilities.FbAccPojo;
import org.utilities.LoginPojo;

public class TaskFbAcc extends BaseClass {
	@BeforeClass(alwaysRun = true)
	private void browserLaunch() {
		launchChrome();
	}

	@AfterClass
	private void closeBrowser() {
		System.out.println("Close Browser");
	}

	@BeforeMethod
	private void startTime() {
		printStartTime();
	}

	@AfterMethod
	private void endTime() {
		printEndTime();
	}
  
  @Test( dataProvider="login",dataProviderClass=DataProviderSampleFb.class)
	//@Parameters({"fname","lname","mobile","pass","day","month","year"})
	//@Test
  private void tc1(String s1,String s2,String s3,String s4,String d,int m,String y,WebElement z) throws InterruptedException
  {
	  launchUrl("https://en-gb.facebook.com/");
	  LoginPojo l= new LoginPojo();
	  btnClick(l.getCreate());
	  Thread.sleep(4000);
			  
	  FbAccPojo f =new FbAccPojo();
	  
	  fill(f.getFname(),s1);
	  fill(f.getLname(),s2);
	  fill(f.getMobile(),s3);
	  fill(f.getPass(),s4);
	 sbyValue(f.getDay(),d);
	 sbyIndex(f.getMonth(),m);
    sbyValue(f.getYear(),y);
	  Thread.sleep(3000);
  	  optBtnClick(z);
	  Thread.sleep(2000);
	 
  }
  

}



