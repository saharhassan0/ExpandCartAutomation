package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompleteOrderCheckout extends PageBase{
	public CompleteOrderCheckout(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"shipping\"]/div[2]/div[3]/div/label")
	WebElement shippingMethod;
	
	@FindBy(xpath="*//div[3]/div/div/div/div[1]/div/button")
	WebElement paymentBtn;
	
	@FindBy(xpath="//*[@id=\"cod\"]")
	WebElement paymentMethod;
	
	@FindBy(xpath="/*//div[3]/div/div/div/div[1]/div/button")
	WebElement completeOrderBtn;
	
	public void shippingAndPayment() throws InterruptedException {
		Thread.sleep(5000);
		ClickButton(shippingMethod);
		Thread.sleep(4000);
		ClickButton(paymentBtn);
		ClickButton(paymentMethod);
		Thread.sleep(4000);
		ClickButton(completeOrderBtn);
		Thread.sleep(5000);

}}
