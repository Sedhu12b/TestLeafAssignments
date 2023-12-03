package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataLibrary {
	
	@Test
	public static String[][] readData(String TestDataFileName) throws IOException{
		
		XSSFWorkbook xlworkbook = new XSSFWorkbook("./Data/"+TestDataFileName+".xlsx");
		XSSFSheet xlSheet = xlworkbook.getSheet("Sheet1");
		int rc = xlSheet.getLastRowNum();
		int cc = xlSheet.getRow(0).getLastCellNum();
		
		String[][] testData = new String[rc][cc];
		for (int i = 1; i <=rc; i++) {
			
			for (int j = 0; j < cc; j++) {				
				String stringCellValue = xlSheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println("CellText"+stringCellValue);
				testData[i-1][j] = stringCellValue;				
				
			}
			
		}
		xlworkbook.close();
		
		return testData;
		
	}

}
