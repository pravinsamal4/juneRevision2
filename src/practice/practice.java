package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
	
	public static void main(String []args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\practice_selenium\\june_practice\\chromedriver_win32 (8)\\chromedriver.exe");
	
	
		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
		
//		Dimension d=new Dimension(200,200);
//		driver.manage().window().setSize(d);
//		
//		Point p=new Point(200,200);
//		driver.manage().window().setPosition(p);
		
//		WebElement login=driver.findElement(By.tagName("button"));  //locator by Tagname here at time of search write only tagname ex button dont put (//) in search box of html page
		
//		driver.findElement(By.id("email")).sendKeys("pravinsamal"); //locator by ID here at time search only id value directly ex email dont put (//) in search box of html page
//		
//		driver.findElement(By.id("pass")).sendKeys("pravin");		//locator by ID here at time search only id value directly ex pass dont put (//) in search box of html page if id value is unique then use if it is check in only in id value
//		
//		driver.findElement(By.name("email")).sendKeys("solapur"); 	//locator by name here at time search only name value directly (ex-> email)  dont put (//) in search box of html page if name value is unique then use if it is check in only in id value
		
//		driver.findElement(By.className("_6ltg")).click(); 			///locater by classname ,in this we take class name of parent class  (ex-> <div class="_6ltg"> ------search only _6ltg)
		
//		driver.findElement(By.linkText("Forgotten password?")).click(); //locator by linkText search  directly text in search box 

//		WebElement forgot=driver.findElement(By.partialLinkText("Forgotten")); //locator by partialLinkText
//		forgot.click();
//		driver.manage().window().minimize();
		
		
		
	}

}
