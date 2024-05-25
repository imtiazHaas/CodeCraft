package pageActions;

import org.openqa.selenium.support.PageFactory;
import pageElements.Dashboard_Elements;
import utilities.SetupDrivers;

public class Dashboard_Actions {

	Dashboard_Elements Dashboard_ElementsObj;

	public Dashboard_Actions(){
		Dashboard_ElementsObj = new Dashboard_Elements();
		PageFactory.initElements(SetupDrivers.driver, Dashboard_ElementsObj);
	}
	
	public void userEmail(){
		Dashboard_ElementsObj.userEmail.sendKeys("imtiaz@haasalert.com");
	}
	
	public void userPassword(){
		Dashboard_ElementsObj.passWord.sendKeys("newTest21!");
	}
	
	public void homepageVerification(){
		Dashboard_ElementsObj.homePage.isDisplayed();
	}
	
}
