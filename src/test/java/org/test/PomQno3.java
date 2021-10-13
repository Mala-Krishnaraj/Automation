package org.test;

import org.utilities.BaseClass;
import org.utilities.GreensPojo;

public class PomQno3 extends BaseClass {
	public static void main(String[] args) {
		
		launchChrome();
		launchUrl("http://www.greenstechnologys.com/Certifications.html");
		winMax();
		GreensPojo g1 = new GreensPojo();
		btnClick(g1.getTestimonial());
		printText(g1.getMobile());
		scrollUp(g1.getTesttext());
		String text = subText(g1.getTesttext());
		int start = text.indexOf("This");
		int end = text.indexOf("team");
		System.out.println(start);
		System.out.println(end);
		
		System.out.println(text.substring(180, 225));
		
				
	}

}
