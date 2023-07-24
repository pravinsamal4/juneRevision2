package Selenium_start;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _A6_dropdown_Dyanamic {
		
	public static void main (String []args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		
		WebElement input=driver.findElement(By.xpath("//textarea[@id=\"APjFqb\"]"));
		input.sendKeys("honda");
		
		Thread.sleep(1000);
		
		List<WebElement> searchresult = driver.findElements(By.xpath("(//ul[@class=\"G43f7e\"])[1]"));
		
//		for(WebElement sr:searchresult) {
//			
//			System.out.println(sr.getText());  //just for printing result
//			
//			
//		}
		
		for(WebElement sr1:searchresult)
		{
//			System.out.println(sr1.getText());  //just for printing result

			String expResult="honda amaze";
			
			String actul=sr1.getText();
			if(expResult.equals(actul)) {
				
				System.out.println(sr1);
				sr1.click();
				break;
			}
			
			System.out.println(actul);
					//ones we click we go next page so we dont want to search again again 
		}
	
	}
	
	
	

}
