package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.AdminLogin;
import pages.CreateCurrency;
import pages.CurrencyData;

public class AddCurrencyTest extends TestBase{
	
	AdminLogin adminLogin;
	CreateCurrency createCurrency;
	CurrencyData currencyData;
	
	@DataProvider(name="loginData")
	public static Object[][] loginData() {
			return new Object[][]
							{
										{"admin","admin"}};
							}
	
	@DataProvider(name="currencyData")
	public static Object[][] currencyData(){
			return new Object[][]
					{
										{"Egyptian Pound", "EGP", "EGP" }};
					}
	
	
	
	
	@Test(dataProvider="loginData", priority = 1)
	public void Login(String user, String pswd) throws InterruptedException {
		adminLogin = new AdminLogin(driver);
		adminLogin.Login(user, pswd);
		Thread.sleep(5000);	
		createCurrency = new CreateCurrency(driver);
		createCurrency.addCurrency();

}
	@Test(dataProvider = "currencyData", priority = 2)
	public void creatCurrencyData(String title, String code, String symbol) {
		currencyData = new CurrencyData(driver);
		currencyData.creatCurrencyData(title, code, symbol);
	}
}
