package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class sample {
  @Test
  public void demo() {
	  
	  System.out.println("hi good evening-->using syso");
	  Reporter.log("hi good evening-->by using Reporter.log");
	  Reporter.log("hi good evening --->by using Reporter.log.boolean", true);
  }
}

