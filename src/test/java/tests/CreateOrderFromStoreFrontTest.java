package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.AddProductToCart;
import pages.CheckoutPage;
import pages.CompleteOrderCheckout;
import pages.OrderSuccessConfirmationStoreFront;
import pages.SearchForProductStoreFront;

public class CreateOrderFromStoreFrontTest extends TestBase2{
	
	SearchForProductStoreFront searchForProductStoreFront;
	AddProductToCart addProductToCart;
	CheckoutPage checkoutPage;
	CompleteOrderCheckout completeOrderCheckout;
	OrderSuccessConfirmationStoreFront orderSuccessConfirmationStoreFront;

	
	@DataProvider(name="productSearchData")
	public static Object[][] searchData() {
			return new Object[][]
							{
										{"iphone"}};
							}
	
	@DataProvider(name = "checkoutData")
	public static Object[][] CheckOutData() {
	    return new Object[][]
	            {
	                    {"01005582222", "sahar", "63" , "1008" , "st test" , "1234"}};
	            }	
	
	@Test(dataProvider = "productSearchData", priority = 1)
	public void selectProduct(String productName) throws InterruptedException {
		searchForProductStoreFront = new SearchForProductStoreFront(driver);
		searchForProductStoreFront.selectProduct(productName);
		Thread.sleep(4000);
		
	}
	
	@Test(priority = 2)
	public void addProduct() throws InterruptedException {
		addProductToCart = new AddProductToCart(driver);
		addProductToCart.addProductToCart();
	}
	
	@Test(dataProvider = "checkoutData" , priority = 3)
	public void continueToShipping(String number, String name, String Country, String State, String street, String building ) throws InterruptedException {
		checkoutPage = new CheckoutPage(driver);
		checkoutPage.continueToShipping(number, name, Country, State, street, building);
		
	}
	
	@Test(priority = 4)
	public void completeOrder() throws InterruptedException {
		completeOrderCheckout = new CompleteOrderCheckout(driver);
		completeOrderCheckout.shippingAndPayment();
	}
	
	@Test(priority = 5)
	public void orderSuccessMsg() {
		orderSuccessConfirmationStoreFront = new OrderSuccessConfirmationStoreFront(driver);
		orderSuccessConfirmationStoreFront.orderSuccessMsg();
	}
	
}
