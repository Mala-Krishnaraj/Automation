package org.test;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import org.utilities.BaseClass;
import org.utilities.GreensPojo;

public class PQno3 extends BaseClass {
	public static void main(String[] args) throws InterruptedException  {
		
		launchChrome();
		launchUrl("http://www.greenstechnologys.com/Certifications.html");
		winMax();
		GreensPojo g = new GreensPojo();
		moveto(g.getCourse());
        Thread.sleep(2000);
		moveto(g.getJtrain());
		btnClick(g.getCore());
		scrollDown(g.getJtext());
		printText(g.getJtext());
		
		
		
	}
	
    
}
