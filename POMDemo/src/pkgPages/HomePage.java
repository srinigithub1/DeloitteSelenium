package pkgPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	public static WebDriver driver;
	
	By uname=By.id("user-name");
	
	String title_page="Swag Labs";
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String verifyHomepage() {
		return driver.getTitle();
	}
	
	public boolean verifyUsername() {
		return driver.findElement(uname).isDisplayed();
	}

}
