package testNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class assertionTest {
  @Test
  public void f() {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  
	  String actual=driver.getTitle();
	  System.out.println(actual);
	  
	  String excepted="Facebook – log in or sign up";
//	  if (actual.equals(excepted)) {
//		  System.out.println("passed");
//
//	  }
//	  else {
//		  System.out.println("failed");
//	  }
	  
	  Assert.assertEquals(actual,excepted, "excepted is not matching with actual");
  }
  
  
}
