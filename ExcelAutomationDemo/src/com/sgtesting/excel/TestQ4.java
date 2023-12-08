package com.sgtesting.excel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestQ4 {

	public static void main(String[] args) {

		countrydispaly("UK");

	}

	private static void countrydispaly(String Country) {
		FileInputStream fin = null;
		Workbook wb = null;
		Sheet sh = null;
		Row row = null;
		Cell cell = null;

		try {
			fin = new FileInputStream("G:\\EXCEL\\CountryCapital.xlsx");
			wb = new XSSFWorkbook(fin);
			sh = wb.getSheet("Sheet1");
			int rc = sh.getPhysicalNumberOfRows();
			for (int i = 0; i < rc; i++) {
				row = sh.getRow(i);
				cell = row.getCell(0);
				String data = cell.getStringCellValue();

				if (data.equalsIgnoreCase(Country)) {
					cell = row.getCell(1);
					String data1 = cell.getStringCellValue();
					System.out.print(data1 + "        ");
				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
				wb.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
