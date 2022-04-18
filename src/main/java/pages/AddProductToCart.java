package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProductToCart extends PageBase{
	public AddProductToCart(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"option-value-186\"]")
	WebElement colors;
	
	@FindBy(xpath="//*[@id=\"button-cart\"]")
	WebElement addToCartBtn;
	
	@FindBy(xpath="//*[@id=\"counterLabel\"]")
	WebElement cartIcon;
	
	@FindBy(xpath="//a[contains(text(), 'Checkout')]")
	WebElement checkOutBtn;

	public void addProductToCart() throws InterruptedException {
		Thread.sleep(2000);
		ClickButton(colors);
		ClickButton(addToCartBtn);
		ClickButton(cartIcon);
		ClickButton(checkOutBtn);

}}


