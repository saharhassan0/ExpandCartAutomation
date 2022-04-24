package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewUser extends PageBase{
	public AddNewUser(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//ul[@class='side-list']/..//li[10]/..//a[@href='https://saharhassan.myexpandcart.dev/admin/setting/setting']")
	WebElement settingsBtn;
	
	@FindBy(xpath="//*[@id=\"settings-page\"]/div/div[9]/a")
	WebElement usersAndPermissions;
	
	@FindBy(xpath="//*[@id=\"add_user_btn\"]")
	WebElement addUserBtn;
	
	@FindBy(xpath="//*[@id=\"username\"]")
	WebElement userName;
	
	@FindBy(xpath="//*[@id=\"firstname\"]")
	WebElement firstName;
	
	@FindBy(xpath="//*[@id=\"lastname\"]")
	WebElement lastName;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"user_group_id-group\"]/span[1]/span[1]/span")
	WebElement userGroup;
	
	@FindBy(xpath="//li[contains(text(), 'Demonstration')]")
	WebElement demonstrationGroup;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"confirm\"]")
	WebElement confirmPassword;
	
	@FindBy(xpath="//button[contains(text(), 'Create')]")
	WebElement createBtn;
	
	
	
	public void addNewUser(String user, String fName, String lName, String Email, String pswd, String confirmPswd) throws InterruptedException {
		ClickButton(settingsBtn);
		Thread.sleep(4000);
		ClickButton(usersAndPermissions);
		Thread.sleep(4000);
		ClickButton(addUserBtn);
		SendText(userName, user);
		SendText(firstName, fName);
		SendText(lastName, lName);
		SendText(email, Email);
		ClickButton(userGroup);
		ClickButton(demonstrationGroup);
		SendText(password, pswd);
		SendText(confirmPassword, confirmPswd);
		ClickButton(createBtn);	
		Thread.sleep(4000);
	}

//	public void confirmUserIsAdded() {
//		Dispaly(driver, userName);
//		Dispaly(driver, demonstrationGroup);
//	}
}
