package Selenium_start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class B3_dragAnddrop_by_actions {

	public static void main(String[] args) {
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement source=driver.findElement(By.id("draggable"));
		
		WebElement dest = driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(dest).perform();
//		act.clickAndHold(source).moveToElement(dest).release().build().perform();

		act.dragAndDrop(source, dest).perform();       //by directly method4444444444444444
		
		
		
		}

}
