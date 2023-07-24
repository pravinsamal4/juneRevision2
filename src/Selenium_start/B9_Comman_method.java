package Selenium_start;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class B9_Comman_method {
	public static void main (String args[]) {
		
		//wait
		//scrolling
		//screenshot
		//dataReading
	}
		public static void waitTime(long waittime) throws InterruptedException {
			Thread.sleep(waittime);
		}
		
		//scrolling 
		
		public  static void scrollingview(WebDriver driver, WebElement element) {	//webdriver driver is not present so we taken local driver
			
			((JavascriptExecutor)driver).executeAsyncScript("arguments[0].scrollIntoView(true)", element);
			
		}
		
		
		//screenshot
		
		public static void screenShot(WebDriver driver, String screenshotname) throws IOException {
			String random=RandomString.make(4);

		File srcd=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("D:\\practice_selenium\\june_practice\\screenshot"+screenshotname+random+".png");		
		FileHandler.copy(srcd, des);	
		}
		
		public static String readData(int row,int cell) throws EncryptedDocumentException, IOException {
			
			FileInputStream myfile=new FileInputStream("D:\\practice_selenium\\myTest.xlsx");
						
			Sheet mysheet = WorkbookFactory.create(myfile).getSheet("sheet1");
			
			String myvalue=mysheet.getRow(row).getCell(cell).getStringCellValue();
			return myvalue;
		
			
		}
		
		
		
		
	}


