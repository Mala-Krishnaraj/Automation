package org.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class Student {
	public static void main(String[] args) throws IOException {
		StInfo a = new StInfo();
		a.setCity("chennai");
		a.setDob("12-12-1990");
		a.setGender("M");
		a.setId(1);
		a.setName("AAA");
		
		StInfo b=new StInfo();
		b.setCity("Madurai");
		b.setDob("3-2-1990");
		b.setGender("F");
		b.setId(2);
		b.setName("BBB");				
		
		List <StInfo> li  =new ArrayList<StInfo>();
		li.add(a);
		li.add(b);		
	
		String f =("C:\\Mala\\Eclipse\\MavenProject\\target\\ExcelData\\Student.xls");
		Workbook w = new HSSFWorkbook();
		Sheet s =w.createSheet("Stdetails");
		for(int i =0;i<li.size();i++) {
		Row r = s.createRow(i);
		Cell c=r.createCell(0);
		c.setCellValue(li.get(i).getCity());
		Cell c1=r.createCell(1);
		c.setCellValue(li.get(i).getDob());
		Cell c2=r.createCell(2);
		c.setCellValue(li.get(i).getGender());
		Cell c3 = r.createCell(3);
		c.setCellValue(li.get(i).getName());
		Cell c4=r.createCell(4);
		c.setCellValue(li.get(i).getId());
		}
		FileOutputStream f1 =new FileOutputStream(f);
		w.write(f1);				
	}

}

