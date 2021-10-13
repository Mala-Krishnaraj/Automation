package org.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


public class Sample2 {

	public static void main(String[] args) throws IOException {
		Workbook w =new HSSFWorkbook();
		String filename=("C:\\Mala\\Eclipse\\MavenProject\\target\\ExcelData\\NewExcel.xls");
		
		Sheet s=w.createSheet("Sample");
		Row r =s.createRow(0);
		r.createCell(0).setCellValue("Name");
		r.createCell(1).setCellValue("DOB");
		r.createCell(2).setCellValue("Gender");
		Row r1 = s.createRow(1);
		r1.createCell(0).setCellValue("AAA");
		r1.createCell(1).setCellValue("12/7/1990");
		r1.createCell(2).setCellValue("M");
		
		Row r2 = s.createRow(2);
		r2.createCell(0).setCellValue("BBB");
		r2.createCell(1).setCellValue("25/12/1991");
		r2.createCell(2).setCellValue("F");
		
		FileOutputStream f1= new FileOutputStream(filename);
		w.write(f1);
		
	
		
		
		
		
		
		

		

				
		
		
	}

}
