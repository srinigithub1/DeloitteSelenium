package pkgPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {
	
	WebDriver driver;
	
	// defining locators
	By checkoutButton=By.id("checkout");
	
	public CheckOutPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public boolean verifyCheckoutButton() {
		return driver.findElement(checkoutButton).isDisplayed();
	}
	
	public void clickCheckoutButton() {
		driver.findElement(checkoutButton).click();
	}
	
	public void TC_checkoutPage() {
		this.clickCheckoutButton();
	}

}
