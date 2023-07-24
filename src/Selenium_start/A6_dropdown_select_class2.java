package Selenium_start;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A6_dropdown_select_class2 {
	
	public static void main(String args[]) {
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfacebook%20signin%7C&placement=&creative=589460569891&keyword=facebook%20signin&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-3821998899%26loc_physical_ms%3D1007790%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwkLCkBhA9EiwAka9QRqvyL-uWF8zW1DNjp4qF_eQsjttGMScRcIfjoutlKCeyhmRUez4_ixoCI54QAvD_BwE");
		driver.manage().window().maximize();
		
		WebElement day = driver.findElement(By.id("day"));
		
		Actions act=new Actions(driver);
		
//		act.click(day).sendKeys(Keys.ARROW_UP).build().perform();
//		act.sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).sendKeys(Keys.ARROW_UP).build().perform();
//		act.sendKeys(Keys.ENTER).perform();
		
		///***OR***///
		
		act.sendKeys(day, Keys.ARROW_UP, Keys.ARROW_UP, Keys.ARROW_UP, Keys.ARROW_UP, Keys.ARROW_UP, Keys.ARROW_UP,Keys.ENTER ).perform();
		
		
	}

}
