package AssignmentPackage_2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		  //provide the path of file
		  FileInputStream fis = new FileInputStream("./data/TestData.xl");
		  
		  //make the file for ready to read
		  Workbook wh = WorkbookFactory.create(fis);
		  
		  //get into the sheet
		  Sheet sheet = wh.getSheet("IPL");
		  
		  //get into the desired row
		  Row row = sheet.getRow(1);
		  
		  //get into the desired cell or column
		  Cell cell = row.getCell(1);
		  
		  //read the data from cell
		  String data = cell.getStringCellValue();
		     
		  System.out.println(data);
		  
		
		
		}

	}


