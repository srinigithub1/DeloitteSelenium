package pkg_pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	public static WebDriver driver;
	
	//locators
	
	By locatorUname=By.id("username");
	By locatorPwd=By.id("password");
	By locatorLoginButton=By.xpath("//form/button");
	
	
	
	public loginPage(WebDriver driver){
		this.driver=driver;
	}
	

	public void enterUname(String valUname) {
		driver.findElement(locatorUname).sendKeys(valUname);
	}
	
	public void enterPasswrod(String pwd) {
		driver.findElement(locatorPwd).sendKeys(pwd);
	}
	
	public void clickLogin() {
		driver.findElement(locatorLoginButton).click();
		}
	
	
	public void TC_login(String uname,String pwd) {
		this.enterUname(uname);
		this.enterPasswrod(pwd);
		this.clickLogin();
	}
}
