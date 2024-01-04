package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DataDrivenUsingCucumber {
	
	public static WebDriver driver;
	
	@Given("App is opned in Chrome browser")
	public void app_is_opned_in_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	  		System.out.println("opening Chrome broswer");
			System.setProperty("webdriver.chrome.driver", "E:\\Seleniumsoftware\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://uibank.uipath.com/");
		
	}

	@When("I fresh the browser")
	public void i_fresh_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.navigate().refresh();
	}

	@Then("I validate App title")
	public void i_validate_app_title() {
	    // Write code here that turns the phrase above into concrete actions
	    String title=driver.getTitle();
	    Assert.assertEquals("Verification of Title ", "UiBank", title);
	}

	@Then("check Login button on Home page")
	public void check_login_button_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		
		WebElement LoginButton=driver.findElement(By.xpath("//div[1]/div/div[1]/div/form/button"));
		String text_loginbutton=LoginButton.getText();
		 Assert.assertEquals("Verification of Title ", "Sign In", text_loginbutton);
	}
	
	// 2nd scenario with Data driven capabilites 

	@Given("verify UserName in Loginpage")
	public void verify_user_name_in_loginpage() {
	    // Write code here that turns the phrase above into concrete actions
		boolean status_username=driver.findElement(By.id("username")).isDisplayed();
		 Assert.assertTrue("Verification of Username ", status_username );
	}

	@Given("Verify Password filed in Loginpage")
	public void verify_password_filed_in_loginpage() {
	    // Write code here that turns the phrase above into concrete actions
		boolean status_password=driver.findElement(By.id("password")).isDisplayed();
		 Assert.assertTrue("Verification of Username ", status_password );
	}
	
//	@When("^enter user name in Loginpage (.*)$")
//	@When("^enter user name in Loginpage \"([^\"]*)\" $")
	@When("enter user name in Loginpage {string}")
	public void enter_user_name_in_loginpage_name1(String Uname) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys(Uname);
	    
	}


//	@When("^enter password in Loginpage (.*)$")
	@When("enter password in Loginpage {string}")
	public void enter_password_in_loginpage_ladfjlad(String Password) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys(Password);
	}

	//button[@type='submit']
	@When("click Login in App")
	public void click_Login_in_App() throws InterruptedException {
		driver.findElement(By.xpath("//div[1]/div/div[1]/div/form/button")).click();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("username")).clear();
		Thread.sleep(3000);
	}
	

//	@Then("^Check Logout text (.*) in Ac summary page$")
	@Then("Check Logout text {string} in Ac summary page")
//	@Then("Check Logout text \"([^\"]*)\" in Ac summary page")
	public void check_logout_text_login_failed_in_ac_summary_page(String status) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		//div[3]
		WebElement login_failure_status=driver.findElement(By.xpath("/html/body/app-root/body/div/app-welcome-page/div[1]/div/div[1]/div/form/div[3]"));
		WebElement login_success= driver.findElement(By.linkText("Logout"));
		Thread.sleep(3000);
		if(login_failure_status.isDisplayed()) {
		String login_status=login_failure_status.getText();
		 Assert.assertEquals("Verication of Logout error here", status,login_status);
		}else if(login_success.isDisplayed()){
			String logout_status=login_success.getText();
			   Assert.assertEquals("Verication of Logout here", status,logout_status);
		}else {
			Assert.assertTrue(false);
		}
	}

	@Then("close Uibank Application")
	public void close_uibank_application() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.close();
	}

	
//	@Then("Check Logout text \"([^\"]*)\" in Ac summary page")
//	public void check_logout_text_logout_in_ac_summary_page(String status) {
//	    // Write code here that turns the phrase above into concrete actions
//	   
//	}


}
