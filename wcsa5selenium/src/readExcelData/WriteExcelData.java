package readExcelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Write data in excel sheet
		FileInputStream fis = new FileInputStream("./data/IPL.xlsx");
		Workbook wh = WorkbookFactory.create(fis);
		Sheet sheet = wh.getSheet("IPL");
	//	Row row = sheet.getRow(11);
		Row row = sheet.createRow(12);
		
		//create a cell by  using row
		Cell cell = row.createCell(0);
		
		//write the data into cell
		cell.setCellValue("pune");
		
		FileOutputStream fos = new FileOutputStream("./data/IPL.xlsx");
		wh.write(fos);
		
		

	}

}
