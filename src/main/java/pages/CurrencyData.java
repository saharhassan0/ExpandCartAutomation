package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CurrencyData extends PageBase{
	public CurrencyData(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"status-group\"]/div/label")
	WebElement statusBtn;
	
	@FindBy(xpath="//*[@id=\"title\"]")
	WebElement currencyTitle;
	
	@FindBy(xpath="//*[@id=\"code\"]")
	WebElement currencyCode;
	
	@FindBy(xpath="//*[@id=\"symbol_left\"]")
	WebElement currencySymbol;
	
	@FindBy(xpath="//button/span[contains(text(), 'Save')]")
	WebElement saveBtn;
	
	public void creatCurrencyData(String title, String code, String symbol) {
		ClickButton(statusBtn);
		SendText(currencyTitle, title);
		SendText(currencyCode, code);
		SendText(currencySymbol, symbol);
		ClickButton(saveBtn);
		
}}
