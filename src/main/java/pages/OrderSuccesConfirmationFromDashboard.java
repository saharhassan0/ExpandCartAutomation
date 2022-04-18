package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderSuccesConfirmationFromDashboard extends PageBase {
	
	public OrderSuccesConfirmationFromDashboard(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//label[text()= 'Order Created']")
	WebElement orderCreatedMsg;
	
	public void orderSuccessConfirmationTxt() throws InterruptedException {
		Dispaly(driver, orderCreatedMsg);
	} 

}
