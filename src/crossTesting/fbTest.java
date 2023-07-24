package crossTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class fbTest {
	
	@Parameters ("browserName")
	@Test
  public void fb(String bname) {
		WebDriver driver = null;
		
		if(bname.equals("chrome")) {
			 driver=new ChromeDriver();
		}
		else if(bname.equals("firefox")) {
			 driver=new FirefoxDriver();
		}
		driver.get("https://www.facebook.com");
		
	
		
  }
}
