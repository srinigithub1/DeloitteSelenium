package pkgTestsFactory;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pkgPagesFactory.HomePage;
import pkgPagesFactory.LoginPage;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestLogin {

	public static WebDriver driver;
	HomePage objHomepage;
	LoginPage objLoginpage;

	@Test (priority=0)
	public void TC_Homepage() {
	//	SoftAssert softAssert=new SoftAssert();

		Assert.assertEquals(objHomepage.verifyHomepage(), "Swag Labs");
		Assert.assertTrue(objHomepage.verifyUsername());
	}
	
	@Test(priority=1)
	public void TC_Loginpage() {
	//	SoftAssert softAssert=new SoftAssert();

		objLoginpage.TC_login("standard_user", "secret_sauce");
		Assert.assertTrue(objLoginpage.verifyProducts());
	}

	@BeforeClass
	public void beforeClass() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		objHomepage = new HomePage(driver);
		objLoginpage=new LoginPage(driver);
		
		Thread.sleep(5000);
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
