package org.test;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

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
import org.utilities.demoqaformPojo;

public class demoqaform extends BaseClass {

	@BeforeClass
	private void browserLaunch() {
		launchChrome();
		launchUrl("https://demoqa.com/automation-practice-form");
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

	@Test(dataProvider = "form")
	private void tc1(String s1, String s2, String mail, String mob, String add)
			throws IOException, InterruptedException {

		demoqaformPojo d = new demoqaformPojo();
		fill(d.getFirstname(), s1);
		fill(d.getLastname(), s2);
		fill(d.getEmail(), mail);
		btnClick(d.getGfemale());
		fill(d.getMobile(), mob);
		// fill(d.getSubject(),sub);
		// btnClick(d.getHreading());
		// staticWait(2000);
	//	FluentWait<WebDriver> f = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30));
		//f.until(ExpectedConditions.visibilityOf(d.getHmusic()));
	//	btnClick(d.getHmusic());
		fill(d.getAddress(), add);
		//sbyIndex(d.getState(),1);
		//Thread.sleep(2000);
		 btnClick(d.getSubmit());

	}

	@DataProvider(name = "form")
	public Object[][] data() {
	return new Object[][] { { "Sanjay", "Ram", "abc@gmail.com", "222333111", "Perumbakkam, Chennai" } };

	}

}
