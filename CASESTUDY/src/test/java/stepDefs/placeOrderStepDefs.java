package stepDefs;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.HomePage;
import pages.AddCartPage;
import pages.CartPage;
import pages.PlaceOrder;

public class placeOrderStepDefs {
	WebDriver driver = TestBase.getDriver();
	LoginPage loginPage;
	HomePage homePage;
	AddCartPage addcartpage;
	CartPage cartpage;
	PlaceOrder placeorder;
	public placeOrderStepDefs() {
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		addcartpage = new AddCartPage(driver);
		cartpage = new CartPage(driver);
		placeorder = new PlaceOrder(driver);
	}
	@Given("User is on shopping page")
public void user_is_on_shoping_page() {
		TestBase.openUrl("https://www.demoblaze.com/");
	
}
	@When("User enters {string} and {string}")
	public void user_enters_and(String strUser, String strPwd) {
		homePage.loginClick();
		loginPage.loginIntoApp(strUser, strPwd);

}
	@When ("User add an item to cart")
	public void user_add_an_item_to_cart() throws InterruptedException {
		Thread.sleep(3000);
		homePage.selectSamsung();
		addcartpage.addtoCart();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		homePage.clickHome();
		Thread.sleep(3000);
		homePage.selectLumia();
		addcartpage.addtoCart();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.switchTo().defaultContent();
		homePage.clickHome();
		homePage.clickCart();
		
		
	}
	@Then ("Items must be added to cart")
	public void items_must_be_added_to_cart() throws InterruptedException {
		
		Thread.sleep(2000);
		int a =cartpage.productnames();
		if( a > 0) {
			Assert.assertTrue(true);
			System.out.println("Items added successfully");
			
		}
		else {
			Assert.assertTrue(false);
		}
		
		
		
	}
	@Then ("Delete an item from Cart")
	public void delete_an_item_from_cart() throws InterruptedException {
		Thread.sleep(2000);
		cartpage.deleteProduct();
		System.out.println("Prodruct Deleted");
	}
	@Then ("Place order")
	public void place_order() throws InterruptedException {
		Thread.sleep(2000);
		cartpage.placeOrder();
		Thread.sleep(2000);
		placeorder.enterName();
		placeorder.enterCountry();
		placeorder.enterCity();
		placeorder.enterCard();
		placeorder.enterMonth();
		placeorder.enterYear();
		
	}
	

}
