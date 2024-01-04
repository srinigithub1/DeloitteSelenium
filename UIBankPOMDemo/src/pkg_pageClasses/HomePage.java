package pkg_pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
public static WebDriver driver;

By locator_homepage=By.id("username");

public HomePage(WebDriver driver){
	this.driver=driver;
}

public void launch_app(String URL) {
	driver.get(URL);
}

public boolean verify_homepage() {
	return driver.findElement(locator_homepage).isDisplayed();
}



//public void TC_Homepage() {
//	this.verify_homepage();
//}





}
