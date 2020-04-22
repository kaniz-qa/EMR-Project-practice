package emr.practice.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class EmrBeforeAction {

	
	@Before
	public static void setUp(Scenario scne) {
		System.out.println("Chromedriver initialization");
		
		EmrSetupDriver.setDriver();
		System.out.println("Chromedriver end");
		
	}
}
