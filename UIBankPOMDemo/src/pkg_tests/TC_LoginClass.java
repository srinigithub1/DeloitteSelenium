package pkg_tests;

import org.testng.annotations.Test;

import graphql.Assert;
import pkg_pageClasses.HomePage;
import pkg_pageClasses.createAccountPage;
import pkg_pageClasses.loginPage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class TC_LoginClass {

	public static WebDriver driver;

	public static String URL = "https://uibank.uipath.com/";

	initiizeDriver objdriver;
	HomePage objHomepage;
	loginPage objLoginpage;
	createAccountPage objCreateAcc;

	@Test
	@Parameters({ "URL" })
	public void TC_LaunchApp(String URL) {

		objHomepage.launch_app(URL);
		boolean check_homepage = objHomepage.verify_homepage();
		Assert.assertTrue(check_homepage);

		Reporter.log(" Executed Verifcation Home Page Test case Successfully");

	}

	@Test(priority = 1)
	@Parameters({ "uname", "pwd" })
	public void TC_login(String uname, String pwd) {

		objLoginpage.TC_login(uname, pwd);

		Reporter.log(" Executed Login into Uipath app Test case Successfully");

	}
	
	@Test(priority = 2)
	  public void TC_createAccount() throws InterruptedException {
		 
		  objCreateAcc.TC_ApplyAccountSaving("BLIT27March23");
		  String AccountId=objCreateAcc.getAccountID();
		  Reporter.log("The account id is: "+AccountId);
	  }

	@BeforeClass
	public void beforeClass() throws InterruptedException {

		objdriver=new initiizeDriver();
		driver=objdriver.getDriver(driver);
		objHomepage = new HomePage(driver);
		objLoginpage = new loginPage(driver);
		Thread.sleep(5000);
		objCreateAcc=new createAccountPage(driver);

	}

	@AfterClass
	public void afterClass() {

		// driver.close();
		// implement after class funcitonality here
	}

}
