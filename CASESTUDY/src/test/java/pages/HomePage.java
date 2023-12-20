package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(id = "login2")
	WebElement login;
	
	@FindBy(xpath= "//a[contains (text(),'Samsung galaxy s6')]")
	WebElement samsung;
	@FindBy(xpath ="//a[contains (text(),'Nokia lumia 1520')]")
    WebElement lumia;
	@FindBy(xpath ="//a[contains (text(),'Home ')]")
	WebElement home;
	@FindBy(id ="cartur")
	WebElement cart;
	public HomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void loginClick() {
		login.click();
	}
	public void selectSamsung() {
		samsung.click();
		
	}
	public void selectLumia() {
		lumia.click();
	}
	public void clickHome() {
		home.click();
	}
	public void clickCart() {
		cart.click();
	}
	

}
