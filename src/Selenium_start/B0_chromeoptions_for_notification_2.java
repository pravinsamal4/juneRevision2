package Selenium_start;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class B0_chromeoptions_for_notification_2 {
	
	
	public static void main (String []args) {
		
		ChromeOptions opt=new ChromeOptions();
		
		//for multiple argument
		
		
		List<String>al =new ArrayList<>(); 
		al.add("start-maximized");
		al.add("disable-notifications");
		al.add("incognito");
		opt.addArguments(al);
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.ajio.com/");
		System.out.println(driver.getTitle());
	}
}
