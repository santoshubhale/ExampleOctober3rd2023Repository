package com.sgtesting.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAndWriteDemo {

	public static void main(String[] args) {
		readandwrite();

	}
	private static void readandwrite()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh1=null;
		Sheet sh2=null;
		Row rowsh1=null;
		Row rowsh2=null;
		Cell cellsh1=null;
		Cell cellsh2=null;
		FileOutputStream fout=null;


		try {
			fin=new FileInputStream("D:\\EXCEL\\Data.xlsx");
			wb=new XSSFWorkbook(fin);
			sh1=wb.getSheet("Sheet1");
			sh2=wb.getSheet("Sheet2");
			if(sh2==null)
			{
				sh2=wb.createSheet("Sheet2");
			}
			int rc=sh1.getPhysicalNumberOfRows();
			for(int r=0;r<rc;r++)
			{
				rowsh1=sh1.getRow(r);
				rowsh2=sh2.getRow(4);
				if(rowsh2==null)
				{
					rowsh2=sh2.createRow(4);
				}
				int cc=rowsh1.getPhysicalNumberOfCells();
				cellsh1=rowsh1.getCell(0);
				cellsh2=rowsh2.getCell(r);
				if(cellsh2==null)
				{
					cellsh2=rowsh2.createCell(r);
				}
				String data=cellsh1.getStringCellValue();
				cellsh2.setCellValue(data);
			}
			fout=new FileOutputStream("D:\\EXCEL\\Data.xlsx");
			wb.write(fout);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				fin.close();
				wb.close();
				fout.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
