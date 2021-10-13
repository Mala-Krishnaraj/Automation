package org.test;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import net.bytebuddy.description.type.TypeDescription.Generic.OfTypeVariable.Symbolic;

public class ExcelSample {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Mala\\Eclipse\\MavenProject\\target\\ExcelData\\Book1.xls");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new HSSFWorkbook(fin);
		Sheet s = w.getSheet("Login");

		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);

			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell cell = r.getCell(j);

				int cellType = cell.getCellType();
				if (cellType == 1) {
					String value = cell.getStringCellValue();
					System.out.print(value+"\t"+"\t");
				} else if (cellType == 0) {
					if (DateUtil.isCellDateFormatted(cell)) {
						Date d = cell.getDateCellValue();
						SimpleDateFormat sim = new SimpleDateFormat("MM-dd-yy");
						String value = sim.format(d);
						System.out.print(value + " \t" +"\t"+" ");
					} else {
						double d = cell.getNumericCellValue();
						long l = (long) d;
						String value = String.valueOf(l);
						System.out.print(value+"\t"+"\t"+"\t");
					}
				}
				
			}
			
			System.out.println( " " +" "+"\t"+ " ");
		}

	}

}
