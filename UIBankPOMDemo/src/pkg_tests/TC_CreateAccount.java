package pkg_tests;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import graphql.Assert;
import pkg_pageClasses.HomePage;
import pkg_pageClasses.createAccountPage;
import pkg_pageClasses.loginPage;

public class TC_CreateAccount {
	
public static WebDriver driver;
createAccountPage objCreateAcc;


public static String URL = "https://uibank.uipath.com/";

initiizeDriver objdriver;
HomePage objHomepage;
loginPage objLoginpage;



  @Test
  @Parameters({ "uname", "pwd" })
  public void createAccount(String uname,String pwd) throws InterruptedException {
	  	objHomepage.launch_app(URL);
		boolean check_homepage = objHomepage.verify_homepage();
		Assert.assertTrue(check_homepage);

		Reporter.log(" Executed Verifcation Home Page Test case Successfully");
		
		objLoginpage.TC_login(uname, pwd);

		Reporter.log(" Executed Login into Uipath app Test case Successfully");

		
		
	  objCreateAcc.TC_ApplyAccountSaving("BLIT27March23");
	  String AccountId=objCreateAcc.getAccountID();
	  Reporter.log("The account id is: "+AccountId);
  }
  
  
  @BeforeClass
  public void initializeClass() throws InterruptedException {
	  
//	  objCreateAcc=new createAccountPage(driver);
	  //no implemention
	  
		objdriver=new initiizeDriver();
		driver=objdriver.getDriver(driver);
		objHomepage = new HomePage(driver);
		objLoginpage = new loginPage(driver);
		objCreateAcc=new createAccountPage(driver);
		Thread.sleep(5000);
	  
  }
  
  @AfterClass
  public void closeBrowser() {
	  driver.close();
  }
  
}
