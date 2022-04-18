package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage extends PageBase {
	public OrderPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//ul[@class='side-list']/..//li[2]/..//a[@href='https://saharhassan.myexpandcart.dev/admin/sale/orders']")
	WebElement firstOrderBtn;
	
	@FindBy(xpath="//ul[@class='side-list']/..//li[2]/..//ul[@class='sub-menu']/.//li[1]/..//a[@href='https://saharhassan.myexpandcart.dev/admin/sale/order']")
	WebElement secondOrderBtn;
	
	@FindBy(xpath="//a[contains(text(), 'Create Order')]")
	WebElement createOrderBtn;	
	
	public void goToOrdersPage() {
		ClickButton(firstOrderBtn);
		ClickButton(secondOrderBtn);
		ClickButton(createOrderBtn);

	}}
