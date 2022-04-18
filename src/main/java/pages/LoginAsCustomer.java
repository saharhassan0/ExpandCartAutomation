package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginAsCustomer extends PageBase{
	public LoginAsCustomer(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//ul[@class='side-list']/..//li[4]/.//a[@href='https://saharhassan.myexpandcart.dev/admin/sale/component/customers']")
	WebElement customersBtn;
	
	@FindBy(xpath="//*[@id=\"1\"]/td[2]/a ")
	WebElement selectCustomer;
	
	@FindBy(xpath="*//div/div[2]/ul/li[7]/a")
	WebElement loginAsCustomerBtn;
	
	public void goToMyAccount() throws InterruptedException {
		ClickButton(customersBtn);
		ClickButton(selectCustomer);
		Thread.sleep(4000);
		ClickButton(loginAsCustomerBtn);
		Thread.sleep(6000);
	}
	

}
