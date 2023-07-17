package PageObjectModule;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import POM.workLib;

public class Flib {
	
	//it is use to read excel file
	public String readExcelData(String excelsheet,String sheetname,int rowcount,int cellcount) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(excelsheet);
		Workbook wh = WorkbookFactory.create(fis);
		Sheet sheet = wh.getSheet(sheetname);
		Row row = sheet.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		String data = cell.getStringCellValue();
		return data;	
		}
	
	public int getLastRowCount(String excelsheet,String sheetname) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(excelsheet);
		Workbook wh = WorkbookFactory.create(fis);
		Sheet sheet = wh.getSheet(sheetname);
		int rc = sheet.getLastRowNum();
		return rc;	
	}
	
	public void writeExcelData(String excelsheet,String sheetname,int rowcount,int cellcount,String data) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(excelsheet);
		Workbook wh = WorkbookFactory.create(fis);
		Sheet sheet = wh.getSheet(sheetname);
		Row row = sheet.getRow(rowcount);
		Cell cell = row.createCell(cellcount);
		cell.setCellValue(data);
	}
	
	
	//it is use to read property file
	
	public String readPropertyFile(String propertypath,String key) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(propertypath);
		Properties pro = new Properties();
		pro.load(fis);
		String rc = pro.getProperty(key);
		return rc;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	

}
