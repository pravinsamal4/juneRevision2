package Selenium_start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4_Locator_xpath {
	public static void main (String []args) {
		
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		
//		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("pravin");
//		WebElement username=driver.findElement(By.xpath("//input[@id='email']")); //Xpath by attribute
//		username.sendKeys("pravin");
//		
//		WebElement forgot=driver.findElement(By.xpath("//a[text()='Forgotten password?']")); //Xpath by text
//		forgot.click();
//		driver.navigate().back();
//		
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://www.facebook.com/");
//
//		driver.findElement(By.xpath("//a[contains(@data-testid,\"open\")]")).click(); //Xpath by contains
//		driver.quit();
		
		driver.get("https://www.letskodeit.com/practice");
		driver.findElement(By.xpath("//input[@id=\"bmwradiok\"]")).click();  //Xpath by attribute
		
		WebElement text=driver.findElement(By.xpath("//h1[text()=\"Practice Page\"]")); //xpath by Text
		String text1=text.getText();
		System.out.println(text1);
		String value="Practice Page";
		if (text1.equals(value)) {
			System.out.print("true");
		}
			else {
				System.out.println("not");
			}
			
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.facebook.com");
		
		WebElement contains=driver.findElement(By.xpath("//a[contains(@data-testid,'open')]"));  //Xpath by contains
		contains.click();
		
		driver.get("https://www.letskodeit.com/practice");
		driver.findElement(By.xpath("(//label[@for=\"bmw\"])[2]")).click();   //xpath by index
		
//		WebElement forgot=driver.findElement(By.linkText("Forgotten password?")); //xpath by linkText
//		forgot.click();
//		WebElement forg=driver2.findElement(By.partialLinkText("Forgotten"));
//		forg.click();
		
		
	}

}
