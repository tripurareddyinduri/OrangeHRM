package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write_Data {
public static void main(String[] args) throws IOException {
	//Identify the file in the system
	FileInputStream file = new FileInputStream("C:\\Users\\dell\\Desktop\\Thripurareddy\\Java\\src\\com\\ExcelOperation\\SingleTextData.xlsx");
	//Identify the workBook in the File 
	XSSFWorkbook workBook = new XSSFWorkbook(file);
	//Identify the sheet in the workBook
	XSSFSheet sheet = workBook.getSheet("sheet1");
	//Creating a Row in the Sheet
	Row row = sheet.createRow(2);
	// In the Row created - create a Cell
	Cell cell = row.createCell(3);
	// set the value into the Row of a Cell Created
	cell.setCellValue("Guru");
	// The Excel File with WorkBook Should be saved
	FileOutputStream file1 = new FileOutputStream("C:\\Users\\dell\\Desktop\\Thripurareddy\\Java\\src\\com\\ExcelOperation\\SingleTextData.xlsx");
	workBook.write(file1);
	
	
}
}
