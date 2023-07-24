package policyBazaar;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PV_TC_123_validateUserName {
	
	public static void main(String []args) throws InterruptedException {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver =new ChromeDriver(opt);
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		
		//create objects of pom classes
		
		homepage home=new homepage(driver);
		Thread.sleep(1000);
		home.clickonsignbutton();
		Thread.sleep(1000);
		home.enterNumber();
		Thread.sleep(1000);
		home.clickonpassword();
		Thread.sleep(1000);
		home.enterpassword();
		Thread.sleep(1000);
		home.clickOnSignIn();
		Thread.sleep(1000);
		home.clickmyAccount();
		Thread.sleep(1000);
		home.clickmyprofile();
		Thread.sleep(1000);
		
		
		//handle new Window
		
		Set<String>al=driver.getWindowHandles();
		List<String>l=new ArrayList<>(al);
		
		String childwindowIDl = l.get(1);
		
		driver.switchTo().window(childwindowIDl);
		
		//new web page 
		
		profilepage pro=new profilepage(driver);
		Thread.sleep(1000);
		pro.validateusername();
		Thread.sleep(1000);
		pro.clickonlogout();
		Thread.sleep(1000);
		driver.quit();
	}
	

}
