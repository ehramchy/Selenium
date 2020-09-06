package utils;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelIterate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook wb = new XSSFWorkbook("./Data/ReadData.xlsx");
		
        //XSSFSheet sheet = wb.getSheet("Sheet1");
		//XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSFSheet sheet = wb.getSheet("Sheet1");
        
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		
		int columnCount = sheet.getRow(0).getLastCellNum();
		
		System.out.println(columnCount);
		
       for (int i = 1; i <=rowCount; i++) {
		XSSFRow row = sheet.getRow(i);
		for (int j = 0; j <columnCount; j++) {
			XSSFCell cell = row.getCell(j);
			//String value = cell.getStringCellValue();
			String value = cell.getStringCellValue();
			System.out.println(value);
		}
	}
		
	}

}
