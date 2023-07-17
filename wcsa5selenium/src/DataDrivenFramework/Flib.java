package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	   
	         // to store generic reusable method
	         //all the methods are non static
	
	//it is use to read the data from excel sheet

	
	public String readExcelData(String excelPath,String sheetName,int rowcount,int cellcount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelPath);  //provide the path of file
		Workbook wh = WorkbookFactory.create(fis);             //make the file for ready to read
		Sheet sheet = wh.getSheet(sheetName);                  //get into the sheet
	    Row row = sheet.getRow(rowcount);                      //get into the desired row
	   Cell cell = row.getCell(cellcount);                     // get into the desired cell/column
	   String data = cell.getStringCellValue();                //read the value from cell
	   return data;
	   
	}
	
	//it is use to get last count of row where we store data
	
	public int getLastRowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(excelPath); //provide the path of file
		Workbook wh = WorkbookFactory.create(fis);            //make the file for ready to read
	    Sheet sheet = wh.getSheet(sheetName);                 //get into the sheet
		int num = sheet.getLastRowNum();                      //read the last row count
	    return num;
	}	
	
	// it is use to write the data into excel sheet
	
	public void writeExcelData(String excelPath,String sheetName,int rowcount,int cellcount,String data) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(excelPath); //provide the path of file
		Workbook wh = WorkbookFactory.create(fis);            //make the file for ready
		Sheet sheet = wh.getSheet(sheetName);                 //get into the sheet
        Row row = sheet.getRow(rowcount);		              //pass the row count
        Cell cell = row.createCell(cellcount);                //pass the cell count
        cell.setCellValue(data);                              //pass the string argument as data
        
       FileOutputStream fis1 = new FileOutputStream(excelPath);
       wh.write(fis1);
        
}
	
}































