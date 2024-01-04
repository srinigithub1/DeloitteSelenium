package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

import org.junit.Test;

public class SauceLabAutomation {
	
	public static WebDriver driver;
	String title="Swag Labs123";
	
	initializeDriver objdriver;
	
	
	@Given("I opened Chrome Bowser with App url")
	public void i_opened_chrome_bowser_with_app_url() {
	    // Write code here that turns the phrase above into concrete actions
		driver= initializeDriver.getDriver(driver);
		 driver.get("https://www.saucedemo.com/");	    
	}

	@Test
	@Given("checked title of the page for Home page verfication")
	public void checked_title_of_the_page_for_home_page_verfication() {
	    // Write code here that turns the phrase above into concrete actions
		
		
		String title_actual=driver.getTitle();
		//if(title_actual==title) {
		if(title_actual.contains(title)) {
			System.out.println("TC is passed");
			assertTrue(true);
		}else {
			assertFalse(false);
			System.out.println("TC is Failed");
		}
		
	   
	}

	@When("I enter username")
	public void i_enter_username() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Enter your username here");
	    
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
	}

	@When("I enter password")
	public void i_enter_password() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("password")).sendKeys("secret_sauce");
	}

	@When("click Login button in SuaceLab App home page")
	public void click_login_button_in_suace_lab_app_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("I validate prodducts page")
	public void i_validate_prodducts_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("click Logout button")
	public void click_logout_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	

	@Then("I validate prodducts page for Neative and postive Test data")
	public void i_validate_prodducts_page_for_neative_and_postive_test_data() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	
	
	@Then("close Browser")
	public void close_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.close();
		//initializeDriver.getDriver(driver).close();
	}
	
	
	@When("I want to check uname {string} with multiple values")
	public void i_want_to_check_uname_with_multiple_values(String uname) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The current value of uname is: "+uname);
	}


	@When("I want to check password{string} with multiple values")
	public void i_want_to_check_password_abc_with_multiple_values(String pwd) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("The current value of pwd is: "+pwd);
	}

	

	
	
	
}
