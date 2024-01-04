package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class initializeDriver {
//	public static WebDriver driver;
	
	
	public static WebDriver getDriver(WebDriver driver) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Seleniumsoftware\\chromedriver.exe");
		
	    ChromeOptions options = new ChromeOptions();	
//	    options.addArguments("incognito");
	    options.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver(options);
	    
		return driver;
		
	}

}
