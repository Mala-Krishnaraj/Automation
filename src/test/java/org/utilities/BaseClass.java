package org.utilities;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
		public static WebDriver driver = null ;
	   public static Actions a;
       public static Robot r ;
	   public static Alert b;
	   public static Select s;
	  	   	      
		public static void launchChrome()
		{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
		public static void launchFirefox()
		{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		}
		public static void launchInternetExplorer()
		{
		WebDriverManager.iedriver().setup();
		driver=new InternetExplorerDriver();
		}
		public static void launchUrl(String url)
		{
         driver.get(url);	
	}
	public static void winMax()
	{
	driver.manage().window().maximize();
}
	public static void printTitle()
	{
		System.out.println(driver.getTitle());
	}
	 public static void currentUrl()
	 {
		 System.out.println(driver.getCurrentUrl());
	 }
	public static void fill(WebElement ele,String value)
	{
		ele.sendKeys(value);
	}
	public static void btnClick(WebElement ele)
	{
		ele.click();
	}
	public static void optBtnClick(WebElement ele)
	{
		ele.click();
	}
	public static void moveto(WebElement ele)
	{
		a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	public static void dragDrop(WebElement src,WebElement desc)
	{  a=new Actions(driver);
		a.dragAndDrop(src, desc);
	}
	public static void dClick(WebElement ele)
	{ a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
		
	public static void rightClick(WebElement ref)
		{ a=new Actions(driver);
			a.contextClick(ref).perform();
		}
		
		public static void printText(WebElement ele)
		{
		System.out.println(ele.getText());
		}
		public static String subText(WebElement ele)
		{
			return ele.getText();
		}
		public static void printAttribute(WebElement ele)
		{
			System.out.println(ele.getAttribute("value"));
		}
		
		public static void kUp(CharSequence key) 
		{ a=new Actions(driver);
			a.keyUp(key).perform();
		}
		public static void kDown(CharSequence key)
		
		{  a=new Actions(driver);
			a.keyDown(key).perform();
		}
		public static void kCapslock( ) throws AWTException 
		{
		    r = new Robot();
			r.keyPress(KeyEvent.VK_CAPS_LOCK);
			r.keyRelease(KeyEvent.VK_CAPS_LOCK);
		}
		
		public static void kTab() throws AWTException
		{
			r=new Robot();
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		}
		
		public static void kShift( ) throws AWTException 
		{
		    r = new Robot();
			r.keyPress(KeyEvent.VK_SHIFT);
			r.keyRelease(KeyEvent.VK_SHIFT);
		}
		public static void kCopy( ) throws AWTException 
		{
		    r = new Robot();
			r.keyPress(KeyEvent.VK_COPY);
			r.keyRelease(KeyEvent.VK_COPY);
		}
		public static void kPaste( ) throws AWTException 
		{
		    r = new Robot();
			r.keyPress(KeyEvent.VK_PASTE);
			r.keyRelease(KeyEvent.VK_PASTE);

		}
		public static void altAccept()
		{
			b=driver.switchTo().alert();
			b.accept();
		}
		public static void altDismiss()
		{
			b=driver.switchTo().alert();
			b.dismiss();
		}
	   public static void altSendkeys(String val)
	   {
		   b=driver.switchTo().alert();
		   b.sendKeys(val);
	   }
	   public static void altPrinttext()
	   {
		   b=driver.switchTo().alert();
		  System.out.println( b.getText());
	   }
	   public static void scrshot(String name) throws IOException
		{
			TakesScreenshot t= (TakesScreenshot)driver;
			File src=t.getScreenshotAs(OutputType.FILE);
			File des= new File("C:\\Mala\\Eclipse\\SeleniumSetup\\Screenshot\\"+name+".jpg");
			FileUtils.copyFile(src, des);
				
		}
	
	public static String  getData(int   rowNumber , int cellNumber) throws IOException
	{	
		File f = new File("C:\\Mala\\Eclipse\\MavenProject\\target\\ExcelData\\LoginFB.xls");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new HSSFWorkbook(fin);
		Sheet s = w.getSheet("Sheet1");		
			Row r = s.getRow(rowNumber);			
		 Cell cell = r.getCell(cellNumber);

				int cellType = cell.getCellType();
				String value="";
				if (cellType == 1) {
					 value = cell.getStringCellValue();
				//System.out.print(value);
				} else if (cellType == 0) {
					if (DateUtil.isCellDateFormatted(cell)) {
						Date d = cell.getDateCellValue();
						SimpleDateFormat sim = new SimpleDateFormat("MM-dd-yy");
						 value = sim.format(d);
						
					} else {
						double d = cell.getNumericCellValue();
						long l = (long) d;
						 value = String.valueOf(l);
						
					}		}		
		return value;
	}
	public static void excel_Write( String fname,String sname,int a,int b) throws IOException {
		   String f =("C:\\Mala\\Eclipse\\MavenProject\\target\\ExcelData\\"+fname);
		   Workbook w = new HSSFWorkbook();
		   Sheet s = w.createSheet(sname);
		   for(int i=0;i<a;i++)
		   {
		   Row r =s.createRow(i);		  
		   for(int j=0;j<b;j++)
		   {
		   Cell c = r.createCell(j);
		   c.setCellValue(" ");	
		   }  }
         FileOutputStream fin =new FileOutputStream(f);
         w.write(fin);			
	}
	public static void sbyValue(WebElement ele,String value)
	{
		s=new Select(ele);
		s.selectByValue(value);
	}
	public static void sbyVisibileText(String value,WebElement ele)
	{
		s=new Select(ele);
		s.selectByVisibleText(value);
	}
	public static void sbyIndex(WebElement ele,int i)
	{
		s=new Select(ele);
		s.selectByIndex(i);
	}
	public static void isMulti(WebElement ele)
	{
		s=new Select(ele);
		s.isMultiple();
	}
	public static void getOpt(WebElement ele)
	{
		s=new Select(ele);
		List<WebElement>li=s.getOptions();
		for (WebElement x : li) {
			String list = x.getText();
			System.out.println(list);
		}		
	}
	public static void getAllSelectedOpt(WebElement ele)
	{
		s=new Select(ele);
		List<WebElement>li=s.getAllSelectedOptions();
		for (WebElement x : li) {
			String list = x.getText();
			System.out.println(list);
		}		
	}
	public static void getFSelectedOpt(WebElement ele)
	{
		s=new Select(ele);
		System.out.println(s.getFirstSelectedOption());		
	}
	public static void dSelectByIndex(WebElement ele,int i) {
		s=new Select(ele);
	  s.deselectByIndex(i);
	}
	public static void dSelectByValue(WebElement ele,String value) {
		s=new Select(ele);
	    s.deselectByValue(value);
	}
	public static void dSelectByVisibleText(WebElement ele,String value) {
		s=new Select(ele);
	  s.deselectByVisibleText(value);
	}
	public static void dSelectAll(WebElement ele) {
		s=new Select(ele);
	  s.deselectAll();
	}
	
	public static void scrollDown(WebElement ele)
	{
		JavascriptExecutor jk= (JavascriptExecutor )driver;
		jk.executeScript("arguments[0].scrollIntoView(true)", ele);		
	}
	public static void scrollUp(WebElement ele)
	{
		JavascriptExecutor jk= (JavascriptExecutor )driver;
		jk.executeScript("arguments[0].scrollIntoView(false)", ele);		
	}
	public static void highLight(WebElement ele)
	{
		JavascriptExecutor jk= (JavascriptExecutor )driver;
		jk.executeScript("arguments[0].setAttribute('style', 'background:red; border:5px solid yellow;')",ele );
	}
	public static void parentID()
	{
		String parentID = driver.getWindowHandle();
		System.out.println("ParentID="+parentID);
	}
	public static void allWindowID()
	{
	 Set<String> allID = driver.getWindowHandles();
	 System.out.println("All Windows ID:"+allID);
	}
	public static void frameID(int i)
	{
		driver.switchTo().frame(i);
	}
	public static void frameName(String name)
	{
		driver.switchTo().frame(name);
	}
	public static void frame(WebElement ele)
	{
		driver.switchTo().frame(ele);
	}
	public static void frameParent()
	{
		driver.switchTo().parentFrame();
		}
	public static void frameDefault()
	{
		driver.switchTo().defaultContent();
	}
	public static void staticWait(long num) throws InterruptedException
	{
		Thread.sleep(num);
	}
	public static void impWait(long time,TimeUnit unit)
	{
		driver.manage().timeouts().implicitlyWait(time,unit);
	}
	public static void closeChrome()
	{
		driver.close();
	}
     public static void printStartTime()
     {
    	 Date d =new Date();
    	 System.out.println(d);
     }
     public static void printEndTime()
     {
    	 Date d1= new Date();
    	 System.out.println(d1);
     }
     public static void winSUrl(String url) {
    	 driver.switchTo().window(url);
     }
     public static void winSTitle(String title) {
    	 driver.switchTo().window(title);
    	 
     }
     public static void winSID(String id)
     {
    	 driver.switchTo().window(id);
     }
     public static void multiWindows(int i)
     {
    	 Set<String> allID = driver.getWindowHandles();				    
		List<String> li=new ArrayList<String>();
		li.addAll(allID);
		String window = li.get(i);
		driver.switchTo().window(window);
    	 
     }
}		
		

	
	
	
	

	
	
	
	
		
	
	
	


	
	
	
