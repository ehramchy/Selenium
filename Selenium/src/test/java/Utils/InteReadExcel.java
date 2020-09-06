package Utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class InteReadExcel {

	//public static void main(String[] args) throws IOException {
	public String[][] readexl() throws IOException {
		//Open Enter into workbook
		XSSFWorkbook wb = new XSSFWorkbook("./Data/ReadData.xlsx");
		
       //Get Sheet 
		//XSSFSheet sheet = wb.getSheet("BB");
		XSSFSheet sheet = wb.getSheetAt(3);
		
		
			//Row Count
			int rowCount = sheet.getLastRowNum();
			System.out.println(rowCount);
			//ColumnCount
			short columnCount = sheet.getRow(0).getLastCellNum();
			System.out.println(columnCount);
			
			//Open 'for loop' for rows(this loop enter into the each row)
			
			String[][] data = new String[rowCount][columnCount];
			
			for (int i = 1; i <=rowCount; i++) {				//Get Row
				XSSFRow row = sheet.getRow(i);
				
				//open 'for loop' for column (this loop enter into every column)
				
				for (int j = 0; j <columnCount; j++) {
					//Get column
					XSSFCell cell = row.getCell(j);
					
					//Actions Readvalue
					String value = cell.getStringCellValue();
					System.out.println(value);
					
					data[i-1][j] = value;
					
					
				}//End row
				
			}//End column
			
			return data;
		}

	}


