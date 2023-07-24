package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2_childbrowser_popup {
	
//	public static void main(String[] args) {
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://vctcpune.com/");
//		
//		WebElement c=driver.findElement(By.xpath("(//a[text()=\"Start Selenium Practice\"])[1]"));
//		c.click();
//		
//	Set<String> pop=	driver.getWindowHandles();
//	Iterator<String> i=pop.iterator();
//	while(i.hasNext()) {
//		driver.switchTo().window(i.next());
//		System.out.println(driver.getTitle());
//	}
//	}
	
	public static void main(String []args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		WebElement newtab=driver.findElement(By.name("NewTab"));
		newtab.click();
		newtab.click();
		
		Set<String> add = driver.getWindowHandles();
		List<String> l=new ArrayList<>(add);
		String second=l.get(2);
		driver.switchTo().window(second);
		driver.manage().window().maximize();
		
	}

	
}
