package testNGXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
  @Test (groups = {"sanity", "regression"})
  public void Testcase1() {
	  Reporter.log("TC1 is Running", true);
	  
  }
  @Test (groups = "regression")
  public void Testcase2() {
	  Reporter.log("TC2 is Running", true);
	  
  }
  @Test (groups = "sanity")
  public void Testcase3() {
	  Reporter.log("TC3 is Running", true);
	  
  }
  @Test  (groups = "regression")
  public void Testcase4() {
	  Reporter.log("TC4 is Running", true);
	  
  }
  @Test
  public void Testcase5() {
	  Reporter.log("TC5 is Running", true);
	  
  }
  @Test
  public void Testcase6() {
	  Reporter.log("TC6 is Running", true);
	  
  }
  
}
