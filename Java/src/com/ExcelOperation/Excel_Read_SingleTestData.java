package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openxmlformats.schemas.spreadsheetml.x2006.main.STSortBy;


public class Excel_Read_SingleTestData {

	public static void main(String[] args) throws IOException {
		//Identify the file in the system
		FileInputStream file = new FileInputStream("C:\\Users\\dell\\Desktop\\Thripurareddy\\Java\\src\\com\\ExcelOperation\\SingleTextData.xlsx");
		
		//Identify the workBook in the File
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		
		//Identify the Sheet in the workBook
		XSSFSheet sheet = workBook.getSheet("sheet1");
		
		//Identify the Row in the Sheet
		Row row = sheet.getRow(0);
		
		//Identify the Row of a Cell
		Cell cell = row.getCell(0);
		
		//Getting the data form the Row of a Cell
		String data = cell.getStringCellValue();
		System.out.println(data);
		
	}

}
