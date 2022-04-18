package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewCustomer extends PageBase {
	
	public AddNewCustomer(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//ul[@class='side-list']/..//li[4]/.//a[@href='https://saharhassan.myexpandcart.dev/admin/sale/component/customers']")
	WebElement customersBtn;
	
	@FindBy(xpath="//a[contains(text(), 'Add Customer')]")
	WebElement addcustomerBtn;
	
	public void goToCustomersPage() throws InterruptedException {
		ClickButton(customersBtn);
		Thread.sleep(4000);
		ClickButton(addcustomerBtn);
	}

}
