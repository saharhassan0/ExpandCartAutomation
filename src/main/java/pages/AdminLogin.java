package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLogin extends PageBase {		
		
		public AdminLogin(WebDriver driver)
		{
			super(driver);
		}
		
		@FindBy(xpath ="//*[@id=\"input-name\"]")
		WebElement userName;
		
		@FindBy(xpath="//*[@id=\"input-password\"]")
		WebElement password;
		
		@FindBy(xpath="//*[@id=\"login\"]/button")
		WebElement loginBtn;

		
		public void Login(String user, String pswd) {
			SendText(userName, user);
			SendText(password, pswd);
			ClickButton(loginBtn);
}}
