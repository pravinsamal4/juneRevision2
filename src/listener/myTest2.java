package listener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listener.listenerTest.class)   //packageName.classname.class to communicate
public class myTest2 {
  @Test
  public void w()
  {
	 Reporter.log("TC w is  Running plz try again", true ); 
  }
  
  @Test
  public void x()
  {
	  Assert.fail();
	 Reporter.log("TC x	result.getName() is  Running", true ); 
  }
  
  @Test (dependsOnMethods = {"x"} )
  public void y()
  {
	 Reporter.log("TC y is  Running", true ); 
  }
  
  @Test
  public void z()
  {
	 Reporter.log("TC z is  Running", true ); 
  }
}
 