package pkgTests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pkgPages.HomePage;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestHomePage {

	public static WebDriver driver;
	HomePage objHomepage;

	@Test
	public void TC_HOmepage() {
	//	SoftAssert softAssert=new SoftAssert();

		Assert.assertEquals(objHomepage.verifyHomepage(), "Swag Labs");
		Assert.assertTrue(objHomepage.verifyUsername());
	}

	@BeforeClass
	public void beforeClass() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Seleniumsoftware\\chromedriver.exe");
		
	    ChromeOptions options = new ChromeOptions();	
//	    options.addArguments("incognito");
	    options.addArguments("--remote-allow-origins=*");
	    driver = new ChromeDriver(options);
	    
		driver.get("https://www.saucedemo.com/");
		objHomepage = new HomePage(driver);
		
		Thread.sleep(5000);
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
