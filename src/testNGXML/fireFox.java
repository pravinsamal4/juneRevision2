package testNGXML;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class fireFox {
  @Test
  public void fireFox() {
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://myaccount.policybazaar.com/");
  }
}
