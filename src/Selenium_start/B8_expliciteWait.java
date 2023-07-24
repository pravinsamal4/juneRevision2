package Selenium_start;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class B8_expliciteWait {
	
	public static void main(String []ARGS) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.discoveryplus.in/");
		
		WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(10000) );
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h6[text()='Sign In'])[2]")));
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		 
	}

}
