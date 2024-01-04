package pkg_pageClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class createAccountPage {
	public static WebDriver driver;
	
	//locators
	
	//By locatorNewAccButton=By.xpath("//div[2]");
	By locatorNewAccButton=By.xpath("/html/body/app-root/body/div/app-accounts/div/div[1]/div/div[1]/div[2]");
	By locatorNickNameInput=By.name("accountNickname");
	By typeOfAccountSelect=By.id("typeOfAccount");
	By locatorApplyButton=By.xpath("//button[contains(.,\'Apply\')]");
	
	By locatorConfirmation=By.xpath("//h1[contains(text(),' Congrats, you've been approved for a new account! ')]");
	By locatorAccID=By.id("accountId");
	
	By locatorviewAccountsButton=By.id("viewAccounts");
	
	public createAccountPage(WebDriver driver){
		this.driver=driver;
	}
	

	public void clickNewAccountButton() {
		WebElement button=driver.findElement(By.xpath("/html/body/app-root/body/div/app-accounts/div/div[1]/div/div[1]/div[2]"));
		// creating a reference
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", button);
		//driver.findElement(locatorNewAccButton).click();
	}
	
	
	public void enterNickName(String valNickName) {
		driver.findElement(locatorNickNameInput).sendKeys(valNickName);
		
	}
	
	
	
	public void selectAccountType() {
		Select objSelectAccountType=new Select(driver.findElement(typeOfAccountSelect));
		objSelectAccountType.selectByValue("savings");
		}
	

	public void clickApply() {
		driver.findElement(locatorApplyButton).click();
		}
	
	public String getConfirmation() {
		return driver.findElement(locatorConfirmation).getText();
	}
	
	public String getAccountID() {
		return driver.findElement(locatorAccID).getText();
	}
	
	public void clickviewAccountsButton() {
		driver.findElement(locatorviewAccountsButton).click();
	}
	
	
	//BLIT27March
	public void TC_ApplyAccountSaving(String nickName) throws InterruptedException {
		this.clickNewAccountButton();
		Thread.sleep(5000);
		this.enterNickName(nickName);
		Thread.sleep(5000);
		this.selectAccountType();
		Thread.sleep(5000);
		this.clickApply();
		Thread.sleep(5000);
		this.clickviewAccountsButton();
		Thread.sleep(5000);

	}
}
