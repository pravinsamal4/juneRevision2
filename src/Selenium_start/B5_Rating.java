package Selenium_start;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class B5_Rating {
	
	public static void main(String args[]) throws InterruptedException {
		
		ChromeOptions act=new ChromeOptions();
		act.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(act);
		driver.get("https://www.flipkart.com/");
		
		WebElement cl=driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]"));
		cl.click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro");
		
		Thread.sleep(1000);
	driver.findElement(By.className("L0Z3Pu")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

	
	 WebElement rating = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[4]"));
	
	System.out.println(rating.getText());
	}
}
