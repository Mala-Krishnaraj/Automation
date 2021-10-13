package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;



public class aaa{
	public static void main(String[] args) throws IOException  {
		
		File f =new File("C:\\Mala\\Eclipse\\MavenProject\\target\\ExcelData\\Student.xls");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new HSSFWorkbook(fin);
		Sheet s= w.getSheet("Stdetails");
		Row r = s.createRow(3);
		Cell c =r.createCell(0);
		c.setCellValue("DDD");
		Cell c1=r.createCell(1);
		c1.setCellValue(34);
		Cell c2 =r.createCell(2);
		c2.setCellValue(45);
		Cell c3=r.createCell(3);
		c3.setCellValue(67);
		Cell c4=r.createCell(4);
		c4.setCellValue(56);
		Cell c5=r.createCell(5);
		c5.setCellValue("Pass");
		fin.close();
		FileOutputStream fin1 =new  FileOutputStream(f);
		w.write(fin1);
		
		System.out.println("Successfully updated");
		
		
		
		
		
		
		
	}
}