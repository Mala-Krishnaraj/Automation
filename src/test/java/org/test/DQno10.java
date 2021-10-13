package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.utilities.BaseClass;

public class DQno10 extends BaseClass {
	public static void main(String[] args) throws IOException {
		
		launchChrome();
		
		launchUrl("http://www.adactin.com/HotelApp/");
		winMax();
	WebElement reg=driver.findElement(By.xpath("//a[text()='New User Register Here']"));
		
		btnClick(reg);
		WebElement user=driver.findElement(By.id("username"));
		fill(user,getData(1,0));
		WebElement  pass=driver.findElement(By.id("password"));
		fill(pass,getData(1,1));
		WebElement cpass=driver.findElement(By.id("re_password"));
		fill(cpass,getData(1,2));
		WebElement name=driver.findElement(By.id("full_name"));
		fill(name,getData(1,3));
		WebElement email=driver.findElement(By.id("email_add"));
		fill(email,getData(1,4));
		
		
		
	}

}
