package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshot_of_webelement {

	public static void main(String []args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\practice_selenium\\june_practice\\chromedriver_win32 (8)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String random=RandomString.make(3);
		
//		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
		WebElement a = driver.findElement(By.xpath("//input[@name=\"email\"]"));
		File source=a.getScreenshotAs(OutputType.FILE);
		
		File destination=new File("D:\\practice_selenium\\june_practice\\screenshot\\prav"+random+".png");
		
		FileHandler.copy(source, destination);
		
	}
}
