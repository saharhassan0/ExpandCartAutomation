package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.AddComment;
import pages.AdminLogin;
import pages.CreateOrderPage;
import pages.OrderPage;
import pages.OrderSuccesConfirmationFromDashboard;
import pages.PaymentAddressPage;
import pages.SelectProducts;

public class CreateOrderFromDashboardTest extends TestBase{
	
	AdminLogin adminLogin;
	OrderPage orderPage;
	CreateOrderPage createOrderPage;
	PaymentAddressPage paymentAddressPage;
	SelectProducts selectProducts;
	AddComment addComment; 
	OrderSuccesConfirmationFromDashboard orderSuccessConfirmation;

	
	@DataProvider(name="loginData")
	public static Object[][] loginData() {
			return new Object[][]
							{
										{"admin","admin"}};
							}
	
	@DataProvider(name ="orderCreationData" )
	public static Object[][] OrderCreationData() {
		return new Object[][]
						{
									{"sahar","hassan", "sahar.hassan@expandcart.com", "01005820775"}};
						}
	
	@DataProvider(name="addressPageData")
	public static Object[][] AddressPageData() {
		return new Object[][]
			        	{
									{"6th of october"}};
                        }
	
	@DataProvider(name="productSelectionData")
	public static Object[][] ProductSelectionData() {
		return new Object[][]
			        	{
									{"iphone"}};
                        }
	
	@DataProvider(name="addCommentData")
	public static Object[][] AddCommentData() {
		return new Object[][]
			        	{
									{"comment"}};
                        }
	
	@Test(dataProvider="loginData", priority = 1)
	public void Login(String user, String pswd) throws InterruptedException {
		adminLogin = new AdminLogin(driver);
		adminLogin.Login(user, pswd);
		Thread.sleep(5000);	
		orderPage = new OrderPage(driver);
		orderPage.goToOrdersPage();
		
}	
	@Test(dataProvider="orderCreationData", priority = 2)	
	public void goToPaymentAddress(String fName, String lName, String Email,  String phone) throws InterruptedException {
		createOrderPage = new CreateOrderPage(driver);
		createOrderPage.goToPaymentAddress(fName, lName, Email, phone);	
		Thread.sleep(5000);
}
	
	@Test(dataProvider="addressPageData", priority = 3)
	public void goToShippingAddress(String addressOne) throws InterruptedException {
	paymentAddressPage = new PaymentAddressPage(driver);
	paymentAddressPage.goToShippingAdress(addressOne);
	Thread.sleep(3000);		
	paymentAddressPage.nextStepBtn();
	Thread.sleep(3000);
	paymentAddressPage.nextStepBtn();
	
}
	
	@Test(dataProvider="productSelectionData", priority = 4)
	public void searchForProduct(String productName) throws InterruptedException {
	selectProducts = new SelectProducts(driver);
	selectProducts.searchForProduct(productName);
	Thread.sleep(3000);
	JavascriptExecutor js2 = (JavascriptExecutor) driver;
	js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	selectProducts.nextStep();
}
	@Test(dataProvider="addCommentData", priority = 5)
	public void addComment(String comm) throws InterruptedException{
		addComment = new AddComment(driver);
		addComment.addComments(comm);
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		addComment.completeOrder();
		Thread.sleep(9000);
		
	}
	
	@Test(priority = 5)
	public void orderSuccessConfirmationTxt() throws InterruptedException {
	orderSuccessConfirmation = new 	OrderSuccesConfirmationFromDashboard(driver);
	orderSuccessConfirmation.orderSuccessConfirmationTxt();
	
	
}}