package Selenium_start;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B6_childBrowser_popup {

	public static void main(String args[]) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.findElement(By.name("NewTab")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		List<String> l=new ArrayList<>(allWindows);
		String mainWIndowID=l.get(0);
		String childWindowID=l.get(1);
		
		driver.switchTo().window(childWindowID);
		driver.manage().window().maximize();
		driver.quit();
	}
}
