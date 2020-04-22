package emr.practice.actions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import emr.practice.elements.EmrLoginPracticeElements;
import emr.practice.utilities.EmrSetupDriver;
import emr.practice.utilities.ReadExcelData;

public class EmrLoginPracticeActions {

	EmrLoginPracticeElements loginElements;
	JavascriptExecutor js = (JavascriptExecutor)EmrSetupDriver.driver;
	
	public EmrLoginPracticeActions() {
		this.loginElements = new EmrLoginPracticeElements();
		PageFactory.initElements(EmrSetupDriver.driver, loginElements);
	}
	
	
	// application URL
	public String emrLoginPage() {
		
		EmrSetupDriver.driver.get("https://demo.openemr.io/a/openemr");
		EmrSetupDriver.driver.manage().window().maximize();
		EmrSetupDriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String title = EmrSetupDriver.driver.getTitle();	
		System.out.println(title);
		return title;
		
		
	}
	
	// screenshot ........................ start
	public void getscreenshotLogo( ) throws Exception {
		 js.executeScript("arguments[0].style.border = '3px solid red';", loginElements.logo);
        File scrL = ((TakesScreenshot) loginElements.logo).getScreenshotAs(OutputType.FILE);       
        File destL = new File("Logo.png");
        FileUtils.copyFile(scrL, destL);
        Thread.sleep(3000);
        
        
    }
	
	public void getscreenshot( ) throws Exception {
        File scr = ((TakesScreenshot) EmrSetupDriver.driver).getScreenshotAs(OutputType.FILE);
        File dest = new File("Home.png");
        FileUtils.copyFile(scr, dest);
        Thread.sleep(3000);
    }
	// screenshot ........................end
	
	
	
	// Data from excel file.......................
	
	public Object[][] getExcelData() throws IOException {

		return ReadExcelData.readExcel("credentials.xlsx", "user_pass");

	}
	
	
	
	
	
	
	
	
	
	// Login ------------------------------------
		public void setUserID(String admin) {
			loginElements.admin.sendKeys(admin);

		}

		public void setPassword(String pass) {
			loginElements.pass.sendKeys(pass);

		}

		public Select setLanguage() {
			Select lang = new Select(loginElements.language);
			//lang.selectByVisibleText("Default - English (Standard)");
			lang.selectByVisibleText("Bengali");
			return lang;
			
			

		}
		
		
		
		
		
		public void loginClick() {
			loginElements.loginButton.click();
		}

		public boolean errMsg() {
			boolean eMsg = loginElements.errorMsg.isDisplayed();
			return eMsg;
		}
		
		
		public boolean patientText() {
			return loginElements.patientText.isDisplayed();
		}

	
}
