package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pages.AddNewUser;
import pages.AdminLogin;

public class AddNewUserTest extends TestBase {
	AdminLogin adminLogin;
	AddNewUser addNewUser;
	
	@DataProvider(name="loginData")
	public static Object[][] loginData() {
			return new Object[][]
							{
										{"admin","admin"}};
							}
	
	@DataProvider(name="userData")
	public static Object[][] userData() {
			return new Object[][]
							{
										{"sahar","sahar", "hassan", "sahar.hassan@expandcart.com", "test", "test"}};
							}
	
	
	@Test(dataProvider="loginData", priority = 1)
	public void Login(String user, String pswd) throws InterruptedException {
		adminLogin = new AdminLogin(driver);
		adminLogin.Login(user, pswd);
		Thread.sleep(5000);		
	}
	
	@Test(dataProvider="userData", priority = 2)
	public void addNewUser(String user, String fName, String lName, String Email, String pswd, String confirmPswd) throws InterruptedException {
		addNewUser = new AddNewUser(driver);
		addNewUser.addNewUser(user, fName, lName, Email, pswd, confirmPswd);
		
	}
	
//	@Test(priority = 3)
//	public void confirmUserIsAdded() {
//		addNewUser = new AddNewUser(driver);
//		addNewUser.confirmUserIsAdded();
//	}

}
