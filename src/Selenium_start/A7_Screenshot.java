package Selenium_start;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class A7_Screenshot {
	
	public static void main (String []args) throws IOException, AWTException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		String random=RandomString.make(4);   //to save multiple screenshot
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		File destination=new File("D:\\practice_selenium\\june_practice\\screenshot\\pravin"+random+".png");
		FileHandler.copy(source, destination);
		
//		Robot robot=new Robot();
//		Rectangle rect=new Rectangle();
//		robot.createScreenCapture(null)
	}

}
