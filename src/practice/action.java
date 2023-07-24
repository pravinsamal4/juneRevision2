package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action {

	public static void main(String[] args) {
		
//		WebDriver driver=new ChromeDriver();
		//		driver.get("https://paytm.com/");
//		driver.manage().window().maximize();
//		WebElement a=driver.findElement(By.xpath("//span[text()='Financial Tools & Calculators']"));
//		Actions opt =new Actions(driver);
//		opt.scrollToElement(a).perform();
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement alert1=driver.findElement(By.xpath("//a[text()='1']"));
		
		Actions act=new Actions(driver);
//		act.scrollToElement(alert1).click().perform();
		
		WebElement d1=driver.findElement(By.xpath("//button[text()='Copy Text']"));
		act.doubleClick(d1).perform();
	}

}
