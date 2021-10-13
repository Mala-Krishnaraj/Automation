package org.test;

import java.awt.AWTException;
import java.io.IOException;

import org.utilities.BaseClass;
import org.utilities.demoPojo;

public class FbLogin  extends BaseClass{
	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		
	
	launchChrome();
	launchUrl("https://en-gb.facebook.com/");
	winMax();
	demoPojo l=new demoPojo();	
	 kCapslock();
	 staticWait(2000);
	fill(l.getTxtuser(),getData(1,0))	; 
	staticWait(1000);
	
	
	//fill(l.getTxtpass(),getData(1,1));
	

	
	
	

}
}