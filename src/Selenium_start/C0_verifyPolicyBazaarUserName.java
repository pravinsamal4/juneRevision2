package Selenium_start;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class C0_verifyPolicyBazaarUserName {
	
	public static void main(String []args) throws InterruptedException {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notifications");
		
		WebDriver driver=new ChromeDriver(opt);
		
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		
		driver.findElement(By.xpath("//a[@class=\"sign-in\"]")).click();
		Thread.sleep(1000);
		
		WebElement input=driver.findElement(By.xpath("(//input[@type=\"number\"])[2]"));
		input.sendKeys("9623153925");
		
		driver.findElement(By.xpath("(//a[@id=\"central-loggin-with-pwd\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("raju@2811");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[@class=\"cl-btn sr-btn-primary\"]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//div[text()='My Account']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		Thread.sleep(3000);

		Set<String> allwindows = driver.getWindowHandles();
	
		List<String>al=new ArrayList<>(allwindows);
		
		String homepageID=al.get(0);
		String childpageID=al.get(1);
		
		driver.switchTo().window(childpageID);
		Thread.sleep(2000);

		String actualID=driver.findElement(By.xpath("//div[@class=\"textCapitalize sc-ckVGcZ kWpXlQ\"]")).getText();
		 String expID="Rajashri Kadam";
		 
		 if (actualID.equals(expID)) {
			 System.out.println("id is matched");
		 }
		 else {
			 System.out.println("not matched");
		 }
	}

}
