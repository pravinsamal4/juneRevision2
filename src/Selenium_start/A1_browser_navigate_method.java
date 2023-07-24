package Selenium_start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_browser_navigate_method {
	
	public static void main (String []args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\practice_selenium\\june_practice\\chromedriver_win32 (8)\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://google.com");
	driver.switchTo().newWindow(WindowType.TAB);
	driver.navigate().to("https://facebook.com");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
	}

}
