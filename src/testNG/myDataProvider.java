package testNG;

import org.testng.annotations.DataProvider;

public class myDataProvider {

	@DataProvider(name="MyFBdata")
		
		public static String[][] fetchdata() {
			
			String credentials[][]= {{"pune","pune"},{"solapur","sol;apur"},{"mumbai","mumbai"}};
			return credentials;
		}
	}

