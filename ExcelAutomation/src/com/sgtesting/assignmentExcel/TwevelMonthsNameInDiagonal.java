package com.sgtesting.assignmentExcel;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TwevelMonthsNameInDiagonal {

	public static void main(String[] args) {
		monthsName();
	}

	private static void monthsName() {
		FileOutputStream fout = null;
		Workbook wb = null;
		Sheet sh = null;
		Row row = null;
		Cell cell = null;
		try {
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Months");
			for(int i=0; i<12; i++) {
				row=sh.createRow(i);
				for(int j=i; j<=i; j++) {
					cell= row.createCell(j);
					cell.setCellValue("months"+(i+1));
				}
			fout = new 	FileOutputStream("C:\\Users\\Bablu\\Desktop\\Excel testing by using poi\\Months.xlsx");
			wb.write(fout);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fout.close();
				wb.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
