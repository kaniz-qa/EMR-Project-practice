package emr.practice.utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmrSetupDriver {

	public static WebDriver driver;
	//JavascriptExecutor js = (JavascriptExecutor)driver;
	
	public static void setDriver() {
		WebDriverManager.chromedriver().version("79.0.3945.36").setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		
		
		
	}
	
	public static WebDriver getDriver() {
		return driver;
		
	}
	
	public static void teardown() {
		//driver.quit();
	}
	
}
