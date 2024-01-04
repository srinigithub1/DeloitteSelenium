package excelAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAutomation {

	public void readExcel(String filePath, String fileName, String sheetName) throws IOException {

		// create an object of file class to open excel file

		File file = new File(filePath + "\\" + fileName);

		// crate an object of fileinpuststream to read data

		FileInputStream inputStream = new FileInputStream(file);

		// File extendtion idetnification

		String fileExtentionName = fileName.substring(fileName.indexOf("."));

		// check file extetion

		XSSFWorkbook SauceLabWorkbook = null;
		HSSFWorkbook SauceLabWorkbook1=null;

		if (fileExtentionName.equals(".xlsx")) {

			// crate an obj of XSSFWorkBook class

			SauceLabWorkbook = new XSSFWorkbook(inputStream);

		} else if (fileExtentionName.equals(".xls")) {

			// crate an obj of XSSFWorkBook class

			SauceLabWorkbook1 = new HSSFWorkbook(inputStream);

		}

		// Read sheet from workbook

		XSSFSheet saucelabsSheet = SauceLabWorkbook.getSheet(sheetName);

		// Find no of rows in Excel

		int rowCount = saucelabsSheet.getLastRowNum() - saucelabsSheet.getFirstRowNum();

		// use looping to read tetst data

		for (int i = 0; i < rowCount + 1; i++) {
			XSSFRow row = saucelabsSheet.getRow(i);
			// create a loop to get cell value

			for (int j = 0; j < row.getLastCellNum(); j++) {
				System.out.print(row.getCell(j).getStringCellValue() + "    ");
			}

			System.out.println();

		}

	}

	// Main method to call
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// crare an obj for the current class

		ExcelAutomation objExcelAutomation = new ExcelAutomation();

//		String filePath = "E:\\testdata";
//		String fileName = "LoginTestData.xlsx";
//		String sheetName = "Sheet1";
		String filePath = "E:/";
		String fileName = "TestData.xlsx";
		String sheetName = "Sheet1";
		
		objExcelAutomation.readExcel(filePath, fileName, sheetName);

	}

}
