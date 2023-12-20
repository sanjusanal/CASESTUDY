package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	@FindBy(css = "button.btn.btn-success")
	WebElement placeOrder;
	
	@FindAll(value =@FindBy (xpath ="//tbody//td[2]"))
	List<WebElement> products;
	
	@FindBy(xpath= "(//a[contains (text(),'Delete')])[1]")
	WebElement delete;
	
	
	
	
	
	
	
	public CartPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public void placeOrder() {
		placeOrder.click();
	}
	public int productnames() {
		return products.size();
	}
	public void deleteProduct() {
		delete.click();
	}

}
