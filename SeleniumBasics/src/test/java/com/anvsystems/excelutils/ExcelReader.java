package com.anvsystems.excelutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream(new File("./data/testdata.xlsx"));
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheet("Persons");
			int lastRowNumber = sheet.getLastRowNum();
//			System.out.println(lastRowNumber);
			for(int i = 0; i<=lastRowNumber; i++) {
				XSSFRow row = sheet.getRow(i);
				int lastCellNumber = row.getLastCellNum();
//				System.out.println(lastCellNumber);
				for (int j = 0; j<lastCellNumber; j++) {
					XSSFCell cell = row.getCell(j);
					System.out.println(cell.getStringCellValue());
				}
				
			}
//			XSSFSheet sheet = wb.getSheet("Sheet1");
//			String data = sheet.getRow(0).getCell(2).getStringCellValue();
//			System.out.println(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
