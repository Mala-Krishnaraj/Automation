package org.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GreensPojo extends BaseClass {
	public GreensPojo()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Certifications']")
	private WebElement certi;
	
	@FindBy(xpath="//a[text()='COURSES']")
	private WebElement course;
	
	@FindBy(xpath="//a[text()='TESTIMONIALS']")
	private WebElement testimonial;
	
	@FindBy(xpath="//a[text()='CAREERS']")
	private WebElement career;
	
	@FindBy(xpath="(//a[@title='contact@greenstechnologys.com'])[8]")
	private WebElement email;
	
	@FindBy(xpath="//a[text()='+91 8939 915 577 ']")
	private WebElement mobile;
	
	@FindBy(xpath="(//div[@class='testimonial-section'])[19]")
	private WebElement testtext;
	
		@FindBy(xpath="(//a[@href='http://www.greenstechnologys.com/java-training-course-content.html'])[1]")
		private WebElement jtrain;
		
		@FindBy(xpath="//span[text()='Core Java Training']")
		private WebElement core;
		
		@FindBy(xpath="//h2[text()='Java training Reviews from Anitha']")
		private WebElement jtext;
		
	
	public WebElement getJtext() {
			return jtext;
		}

	public WebElement getCore() {
			return core;
		}

	public WebElement getJtrain() {
			return jtrain;
		}

	public WebElement getTesttext() {
		return testtext;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getCareer() {
		return career;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getCerti() {
		return certi;
	}

	public WebElement getCourse() {
		return course;
	}

	public WebElement getTestimonial() {
		return testimonial;
	}

	
	
	
}
