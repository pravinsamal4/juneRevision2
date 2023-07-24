 package Selenium_start;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A8_iframe {
	
	public static void main(String []args) { 
		
//		WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//		driver.get("https://demo.automationtesting.in/Frames.html");
//		driver.switchTo().frame("singleframe");   //iframe by id
//		
//		driver.findElement(By.xpath("(//input[@type=\"text\"])")).sendKeys("acac");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
//		driver.switchTo().frame(0);///iframe by index
//		
//		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("pravin");
		
		WebElement f1=driver.findElement(By.xpath("//iframe[@id=\"singleframe\"]"));
		
		
		driver.switchTo().frame(f1);
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("pravin");

	driver.switchTo().defaultContent();
	
	WebElement second=driver.findElement(By.xpath("(//a[@class=\"analystic\"])[2]"));
	second.click();
	
	driver.switchTo().frame(0);
	WebElement mul=driver.findElement(By.xpath("//iframe[@src=\"SingleFrame.html\"]"));
	driver.switchTo().frame(mul);
//	driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")) .sendKeys("adf");
	}

}
