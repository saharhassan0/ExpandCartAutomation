package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.AdminLogin;
import pages.CreateCurrency;
import pages.DefaultCurrency;

public class ChangeDefaultCurrencyTest extends TestBase {
	AdminLogin adminLogin;
	DefaultCurrency defaultCurrency;
	
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
		Thread.sleep(5000);
		defaultCurrency = new DefaultCurrency(driver);
		defaultCurrency.changeDefaultCurrency();
}}
