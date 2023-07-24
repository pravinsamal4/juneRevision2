package testNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftassertionTest2 {
  @Test
  public void f() {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  SoftAssert soft=new SoftAssert();
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
	  //1st point
	  soft.assertEquals(actual,excepted, "excepted is not matching with actual");
  
	  String actualURL=driver.getCurrentUrl();
	  String expectedURL="https://www.facebook.com/";
	  
	  //2nd point
	  soft.assertEquals(actualURL,expectedURL,"actual and expected url are no" );
	  
	  soft.assertAll(); //it collect all test result
  }
  
  
}
