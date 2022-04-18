package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchForProductStoreFront extends PageBase{
	public SearchForProductStoreFront(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//*[@id=\"search\"]/input")
	WebElement SearchBox;
	

	@FindBy(xpath="//*[@id=\"search\"]/div/button")
	WebElement SearchBtn;
	
	@FindBy(xpath="//*[@id=\"secCategory\"]/div/div/div/div/div[1]/a/img")
	WebElement product;
	
	public void selectProduct(String productName) throws InterruptedException {
		SendText(SearchBox, productName);
		ClickButton(SearchBtn);
		Thread.sleep(4000);
		ClickButton(product);
	}
	

}
