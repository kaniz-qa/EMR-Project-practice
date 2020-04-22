package emr.practice.stepDef;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import emr.practice.actions.EmrLoginPracticeActions;
import junit.framework.Assert;

public class EmrLoginPracticeStepDef {
	
	EmrLoginPracticeActions emrLoginActions = new EmrLoginPracticeActions();

	@Given("^I navigated to emr login page$")
	public void i_navigated_to_emr_login_page() throws Exception {

		String actualTitle = emrLoginActions.emrLoginPage();
		// Assert.assertEquals(acttualTitle, expected);
		System.out.println(actualTitle);
		emrLoginActions.getscreenshotLogo();
	}
	
	
	@When("^I entered wrong \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_entered_wrong_and(String admin, String pass) throws IOException {
		emrLoginActions.getExcelData();
		//emrLoginActions.setUserID(admin);
		//emrLoginActions.setPassword(pass);
	}

	
	@When("^I select language$")
	public void i_select_language() {
		emrLoginActions.setLanguage();
	}
	
	@When("^I click on login$")
	public void i_click_on_login() {
		emrLoginActions.loginClick();

	}
	
	@Then("^I should receive error message$")
	public void i_should_receive_error_message()  {
		boolean msg = emrLoginActions.errMsg();
		Assert.assertEquals(msg, true);
	}
	
	@When("^I entered correct \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_entered_correct_and(String admin, String pass) {

		emrLoginActions.setUserID(admin);
		emrLoginActions.setPassword(pass);
	}

	

	@Then("^I am on EMR home page$")
	public void i_am_on_EMR_home_page() throws Exception {
		emrLoginActions.patientText();
		emrLoginActions.getscreenshot();
	}
  
	
}
