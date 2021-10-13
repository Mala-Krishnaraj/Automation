package org.test;
import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.utilities.*;

public class Test extends BaseClass{
	public static void main(String[] args) throws AWTException, IOException {
		launchChrome();
		launchUrl("https://en-gb.facebook.com/");
		winMax();
		printTitle();
		currentUrl();
//		WebElement prompttxt = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
//		btnClick(prompttxt);
//		WebElement promptalert = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
//		btnClick(promptalert);
//		altPrinttext();
//		altSendkeys("mala");
//		altAccept();
//		
	//	scrshot("aa");
		
		
		
		
	WebElement txt = driver.findElement(By.id("email"));
	
		kCapslock();
		fill(txt,"greens");
		
		dClick(txt);
		
	}

}
