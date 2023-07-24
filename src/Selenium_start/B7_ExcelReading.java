package Selenium_start;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class B7_ExcelReading {
	public static void main(String []args) throws EncryptedDocumentException, IOException {
		
		 FileInputStream file=new FileInputStream("D:\\practice_selenium\\myTest.xlsx");
		 
//		 String a=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
//		System.out.println(a);
		
		 
		Sheet mySheet = WorkbookFactory.create(file).getSheet("sheet1");
		
	Row myRow = mySheet.getRow(3);
	
	Cell myCell = myRow.getCell(1);
	
//System.out.println(	myCell.getCellType());	 //to know which dataType
//	String value1=mySheet.getRow(1).getCell(1).getStringCellValue();
//	double value2=mySheet.getRow(3).getCell(1).getNumericCellValue();
//	boolean value3 = mySheet.getRow(3).getCell(1).getBooleanCellValue();
//	
//	System.out.println(value3);

	}
}
 