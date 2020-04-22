package emr.practice.stepDef;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import emr.practice.actions.NewPatientActions;
import junit.framework.Assert;

public class NewPatientStepDef {
	
	
	
	NewPatientActions patientStepDef = new NewPatientActions();

	@When("^Mouse over on patient main menu$")
	public void mouse_over_on_patient_main_menu()  {
		patientStepDef.patientMenu();
	}

	@When("^Click on patient submenu$")
	public void click_on_patient_submenu()  {
		patientStepDef.pSubmenu();
	}

	@When("^Displayed iFrame$")
	public void displayed_iFrame()  {
		patientStepDef.displayiFrame1();
	}

	@When("^Click add new patient$")
	public void click_add_new_patient()  {
		patientStepDef.addPatientBtn();
		
	}

	@When("^Displayed form iFrame$")
	public void displayed_form_iFrame()  {
		patientStepDef.formiFrame();
	}

	@When("^Select initials$")
	public void select_initials()  {
		
		patientStepDef.getInitialSelect();
	}

	@When("^Input  first and last name$")
	public void input_first_and_last_name()  {
		patientStepDef.firstName();
		patientStepDef.lastName();
	}

	@When("^Select date of birth and sex$")
	public void select_date_of_birth_and_sex()  {
		patientStepDef.dateOfBirth();
		patientStepDef.gender();
	}

	@When("^Check on contact$")
	public void check_on_contact()  {
		patientStepDef.checkContact();
	}

	@When("^Enter address city postalcode$")
	public void enter_address_city_postalcode()  {
		patientStepDef.address();
		patientStepDef.city();
		patientStepDef.postalCode();
	}

	@When("^Select state$")
	public void select_state()  {
		patientStepDef.state();
		
	}

	@When("^Click add for create counrty$")
	public void click_add_for_create_counrty()  {
		patientStepDef.addCountryLink();
	}

	@When("^Enter Country name$")
	public void enter_Country_name()  {
		patientStepDef.enterCountry();
	}

	@When("^Click add button$")
	public void click_add_button()  {
		patientStepDef.addCountryBtn();
	}

	@When("^Check on choise$")
	public void check_on_choise()  {
		patientStepDef.checkChoise();
	}

	@When("^Select provider$")
	public void select_provider()  {
		patientStepDef.provider();
	}

	@When("^Check employer$")
	public void check_employer()  {
		patientStepDef.checkEmployer();
	}

	@When("^Enter employer name$")
	public void enter_employer_name()  {
		patientStepDef.employerName();
	}

	@When("^Check status$")
	public void check_status()  {
		patientStepDef.checkStatus();
	}

	@When("^Select religion$")
	public void select_religion()  {
		patientStepDef.religion();
	}

	@When("^Check misc$")
	public void check_misc()  {
		patientStepDef.checkMisc();
	}

	@When("^Input date decseased$")
	public void input_date_decseased()  {
		patientStepDef.dateDeseaces();
	}

	@When("^Check guardian$")
	public void check_guardian()  {
		patientStepDef.checkGuardian();
	}

	@When("^Select sex$")
	public void select_sex()  {
		patientStepDef.guardianSex();
	}

	@When("^Enter work phone$")
	public void enter_work_phone()  {
		patientStepDef.workPhone();
	}

	
	
	
	//And   Check Insurance
	@When("^Check Insurance$")
	public void check_Insurance()  {
		
	}

	//And   Enter plan name
	@When("^Enter plan name$")
	public void enter_plan_name()  {
		
	}

	@When("^Click on create new patient$")
	public void click_on_create_new_patient()  {
		patientStepDef.confirmPatient();
	}

	@When("^Display model frame$")
	public void display_model_frame()  {
		patientStepDef.modeliFrame();
	}

	@When("^Click confirm create new patient$")
	public void click_confirm_create_new_patient()  {
		patientStepDef.createAddnewPatient();
	}

	@Then("^I should be able to see create new patient msg$")
	public void i_should_be_able_to_see_create_new_patient_msg()  {
		patientStepDef.createMsg();
		Assert.assertEquals(patientStepDef.createMsg(), true);
	}

}
