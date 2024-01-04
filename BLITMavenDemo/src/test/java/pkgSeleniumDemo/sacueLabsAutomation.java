package pkgSeleniumDemo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class sacueLabsAutomation {
	
  @Test(dataProvider = "dp")
  public void LoginTest(String Uname, String pwd) {
	  
	  System.out.println("The user Name : "+ Uname);
	  System.out.println("The user password : "+ pwd);
	  
	  
  }
  
  @Test
  public void LogoutTest() {
	  System.out.println("this is Logout test case");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is code executed before each test method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is code executed After each test method");
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "sauceLab1", "xyz" },
      new Object[] { "SauceLab2", "abc" },
      new Object[] { "SauceLab3", "abc" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("this is code executed before each test Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is code executed before After test Class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is code executed before each test ");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is code executed After each test ");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this is code executed before each test Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("this is code executed After each test Suite");
  }

}
