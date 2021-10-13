package org.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.utilities.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample extends BaseClass {
	
	public static void main(String[] args) throws IOException {
		
		

	
		
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		String text = driver.getTitle();
		System.out.println("Title of the page:"+text);
		System.out.println("Url:"+driver.getCurrentUrl());
		WebElement email = driver.findElement(By.id("email"));
		fill(email,getData(1,0));
		WebElement pass = driver.findElement(By.id("pass"));
		fill(pass,getData(1,1));
		WebElement btnlogin = driver.findElement(By.xpath("//button[@name='login']"));
		btnlogin.click();
		
		
		
		
		
		
	}
	

}
