package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class demoqaformPojo extends BaseClass{
	public demoqaformPojo()
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="firstName")
	private WebElement firstname;
	
	@FindBy(id="lastName")
	private WebElement lastname;
	
	@FindBy(id="userEmail")
	private WebElement email;
	
	@FindBy(xpath="//label[text()='Male']")
	private WebElement gmale;	
	
	@FindBy(xpath="//label[text()='Female']")
	private WebElement gfemale;
	
       @FindBy(xpath="//label[text()='Other']")
	private WebElement gother;
       
       @FindBy(id="userNumber")
       private WebElement mobile;
       
       @FindBy(id="dateOfBirthInput")
       private WebElement dob;
       
       @FindBy(xpath="//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")
       private WebElement subject;
       
       @FindBy(xpath="//label[text()='Sports']")
       private WebElement hsports;
       
       @FindBy(xpath="//label[text()='Reading']")
       private WebElement hreading;

       @FindBy(xpath="//label[text()='Music']")
       private WebElement hmusic;
       
       @FindBy(id="currentAddress")
       private WebElement address;
       
       @FindBy(xpath="//div[text()='Select State']")
       private WebElement state;
       
       @FindBy(xpath="//button[@class='btn btn-primary']")
       private WebElement submit;
       

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getGmale() {
		return gmale;
	}

	public WebElement getGfemale() {
		return gfemale;
	}

	public WebElement getGother() {
		return gother;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getDob() {
		return dob;
	}

	public WebElement getSubject() {
		return subject;
	}

	public WebElement getHsports() {
		return hsports;
	}

	public WebElement getHreading() {
		return hreading;
	}

	public WebElement getHmusic() {
		return hmusic;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getSubmit() {
		return submit;
	}

	
       
       
       
       
       
       
       
       
       
       

       
       
       
       
       
       
       


}
