package Selenium_start;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class paytm {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://paytm.com");
		driver.manage().window().maximize();
		
		B9_Comman_method.waitTime(1000);
		WebElement t1=
				driver.findElement(By.xpath("//h1[text()=\"Book & Buy on Paytm.\"]"));
		 
		
		B9_Comman_method.scrollingview(driver, t1);
		B9_Comman_method.screenShot(driver, "paytmTest");
		
		
	}

}
