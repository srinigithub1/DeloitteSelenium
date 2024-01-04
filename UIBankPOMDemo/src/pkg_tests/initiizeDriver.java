package pkg_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class initiizeDriver {
	
	public static WebDriver driver;
	
	
	public WebDriver getDriver(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver", "E:\\Seleniumsoftware\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
//	    options.addArguments("incognito");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		return driver;
	}
	
	

}
