package emr.practice.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import emr.practice.elements.NewPatientElements;
import emr.practice.utilities.EmrSetupDriver;

public class NewPatientActions {

	
	NewPatientElements patientActions;
	
	public NewPatientActions() {
		this.patientActions = new NewPatientElements( );
		PageFactory.initElements(EmrSetupDriver.driver , patientActions);
	}
	
	
	
	public String emrLoginPage() {
		EmrSetupDriver.driver.get("https://demo.openemr.io/a/openemr");

		String title = EmrSetupDriver.driver.getTitle();
		return title;

	}
	
	
	
	
	
	
	
	
	// patient menu ( click / mouseover )
	public void patientMenu() {
		//patientActions.patientMenu.click();
		
		 Actions actions = new Actions(EmrSetupDriver.driver);
		 actions.moveToElement(patientActions.patientMenu).perform();
	}
	
	// patient submenu
	
	public void pSubmenu() {
		patientActions.patientSubmenu.click();
	}
	
	
	
	// first iFrame
	
		public void displayiFrame1() {
			EmrSetupDriver.driver.switchTo().frame(patientActions.iFrame1);
		}
		
	
		// add new patient btn
		public void addPatientBtn() {
			patientActions.newPatientBtn.click();
		}
	
		// form iFrame
		public void formiFrame() {
			EmrSetupDriver.driver.switchTo().frame(patientActions.formiFrame2);
		}
	
		//select initials
		public Select getInitialSelect() {
			Select iniSelect = new Select(patientActions.iniName);
			iniSelect.selectByVisibleText("Mr.");
			return iniSelect;

		}
		
		// first and last name
		public void firstName() {
			patientActions.fname.sendKeys("Ganesh");
		}
		
		public void lastName() {
			patientActions.lname.sendKeys("Kumer");
		}

		
		// DOB and gender
		public void dateOfBirth() {
			patientActions.dateofBirth.sendKeys("1984-07-25");
		}
		
		
		public Select gender() {
			Select gen = new Select(patientActions.gender);
			gen.selectByVisibleText("Male");
			return gen;
		}
		
		//check contact
		public void checkContact() {
			patientActions.checkContact.click();
		}
		
		
		// address, city , postalcode
		public void address() {
			patientActions.address.sendKeys("70-35 Broadway");
		}
		
		public void city() {
			patientActions.city.sendKeys("New York");
		}
		
		public void postalCode() {
			patientActions.postalcode.sendKeys("11372");
		}
		
		
		
		
		// state
		public Select state() {
			Select state = new Select(patientActions.state);
			state.selectByVisibleText("Georgia");
			return state;
		}
		
		//add country
		public void addCountryLink() {
			patientActions.addCountry.click();
		}
		
		//enter country name
		public void enterCountry() {
			patientActions.countryName.sendKeys("United States of America");
		}
		
		//country add button
		public void addCountryBtn() {
			patientActions.countryAddbtn.click();
		}
		
		//check choise
		public void checkChoise() {
			patientActions.checkChoise.click();
		}
		
		//select provider		
		public Select provider() {
			Select provider = new Select(patientActions.provider);
			provider.selectByVisibleText("Billy Smith");
			return provider;
		}
		
		
		//check employer
		public void checkEmployer() {
			patientActions.checkEmployer.click();
		}
		
		
		// employer name
		public void employerName() {
			patientActions.employerName.sendKeys("Cognizent");
		}
		
		//check status
		public void checkStatus() {
			patientActions.checkStatus.click();
		}
		
		//select religion
		public Select religion() {
			Select religion = new Select(patientActions.religion);
			religion.selectByVisibleText("Islam");
			return religion;
		}
		
		//check misc
		public void checkMisc() {
			patientActions.checkMisc.click();
		}
		
		//date deseaces 
		public void dateDeseaces() {
			patientActions.dateDecseased.sendKeys("01/04/2020");
		}
		
		
		//check guardian
		public void checkGuardian() {
			patientActions.checkGuardian.click();
		}
		
		//select guardian sex
		
		public Select guardianSex() {
			Select guardianSex = new Select(patientActions.guardianSex);
			guardianSex.selectByVisibleText("Female");
			return guardianSex;
		}
		
		
		//work phone
		public void workPhone() {
			patientActions.workPhone.sendKeys("929-401-2052");
		}
		
		
				
		//check insurance
		//plan name	
		
		
		//create new patient button
		public void createAddnewPatient() {
			patientActions.createNewPatient.click();
		}
		
		//model iFrame
		public void modeliFrame() {
			EmrSetupDriver.driver.switchTo().frame(patientActions.mobeliFrame);
		}
		
		// confirm create patient
		public void confirmPatient() {
			patientActions.confirmPatient.click();
		}
		
		
		// patient create msg
		public boolean createMsg() {
			boolean msg = patientActions.patientCreateMsg.isDisplayed();
			return msg;
		}
		
		
		
		
		
	
}
