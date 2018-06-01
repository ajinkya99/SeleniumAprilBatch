package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	XSSFWorkbook wb;
	
	public ExcelReader() 
	{
		try {
			wb = new XSSFWorkbook(new FileInputStream(new File("./ExcelFile/testdata.xlsx")));
		} catch (Exception e) {
			
			System.out.println("Not able to load Excel File");
		} 
	}

	public String getData(String sheetName,int row,int column)
	{
		return wb.getSheet(sheetName).getRow(row).getCell(column).getStringCellValue();
	}
	
	public String getData(int sheetIndex,int row,int column)
	{
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	}
	
	public double getNumericData(String sheetName,int row,int column)
	{
		return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
	}
	
	public double getNumericData(int sheetIndex,int row,int column)
	{
		return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getNumericCellValue();
	}
	
	public int getNumberOfRows(String sheetName)
	{
		return wb.getSheet(sheetName).getPhysicalNumberOfRows();
	}
	
	public int getNumberOfRows(int sheetIndex)
	{
		return wb.getSheetAt(sheetIndex).getPhysicalNumberOfRows();
	}
	
	
}