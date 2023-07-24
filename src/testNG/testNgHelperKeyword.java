package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testNgHelperKeyword {
  @Test(invocationCount =3 )
  public void testcase1() {
	  
	  Reporter.log("TC1 is running", true) ;
  }
  
  @Test(priority = 1 )
  public void testcase2() {
	  
	  Reporter.log("TC2 is running", true) ;
  }
  
  @Test(enabled = false )
  public void testcase3() {
	  
	  Reporter.log("TC3 is running", true) ;
  }
  
  @Test(enabled = false ,priority = 0 )
  public void testcase4() {
	  
	  Reporter.log("TC4 is running", true) ;
  }
  @Test(timeOut = 100 )
  public void testcase5() throws InterruptedException {
	  Thread.sleep(200);
	  Reporter.log("TC4 is running", true) ;
  }
  
  @Test(dependsOnMethods = {"testcase5"})
  public void testcase6() {
	  
	  Reporter.log("TC6 is running", true) ;
  }
}
