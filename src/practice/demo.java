package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
//		WebDriver driver=	openbrowser.openbrowser("http://demo.automationtesting.in/Frames.html");

//		WebElement s=driver.findElement(By.xpath("//iframe[@name='SingleFrame']"));
//
//		driver.switchTo().frame(s);                                  ///by webElement
//		//driver.switchTo().frame("singleframe");   ///By ID
//
//
//		WebElement a=driver.findElement(By.xpath("(//input[@type=\"text\"])[1]"));
//		a.sendKeys("pravin");



		WebElement mul=driver.findElement(By.xpath("//a[@aria-expanded=\"true\"]"));
		mul.click();
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		
		WebElement i2=driver.findElement(By.xpath("(//input[@type=\"text\"])[2]"));
		i2.sendKeys("samal");
			}
		}

