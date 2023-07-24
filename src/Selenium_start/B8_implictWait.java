package Selenium_start;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B8_implictWait {
	
	public static void main (String agrs[]) {
			 
		WebDriver driver=new ChromeDriver(); 
		
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  ///this we is previous  
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
	}
}
