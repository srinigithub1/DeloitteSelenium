package pkgPagesFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	/**
	 * 
	 * All WebElements are identified by @FindBy annotation
	 * 
	 */

//	By Homepage=By.id("user-name");

	@FindBy(id = "user-name")
	WebElement HomepageElement;

//    @FindBy(name="password")
//
//    WebElement password;    
//
//    @FindBy(className="barone")
//
//    WebElement titleText;
//
//    @FindBy(name="btnLogin")
//
//    WebElement login;

	String title_page = "Swag Labs";

	public HomePage(WebDriver driver) {

		this.driver = driver;

		// This initElements method will create all WebElements

		PageFactory.initElements(driver, this);

	}

//	
//	public HomePage(WebDriver driver) {
//		this.driver=driver;
//	}

	public String verifyHomepage() {
		return driver.getTitle();
	}

	public boolean verifyUsername() {
		return HomepageElement.isDisplayed();
		  
	}

}
