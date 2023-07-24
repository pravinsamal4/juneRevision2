package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dataproviderExapmle {
	
	
	
	
  @Test (dataProvider = "MyFBdata",dataProviderClass = testNG.myDataProvider.class)
  public void facebook(String username,String password) {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  //sending username
	  driver.findElement(By.id("email")).sendKeys(username);
	  
	  //sending passward
	  driver.findElement(By.id("pass")).sendKeys(password);
  }
}
