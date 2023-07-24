 package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.ITestNGListener;

@Listeners(listener.listenerTest.class)   //packageName.classname.class to communicate
public class myTest3 {
  @Test
  public void a()
  {
	 Reporter.log("TC a is  Running plz try again", true ); 
  }
  
  @Test
  public void b()
  {
	  Assert.fail();
	 Reporter.log("TC b		result.getName() is  Running", true ); 
  }
  
  @Test (dependsOnMethods = {"b"} )
  public void c()
  {
	 Reporter.log("TC c is  Running", true ); 
  }
  
  @Test
  public void d()
  {
	 Reporter.log("TC d is  Running", true ); 
  }
}
 