package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook wb = new XSSFWorkbook("./Data/ReadData.xlsx");
		
           
		XSSFSheet sheet = wb.getSheet("BB");
		
		XSSFRow row = sheet.getRow(0);
		
		XSSFCell cell = row.getCell(1);
		
		String value = cell.getStringCellValue();
		System.out.println(value);
		
		
	}

}
