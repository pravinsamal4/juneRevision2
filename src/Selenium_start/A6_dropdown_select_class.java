package Selenium_start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A6_dropdown_select_class {
	
	public static void main(String []args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
	
//		driver.findElement(By.xpath("//a[contains(@id,\"u_0_0_\")]")).click();
//
//		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("adcv");
//		WebElement asd=driver.findElement(By.id("day"));
//		
//		Select obj=new Select(asd);
////		obj.selectByValue("may");
//		obj.selectByIndex(1);
		
		WebElement a=driver.findElement(By.xpath("//select[@id=\"carselect\"]"));
		
		Select b=new Select(a);
		//b.selectByIndex(1);
//		b.selectByValue("honda");
		Thread.sleep(2000);
		b.selectByVisibleText("Honda");
		
	}

}
