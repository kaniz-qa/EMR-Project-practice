package emr.practice.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewPatientElements {

	
	
	// patient menu
	@FindBy(xpath = "//body/div[@id='mainBox']/div[@id='body_top_div']/div[@id='menu_items']/span[@id='menu_logo']/div/div[@class='appMenu']/span[5]/div[1]/div[1]")
	public WebElement patientMenu;
	
	
	// patient submenu
	@FindBy( xpath = "//*[@id=\"menu_logo\"]/div/div/span[5]/div/ul/li[1]/div")
	public WebElement patientSubmenu;
	
	
		
	// display iFrame
	@FindBy(name = "fin")
	public WebElement iFrame1;
	
	
	
	// add new patient btn
	@FindBy(xpath = "//button[@id='create_patient_btn1']")
	public WebElement newPatientBtn;
	
	
	// form iFrame	
	@FindBy(xpath = "//*[@id=\"framesDisplay\"]/div[2]/iframe")
	public WebElement formiFrame2;
	//*[@id="framesDisplay"]/div[2]/iframe
	
	
	//select initials
	@FindBy(xpath = "//*[@id=\"form_title\"]")
	public WebElement iniName;
	
	
	// first and last name
	@FindBy(xpath = "//input[@id='form_fname']")
	public WebElement fname;
	
	@FindBy(xpath = "//input[@id='form_lname']")
	public WebElement lname;
	
	
	// DOB and gender
	@FindBy(xpath = "//input[@id='form_DOB']")
	public WebElement dateofBirth;
		
	@FindBy(xpath = "//select[@id='form_sex']")
	public WebElement gender;
	
	
	//check contact
	@FindBy(xpath = "//input[@id='form_cb_2']")
	public WebElement checkContact;
	
	
	// address, city , postalcode
	@FindBy(xpath = "//input[@id='form_street']")
	public WebElement address;
	@FindBy(xpath = "//input[@id='form_city']")
	public WebElement city;
	@FindBy(xpath = "//input[@id='form_postal_code']")
	public WebElement postalcode;
	
	
	
	// state
	@FindBy(xpath = "//select[@id='form_state']")
	public WebElement state;
	
	//add country
	@FindBy(xpath = "//td[@id='text_country_code']//input[@id='addtolistid_country']")
	public WebElement addCountry;
	
	
	//country name
	@FindBy(xpath = "//input[@id='newlistitem_value']")
	public WebElement countryName;
	
	
	//country add button
	@FindBy(xpath = "//input[@id='newlistitem_submit']")
	public WebElement countryAddbtn;
	
	
	//check choise
	@FindBy(xpath = "//input[@id='form_cb_3']")
	public WebElement checkChoise;
	
	//select provider
	@FindBy(xpath = "//select[@id='form_providerID']")
	public WebElement provider;
	
	//check employer
	@FindBy(xpath = "//input[@id='form_cb_4']")
	public WebElement checkEmployer;
	
	
	// employer name
	@FindBy(xpath = "//input[@id='form_em_name']")
	public WebElement employerName;
	
	
	//check status
	@FindBy(xpath = "//input[@id='form_cb_5']")
	public WebElement checkStatus;
	
	//select religion
	@FindBy(xpath = "//select[@id='form_religion']")
	public WebElement religion;
	
	
	//check misc
	@FindBy(xpath = "//input[@id='form_cb_6']")
	public WebElement checkMisc;
	
	
	
	//date deseaces 
	@FindBy(xpath = "//input[@id='form_deceased_date']")
	public WebElement dateDecseased;
	
	
	//check guardian
	@FindBy(xpath = "//input[@id='form_cb_7']")
	public WebElement checkGuardian;
	
	//select guardian sex
	@FindBy(xpath = "//select[@id='form_guardiansex']")
	public WebElement guardianSex;
	
	//work phone
	@FindBy(xpath = "//input[@id='form_guardianworkphone']")
	public WebElement workPhone;
	
	//check insurance
	@FindBy(xpath = "//input[@name='form_cb_ins']")
	public WebElement checkInsurance;
	
	
	//plan name	
	@FindBy(xpath = "//input[@name='i1plan_name']")
	public WebElement planName;
	
	
	//create new patient button
	@FindBy(xpath = "//button[@id='create']")
	public WebElement createNewPatient;
	
	
	//model iFrame
	@FindBy(xpath = "//iframe[@id='modalframe']")
	public WebElement mobeliFrame;
	
	
	// confirm create patient
	@FindBy(xpath = "//body[@class='body_top']//center//input")
	public WebElement confirmPatient;
	
	
	// pop up 
	
	
	
	
	// patient create msg
	@FindBy(xpath = "//h2[contains(text(),'Medical Record Dashboard - Ganesh Kumer')]")
	public WebElement patientCreateMsg;
	
	
}
