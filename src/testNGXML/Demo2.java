package testNGXML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
  @Test (groups = "regression")
  public void Testcase7() {
	  Reporter.log("TC7 is Running", true);
	  
  }
  @Test
  public void Testcase8() {
	  Reporter.log("TC8 is Running", true);
	  
  }
  @Test 
  public void Testcase9() {
	  Reporter.log("TC9 is Running", true);
	  
  }
  @Test (groups = "sanity")
  public void Testcase10() {
	  Reporter.log("TC10 is Running", true);
	  
  }
  @Test (groups = "sanity")
  public void Testcase11() {
	  Reporter.log("TC11 is Running", true);
	  
  }
  @Test (groups = "sanity")
  public void Testcase12() {
	  Reporter.log("TC12 is Running", true);
	  
  }
  
}
