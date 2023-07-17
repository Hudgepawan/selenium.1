package POM;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class flib {

	public String readExcelData(String excelPath,String sheetName,int rowcount,int cellcount) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wh = WorkbookFactory.create(fis);
		Sheet sheet = wh.getSheet(sheetName);
		Row row = sheet.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		String data = cell.getStringCellValue();
		return data;
	}

	public int getLastRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException {


		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wh = WorkbookFactory.create(fis);
		Sheet sheet = wh.getSheet(sheetName);
		int rc = sheet.getLastRowNum();
		return rc;
	}

	public void WriteExcelData(String excelPath,String sheetName,int rowcount,int cellcount,String data) throws EncryptedDocumentException, IOException {

		//it is use use to write a data in excel sheet 
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wh = WorkbookFactory.create(fis);
		Sheet sheet = wh.getSheet(sheetName);	
		Row row = sheet.getRow(rowcount);
		Cell cell = row.createCell(cellcount);
		cell.setCellValue(data);

		FileOutputStream fis1 = new FileOutputStream(excelPath);
		wh.write(fis1);
	}

	// it is use to read the data from property file

	public String readPropertyData(String PropertyPath,String key) throws IOException {

		FileInputStream fis = new FileInputStream(PropertyPath);//provide the path of excel sheet
		Properties prop = new Properties();        //create a object of properties class
		prop.load(fis);
		String data = prop.getProperty(key);       // read the Perticular key from file
		return data;
	}

}
