package pkgTests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pkgPages.AddProducts;
import pkgPages.CheckOutPage;
import pkgPages.CustomerInfoPage;
import pkgPages.HomePage;
import pkgPages.LoginPage;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestAddProduct {

	public static WebDriver driver;
	HomePage objHomepage=new HomePage(driver);
	LoginPage objLoginpage=new LoginPage(driver);
	AddProducts objAddProducts;
	CheckOutPage objCheckOutPage;
	CustomerInfoPage objCustomerInfoPage;

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
	
	
	@Test (priority=2)
	public void TC_AddProductspage() throws InterruptedException {
		
		objAddProducts.TC_AddProduct();
		
		Thread.sleep(5000);
		
	}
	
	@Test(priority=3)
	public void TC_checkout() {
		Assert.assertTrue(objCheckOutPage.verifyCheckoutButton(), "Verify Check Out Button ");
		objCheckOutPage.clickCheckoutButton();
	}
	
	@Test(priority=4)
	public  void TC_customerInfo() throws InterruptedException {
		objCustomerInfoPage.TC_CustomerInfo("Alex", "John", "345234");
	Thread.sleep(5000);
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
		objLoginpage=new LoginPage(driver);
		objAddProducts=new AddProducts(driver);
		objCheckOutPage=new CheckOutPage(driver);
		objCustomerInfoPage=new CustomerInfoPage(driver);
		
		Thread.sleep(5000);
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

}
