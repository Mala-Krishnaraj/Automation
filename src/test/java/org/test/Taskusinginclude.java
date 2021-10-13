package org.test;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.utilities.BaseClass;
import org.utilities.FlipkartPojo;
import org.utilities.LoginPojo;

public class Taskusinginclude extends BaseClass {

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

	@Parameters({ "email", "password" })
	@Test(groups = "greens")
	private void tc1(@Optional("sun@123.com") String s1, @Optional("sd123d") String s2)
			throws IOException, InterruptedException {
		launchUrl("https://www.facebook.com/");
		LoginPojo l = new LoginPojo();
		fill(l.getUser(), s1);
		fill(l.getPass(), s2);
		staticWait(3000);
	}

	@Test(groups = "mock")
	private void tc2() throws IOException, InterruptedException {

		launchUrl("https://www.flipkart.com");
		FlipkartPojo l = new FlipkartPojo();
		fill(l.getUname(), getData(2, 0));
		fill(l.getPass(), getData(2, 1));
		staticWait(4000);
	}

	@Test(groups = { "smoke","greens"})
	private void tc3() {
		System.out.println("Test Case 3");
	}

	@Test(groups = "smoke", dataProvider = "login")
	private void tc4(String s1, String s2) throws IOException, InterruptedException {
		launchUrl("https://www.flipkart.com");
		FlipkartPojo l = new FlipkartPojo();
		fill(l.getUname(), s1);
		fill(l.getPass(), s2);
	}

	@DataProvider(name = "login")
	public Object[][] data() {
		return new Object[][] { { "aaa", "123" }, { "bbb", "234" }

		};

	}

}
