package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class annotationsStudy {
	
	@BeforeMethod
	public void beforemethod() {
		Reporter.log("beforeMethod is running", true);;
	}
	
	
  @Test
  public void testcase1() {
	   
	  Reporter.log("TC1 is Running ", true);
  }
  
  @Test
  public void testcase2() {
	  Reporter.log("TC2",true);
  }
  
  @AfterMethod
  public void aftermethod() {
	  Reporter.log("afterMethod", true);
  }
  
  @BeforeClass
  public void beforeclass() {
	  Reporter.log("beforeclass", true);
  }
  
  @AfterClass
  public void Afterclass() {
	  Reporter.log("afterclass", true);
  }
}
