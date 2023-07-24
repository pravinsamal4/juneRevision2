package Selenium_start;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class B7_ecelDynamic {
	
	public static void main(String []args) throws EncryptedDocumentException, IOException {
		FileInputStream myfile=new FileInputStream("D:\\practice_selenium\\myTest.xlsx");
		
	Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
	
		int lastRow = mysheet.getLastRowNum();
		
		System.out.println(lastRow);
		int totalNumberofRow=lastRow; //i
		
		short lastcellNum = mysheet.getRow(0).getLastCellNum();	
			
		System.out.println(lastcellNum);
		
		int totalNumofColumns=lastcellNum-1;  //j
		
		
		for(int i=0; i<=totalNumberofRow; i++) {
			
			for (int j=0; j<=totalNumofColumns; j++) {
				String value=mysheet.getRow(i).getCell(j).getStringCellValue();
			
			System.out.print(value+ " ");
			}
			System.out.println();
		}
		
	}

}
