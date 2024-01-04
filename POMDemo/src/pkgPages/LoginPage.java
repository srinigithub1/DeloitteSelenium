package pkgPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public static WebDriver driver;
	
	//WebElement objUname=driver.findElement(By.id("user-name"));
	
	//defining locators of the elemtns in the page
	By uname=By.id("user-name");
	By pwd=By.id("password");
	By buttonLogin=By.id("login-button");
	
	
	By products=By.xpath("//*[@id=\"header_container\"]/div[2]/span");
	
	
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterUserName(String val_uname) {
		driver.findElement(uname).sendKeys(val_uname);
	}
	
	public void enterPassword(String password) {
		driver.findElement(pwd).sendKeys(password);
	}
	
	
	
	public void ClickLoginButton() {
		driver.findElement(buttonLogin).click();
	}
	
	public boolean verifyProducts() {
		return driver.findElement(products).isDisplayed();
	}
	
	public void TC_login(String uname, String password) {
		this.enterUserName(uname);
		this.enterPassword(password);
		this.ClickLoginButton();
		
	}


}
