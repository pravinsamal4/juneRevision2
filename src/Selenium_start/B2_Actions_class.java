package Selenium_start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class B2_Actions_class {
	
	public static void main(String []args) {
		
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("start-maximized");
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
//		WebElement al=driver.findElement(By.xpath("//button[text()='Alert']"));
		
		
		//1. Create an object of actions class and pass driver object as a parameter
		Actions act=new Actions(driver);
		
		//2. use required action 
//		act.moveToElement(al).click().build().perform();               //by click by action 
		
//		act.click(al).perform();													//by click by webelement			
	
//		WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Copy Text']"));
//		act.doubleClick(doubleclick).build().perform();
		
		
	}

}
