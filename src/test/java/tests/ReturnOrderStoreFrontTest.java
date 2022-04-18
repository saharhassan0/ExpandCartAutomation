package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.AdminLogin;
import pages.LoginAsCustomer;
import pages.MyAccountPage;

public class ReturnOrderStoreFrontTest extends TestBase{
	AdminLogin adminLogin;
	LoginAsCustomer loginAsCustomer;
	MyAccountPage myAccountPage;
	
	@DataProvider(name="loginData")
	public static Object[][] loginData() {
			return new Object[][]
							{
										{"admin","admin"}};
							}
	
	@Test(dataProvider="loginData", priority = 1)
	public void Login(String user, String pswd) throws InterruptedException {
		adminLogin = new AdminLogin(driver);
		adminLogin.Login(user, pswd);
		Thread.sleep(8000);
		String actualHomeUrl="https://saharhassan.myexpandcart.dev/admin/common/dashboard";
		String expectedHomeUrl= driver.getCurrentUrl();
		Assert.assertEquals(actualHomeUrl, expectedHomeUrl);
		loginAsCustomer = new LoginAsCustomer(driver);
		loginAsCustomer.goToMyAccount();
}
	
	@Test(priority = 2)
	public void returnOrderSteps() throws Exception {
		myAccountPage = new MyAccountPage(driver);
		myAccountPage.returnOrderSteps();
	}
	
}
