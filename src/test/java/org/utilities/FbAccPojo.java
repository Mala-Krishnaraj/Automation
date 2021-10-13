package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FbAccPojo extends BaseClass {
	public FbAccPojo()
	{
		PageFactory.initElements(driver, this);
	}
	@FindAll({
	@FindBy(xpath="//input[@placeholder='First name']"),
	@FindBy(id="u_3_b_n3")
	})
	private WebElement fname;
	

		@FindBy(name="lastname")
		private WebElement lname;
	
	@FindBy(xpath="//input[@name='reg_email__']")
    private WebElement mobile;
	
 @FindBy(id="password_step_input")
 private WebElement pass;
 
 @FindBy(id="day")
 private WebElement day;
 @FindBy(id="month")
 private WebElement month;
 @FindBy(id="year")
 private WebElement year;
 
 @FindBy(xpath="//label[@class='_58mt'][1]")
 private WebElement girl;
 
 @FindBy(xpath="(//label[@class='_58mt'])[2]")
 private WebElement male;
 
 @FindBy(xpath="(//label[@class='_58mt'])[3]")
 private WebElement custom;
 
 @FindBy(xpath="//button[@name='websubmit']")
 private WebElement reg;

public WebElement getFname() {
	return fname;
}

public WebElement getLname() {
	return lname;
}

public WebElement getMobile() {
	return mobile;
}

public WebElement getPass() {
	return pass;
}

public WebElement getDay() {
	return day;
}

public WebElement getMonth() {
	return month;
}

public WebElement getYear() {
	return year;
}

public WebElement getGirl() {
	return girl;
}

public WebElement getMale() {
	return male;
}

public WebElement getCustom() {
	return custom;
}

public WebElement getReg() {
	return reg;
}
 
 
 
 
 
 
 
	

}