package testNGXML;
import org.testng.Reporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class flipkart {
  @Test
  public void flipkart() {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
  }
}
