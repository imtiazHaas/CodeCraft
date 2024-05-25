package stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageActions.Dashboard_Actions;

public class Dashboard_Homepage {

	Dashboard_Actions Dashboard_ActionsObj = new Dashboard_Actions();

	@Given("^Open HAAS Alert Dashboard Homepage$")
	public void open_HAAS_Alert_Dashboard_Homepage() throws Throwable {
	   
	}

	@When("^User sign-in 'Email'$")
	public void user_sign_in_Email() throws Throwable {
		Dashboard_ActionsObj.userEmail();
	}

	@When("^User provided 'Password'$")
	public void user_provided_Password() throws Throwable {
		Dashboard_ActionsObj.userPassword();
	}
	@Then("^User should be able to sign-in to HAAS Alert Homepage$")
	public void user_should_be_able_to_sign_in_to_HAAS_Alert_Homepage() throws Throwable {
		Dashboard_ActionsObj.homepageVerification();
	}
	
}