package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DefaultCurrency extends PageBase {
	public DefaultCurrency(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//ul[@class='side-list']/..//li[10]/..//a[@href='https://saharhassan.myexpandcart.dev/admin/setting/setting']")
	WebElement settingsBtn;
	
	@FindBy(xpath="//*[@id=\"settings-page\"]/div/div[7]/a")
	WebElement languageAndRegionBtn;
	
	@FindBy(xpath="//*[@id=\"config_currency-group\"]/span[1]/span[1]/span")
	WebElement defaultCurrencyBtn;
	
	@FindBy(xpath="//li[contains(text(), 'Egyptian Pound')]")
	WebElement currencyOptions;
	
	@FindBy(xpath="//button/span[contains(text(), 'Save')]")
	WebElement saveBtn;
	
	
	public void changeDefaultCurrency() throws InterruptedException {
		ClickButton(settingsBtn);
		ClickButton(languageAndRegionBtn);
		ClickButton(defaultCurrencyBtn);
		Thread.sleep(3000);
		ClickButton(currencyOptions);
		ClickButton(saveBtn);
		
		
	}
	
	
}
