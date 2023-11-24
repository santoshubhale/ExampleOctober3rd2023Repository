package com.sgtesting.assignmentExcel;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TwentyFlowerNamesFirstSheetFirstColumn {

	public static void main(String[] args) {
		WriteContent();

	}
	private static void WriteContent() {
		
		FileOutputStream fout = null;
		Workbook wb=null;
		Sheet sh = null;
		Row row = null;
		Cell cell = null;
		
		try {
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Flowers name");
			// 1st row object
			for(int i=0; i<20; i++) {
			row=sh.createRow(i);
			cell=row.createCell(0);
			cell.setCellValue("flower"+(i+1));
			}
			fout = new FileOutputStream("C:\\Users\\Bablu\\Desktop\\Excel testing by using poi\\Flowers.xlsx");
			wb.write(fout);
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fout.close();
				wb.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
