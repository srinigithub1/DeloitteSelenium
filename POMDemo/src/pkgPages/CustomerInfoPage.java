package pkgPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerInfoPage {
	
	WebDriver driver;
	
	By firstName=By.id("first-name");
	By lastName=By.id("last-name");
	By zipCode=By.id("postal-code");
	By buttonContinue=By.id("continue");
	
	public CustomerInfoPage(WebDriver driver) {
		this.driver=driver;
	}
	
	// methods or actions on each lement of the page
	
	public void setFirstName(String fname) {
		driver.findElement(firstName).sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		driver.findElement(lastName).sendKeys(lname);
	}
	
	public void setZipCode(String zipcode) {
		driver.findElement(firstName).sendKeys(zipcode);
	}
	
	public void clickContinueButton() {
		driver.findElement(buttonContinue).click();
	}
	
	public void TC_CustomerInfo(String fname,String lname,String zipcode) {
		
		this.setFirstName(fname);
		this.setLastName(lname);
		this.setZipCode(zipcode);
		this.clickContinueButton();
		
		
	}
	

}
