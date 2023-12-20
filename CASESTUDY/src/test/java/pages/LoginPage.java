package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
		
	@FindBy(id="loginusername")
	WebElement userName;
	
	@FindBy(id="loginpassword")
	WebElement pwd;
	
	@FindBy(xpath ="//button[@onclick='logIn()']")
	WebElement loginBtn;
	
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void loginIntoApp(String strUser, String strPwd) {
		
		userName.sendKeys(strUser);
		pwd.sendKeys(strPwd);
		loginBtn.click();
	}
	

}
