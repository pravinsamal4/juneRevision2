package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class try1 {
	
	public static void main(String []args) {
		
//		System.setProperty("webdriver.chrome.driver", "F:\\selenium_project\\selenium_jar_chromedriver_exe\\chromedriver_win32 (7)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
//		driver.switchTo().newWindow(WindowType.TAB);
		
//		driver.navigate().to("https://google.com");
		
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		driver.manage().window().minimize();
//		driver.manage().window().maximize();
		
//		WebElement a=driver.findElement(By.id("APjFqb"));
//		a.sendKeys("sdv");
		
		WebElement b=driver.findElement(By.xpath("//button[@name=\"login\"]"));
		System.out.println(b.isDisplayed());
		
		
	} 

}
