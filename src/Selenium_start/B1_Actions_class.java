package Selenium_start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class B1_Actions_class {
	
	public static void main (String []args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("start-maximized");
		
		WebDriver driver=new ChromeDriver(opt);
		
		
		driver.navigate().to("https://www.paytm.com");
		
		WebElement ref=driver.findElement(By.xpath("//h1[text()='Book & Buy on Paytm.']"));
		
		
		//1. create object  of Actions class and pass driver object as argument 
		     Actions act=new Actions(driver);
		
		//2. using object call one the Actions class method
		     act.scrollToElement(ref).perform();
	}	

}
