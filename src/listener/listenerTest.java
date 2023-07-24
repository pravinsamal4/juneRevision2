package listener;

import org.testng.ITest;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class listenerTest implements ITestListener {

	
	//listener is class and itest   is interface relation in bteween is impliment

	@Override
	public void onTestFailure(ITestResult result) {
	
		String R=result.getName();    ///getName is give name of failed testcase
		Reporter.log("TC "+R+" is Failled", true);
	
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		

		Reporter.log("TC "+result.getName()+" is Success", true);

	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
	
		Reporter.log("TC "+	result.getName()+" is Skiped", true);
	}
	
	
}
