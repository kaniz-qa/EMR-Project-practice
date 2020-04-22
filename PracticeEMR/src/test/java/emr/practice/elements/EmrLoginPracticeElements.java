package emr.practice.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmrLoginPracticeElements {

	//List<WebElement> listOfElements = driver.findElements(By.xpath("//div"));
	//public List<WebElement> uid;
	
	// UserID
		@FindBy(xpath = "//*[@id=\"authUser\"]")
		public WebElement admin;

		// Password
		@FindBy(xpath = "//*[@id=\"clearPass\"]")
		public WebElement pass;

		// Login Button
		@FindBy(xpath = "//*[@id=\"login_form\"]/div[3]/div[1]/div[5]/button")
		public WebElement loginButton;

		// Login Text
		@FindBy(xpath = "//*[@id=\"attendantData\"]/div/span[1]/div[2]")
		public WebElement patientText;
		
		// Language (not working)
		@FindBy(xpath = "//select[@name='languageChoice']")
		public WebElement language;
		
		
		
		
		// error msg
		@FindBy(xpath = "//*[@id=\"login_form\"]/div[2]/div/div")
		public WebElement errorMsg;
		
		
		// logo
		@FindBy(xpath = "//img[@class='img-fluid img-responsive center-block']")
		public WebElement logo;
		
		
		
}
