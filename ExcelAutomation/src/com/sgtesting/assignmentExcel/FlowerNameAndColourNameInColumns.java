package com.sgtesting.assignmentExcel;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FlowerNameAndColourNameInColumns {

	public static void main(String[] args) {
		flowerAndColour();
	}

	private static void flowerAndColour() {
		FileOutputStream fout=null;
		Workbook wb = null;
		Sheet sh = null;
		Row row = null;
		Cell cell = null;
		try {
			wb = new XSSFWorkbook();
			sh = wb.createSheet("Flower and Colour");
			for (int i = 0; i < 20; i++) {
				row = sh.createRow(i);
				cell = row.createCell(0);
				cell.setCellValue("Fruits name" + (i + 1));
				cell = row.createCell(1);
				cell.setCellValue("colour name" + (i + 1));

			}
			

			
			fout= new FileOutputStream("C:\\Users\\Bablu\\Desktop\\Excel testing by using poi\\Flower and colours.xlsx");
			wb.write(fout);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
