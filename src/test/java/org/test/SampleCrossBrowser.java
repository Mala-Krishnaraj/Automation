package org.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.LoginPojo;

import io.github.bonigarcia.wdm.WebDriverManager;
public class SampleCrossBrowser extends BaseClass {
	public WebDriver driver;
@Parameters({"browser","email","pass"})	
@Test
public void tc1(String name,String s1,String s2) throws IOException, InterruptedException
{
	if(name.equals("chrome")){
		launchChrome();		
		 launchUrl("https://en-gb.facebook.com");
		 LoginPojo l=new LoginPojo();
		 fill(l.getUser(),s1);
		 fill(l.getPass(),s2);		
	}
	else if (name.equals("ff")){
		launchFirefox();
		 launchUrl("https://en-gb.facebook.com");
		 Thread.sleep(2000);
		 LoginPojo l=new LoginPojo();
		 fill(l.getUser(),s1);
		 fill(l.getPass(),s2);
	}
	
}
}
