package org.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	
	public LoginPojo()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement user;
	@FindBy(name="pass")
	private WebElement pass;
	@FindBy(xpath="//button[@name='login']")
	private WebElement btnlogin;
	@FindBy(xpath="//a[text()='Create New Account']")
	private WebElement create;
	public WebElement getUser() {
		return user;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	public WebElement getCreate() {
		return create;
	}
	
	

}
