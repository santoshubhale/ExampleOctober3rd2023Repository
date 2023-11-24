package com.sgtesting.assignmentExcel;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TwentyFruitNamesFirstSheetTenthRow {

	public static void main(String[] args) {
		// fruitsName();
		fruitsNameAnother();
	}

	private static void fruitsName() {
		FileOutputStream fout = null;
		Workbook wb = null;
		Sheet sh = null;
		Row row = null;
		Cell cell = null;
		try {
			wb = new XSSFWorkbook();
			sh = wb.createSheet("Friuts name");

			row = sh.createRow(9);
			for (int i = 0; i < 20; i++) {
				cell = row.createCell(i);
				cell.setCellValue("Friuts " + (i + 1));
			}

			fout = new FileOutputStream("C:\\Users\\Bablu\\Desktop\\Excel testing by using poi\\Friuts.xlsx");
			wb.write(fout);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fout.close();
				wb.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// Another Aproch
	private static void fruitsNameAnother() {
		FileOutputStream fout = null;
		Workbook wb = null;
		Sheet sh = null;
		Row row = null;
		Cell cell = null;
		try {
			wb = new XSSFWorkbook();
			sh = wb.createSheet("Friuts name");
			String str[] = { "Apple", "mango", "Orange", "pineaple", "Starfruit", "jackfruit", "mosambi", "graphs",
					"cherry" };
			row = sh.createRow(9);
			for (int i = 0; i < str.length; i++) {
				cell = row.createCell(i);
				cell.setCellValue(str[i] );
			}

			fout = new FileOutputStream("C:\\Users\\Bablu\\Desktop\\Excel testing by using poi\\Friuts.xlsx");
			wb.write(fout);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fout.close();
				wb.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
