package com.ExcelOperation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_MultipleTestData {


	private static int cellIndex;

	public static void main(String[] args) throws IOException {
    FileInputStream file1 = new FileInputStream("C:\\Users\\dell\\Desktop\\Thripurareddy\\Java\\src\\com\\ExcelOperation\\MultipleTestData.xlsx");
    XSSFWorkbook workBook= new XSSFWorkbook(file1);
    XSSFSheet sheet = workBook.getSheet("sheet1");
    int sheetRowCount = sheet.getLastRowNum();

    for(int rowIndex = 0; rowIndex<=sheetRowCount; rowIndex++) {
	int rowOfCellCount = sheet.getRow(rowIndex).getLastCellNum();
	    
	for(int cellIndex = 0; cellIndex<rowOfCellCount; cellIndex++);
      Row row = sheet.getRow(rowIndex);
      Cell rowOfCell = row.getCell(cellIndex);
      String data = rowOfCell.getStringCellValue();
     System.out.println(data+" ");
   
         } 
    System.out.println();
	}

}
