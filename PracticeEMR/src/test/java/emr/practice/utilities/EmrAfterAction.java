package emr.practice.utilities;

import cucumber.api.java.After;

public class EmrAfterAction {

	
	@After
	public static void afterAct() {
		EmrSetupDriver.teardown();
		System.out.println("end---end--end---");
	}
}
