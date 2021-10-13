package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPojo extends BaseClass {
	public FlipkartPojo()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Login']")
	private WebElement fplogin;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement uname;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pass;
	
	//@FindBys({
		@FindBy(xpath="(//span[text()='Login'])[2]")
		//@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
		
	//})
	private WebElement login;
	

	public WebElement getFplogin() {
		return fplogin;
	}

	public WebElement getUname() {
		return uname;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogin() {
		return login;
	}
	
}
