package Selenium_start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2_getTitle_getCurrentUrl {
	
	public static void main (String []args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
//		System.out.println(driver.getTitle());
		
		String a=driver.getTitle();
		
		System.out.println(a);
		
		String b= driver.getCurrentUrl();
		System.out.println(b);
		
		driver.manage().window().minimize();
		driver.quit();
		
	}

}
