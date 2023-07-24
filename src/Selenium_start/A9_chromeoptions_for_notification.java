package Selenium_start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A9_chromeoptions_for_notification {
	
	public static void main(String []args) {
		
		
		ChromeOptions opt=new ChromeOptions();
//		opt.addArguments("start-maximized");
//	    opt.addArguments("disable-notifications");
//		opt.addArguments("incognito");
//		opt.addArguments("--headless");   //it use to get output directly in console without opening browser
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.ajio.com/");
		System.out.println(driver.getTitle());
	}

}
