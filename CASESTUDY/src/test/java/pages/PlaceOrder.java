package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrder {
	@FindBy(id ="name")
	WebElement name;
	@FindBy(id ="country")
	WebElement country;
	@FindBy(id ="city")
	WebElement city;
	@FindBy(id="card")
	WebElement card;
	@FindBy(id="month")
	WebElement month;
	@FindBy(id="year")
	WebElement year;
	@FindBy(xpath="//button[contains (text(),'Purchase')]")
	WebElement purchase;
	
	public PlaceOrder (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void enterName() {
		name.sendKeys("Sanju");
	}
	public void enterCountry() {
		country.sendKeys("India");
	}
	public void enterCity() {
		city.sendKeys("Trivandrum");
	}
	public void enterCard() {
		card.sendKeys("1238765775363");
	}
	public void enterMonth() {
		month.sendKeys("10");
	}
	public void enterYear() {
		year.sendKeys("2024");
	}
	public void clickPurchase() {
		purchase.click();
	}
	

}
