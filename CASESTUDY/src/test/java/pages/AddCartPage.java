package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCartPage {
	@FindBy(linkText="Add to cart")
	WebElement addCart;
	
	
	public AddCartPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void addtoCart() {
		addCart.click();
		
	}

}
