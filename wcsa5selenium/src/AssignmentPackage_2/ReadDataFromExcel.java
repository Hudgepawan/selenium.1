package AssignmentPackage_2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		    
		    FileInputStream fis = new FileInputStream("./data/TestData.xl");//provide the path of file
		  Workbook wh = WorkbookFactory.create(fis);//make the file for ready to read
		  Sheet sheet = wh.getSheet("IPL");
		  Row row = sheet.getRow(2);                //get into the desired row
		  Cell cell = row.getCell(1);               //get into the desired cell/column
		  String data = cell.getStringCellValue();  // to read the data from cell
		  
		  Thread.sleep(2000);
		  System.out.println(data);
		  

	}

}
