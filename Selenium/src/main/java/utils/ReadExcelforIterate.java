package utils;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelforIterate {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook wb = new XSSFWorkbook("./Data/ReadData.xlsx");
		
        
		XSSFSheet sheet = wb.getSheet("MM");
		
		//int rowCount = sheet.getLastRowNum();
		//System.out.println(rowCount);
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		
		int columnCount = sheet.getRow(0).getLastCellNum();
		System.out.println(columnCount);
		
      /*XSSFRow row = sheet.getRow(2);
		
		XSSFCell cell = row.getCell(2);
		
		//String value = cell.getStringCellValue();
		double value = cell.getNumericCellValue();
		System.out.println(value);*/

		
		//Open 'for Loop' for Rows:
		
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				//String value = cell.getStringCellValue();
				String value = cell.getStringCellValue();
				System.out.println(value);
			}

		}
		
		
	}

}
