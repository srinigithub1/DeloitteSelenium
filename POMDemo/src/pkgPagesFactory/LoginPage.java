package pkgPagesFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement pwd;
	
	@FindBy(id="login-button")
	WebElement buttonLogin;
	
	@FindBy(xpath="//*[@id=\"header_container\"]/div[2]/span")
	WebElement products;
	
	
	
	public LoginPage(WebDriver driver) {

		this.driver = driver;

		// This initElements method will create all WebElements

		PageFactory.initElements(driver, this);

	}
	
	public void SetUserName(String val_uname) {

		username.sendKeys(val_uname);
	}
	
	public void SetPassword(String password) {
		pwd.sendKeys(password);
	}
	
	
	
	public void ClickLoginButton() {
		buttonLogin.click();
	}
	
	public boolean verifyProducts() {
		return products.isDisplayed();
	}
	
	public void TC_login(String uname, String password) {
		this.SetUserName(uname);
		this.SetPassword(password);
		this.ClickLoginButton();
		
	}


}
