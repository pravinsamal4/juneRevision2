package Selenium_start;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3_Dimension_point {
	public static void main (String []args) {
		
		WebDriver driver=new ChromeDriver(); 
	
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		Dimension d=new Dimension(300,200);
		driver.manage().window().setSize(d);
		
		Point p=new Point(600,50);
		driver.manage().window().setPosition(p);
		
		driver.switchTo().newWindow(WindowType.TAB);
		
	}

}
