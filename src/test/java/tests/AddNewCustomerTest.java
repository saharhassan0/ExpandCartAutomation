package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.AddNewCustomer;
import pages.AdminLogin;
import pages.NewCustomerData;

public class AddNewCustomerTest extends TestBase {
	AdminLogin adminLogin;
	AddNewCustomer addNewCustomer;
	NewCustomerData newCustomerData; 
	
	@DataProvider(name="loginData")
	public static Object[][] loginData() {
			return new Object[][]
							{
										{"admin","admin"}};
							}
	
	@DataProvider(name="customerData")
	public static Object[][] customerData() {
			return new Object[][]
							{
										{"sahar","saherhassan_99@hotmail.com","01000000000"}};
							}
	
	@Test(dataProvider="loginData", priority = 1)
	public void Login(String user, String pswd) throws InterruptedException {
		adminLogin = new AdminLogin(driver);
		adminLogin.Login(user, pswd);
		Thread.sleep(5000);	
		addNewCustomer = new AddNewCustomer(driver);
		addNewCustomer.goToCustomersPage();
}	
	@Test(dataProvider="customerData", priority = 2)
	public void customerData(String fNama,String Email, String phone) throws InterruptedException {
		newCustomerData = new NewCustomerData(driver);
		newCustomerData.customerData(fNama, Email, phone);
	}
	
}
