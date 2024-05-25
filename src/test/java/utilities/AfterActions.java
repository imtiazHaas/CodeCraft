package utilities;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class AfterActions {
	
	TakeScreenshots TakeScreenshotsObj = new TakeScreenshots();
	
	@After
	public void afterActions(Scenario Scenario) throws Exception{
		
		if(Scenario.isFailed()){
			TakeScreenshotsObj.screenshots();
		}
		
		SetupDrivers.tearDownDriver();
		System.out.println(" ------Test Complete, Browser Closed ");
	}
}