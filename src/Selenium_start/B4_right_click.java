package Selenium_start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class B4_right_click {
	
	public static void main(String args[]) {
		
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement right=driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
		WebElement double_click=driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
		
		Actions act=new Actions(driver);
//		act.contextClick(right);
//		act.perform();
		
//		act.moveToElement(double_click).doubleClick().build().perform();
		
		act.doubleClick(double_click).perform();
		
		
	
	}

}
