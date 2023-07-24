package Selenium_start;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class B7_Excel {
	
	public static void main(String args[]) throws EncryptedDocumentException, IOException {
		
		FileInputStream myfile=new FileInputStream("D:\\practice_selenium\\myTest.xlsx");
		
	
	Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
	
	
	///for Row reading
	for(int i=0; i<=2; i++) {
	String value=mysheet.getRow(0).getCell(i).getStringCellValue();
	
	System.out.println();
	}
	
	
	//for cell reading
	for(int i=0; i<=1; i++) {
		String value=mysheet.getRow(i).getCell(0).getStringCellValue();
		
		System.out.println();
		}
	
	for(int i=0; i<=1; i++) {
		//inner for loop for cell --0-2
		
		for (int j=0; j<=2; j++) {
	String value=mysheet.getRow(i).getCell(j).getStringCellValue();
	System.out.print(value=" ");
		}
		System.out.println();
	}
	}

}
