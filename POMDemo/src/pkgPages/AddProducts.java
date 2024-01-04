package pkgPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProducts {
	
	
	
	WebDriver driver;
	
	By produc1Button=By.id("add-to-cart-sauce-labs-backpack");
	By cartIcon=By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	
	
	
	By products=By.xpath("//*[@id=\"header_container\"]/div[2]/span");
	
	
	
	public AddProducts(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickProductLink() {
		driver.findElement(produc1Button).click();
		
	}
	
	public void clickCartImage() {
		driver.findElement(cartIcon).click();
		
	}
	
	public void TC_AddProduct() {
		this.clickCartImage();
		this.clickCartImage();

		
	}



}
