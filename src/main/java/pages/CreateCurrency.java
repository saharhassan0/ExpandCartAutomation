package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateCurrency extends PageBase {
	public CreateCurrency(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//ul[@class='side-list']/..//li[10]/..//a[@href='https://saharhassan.myexpandcart.dev/admin/setting/setting']")
	WebElement settingsBtn;
	
	@FindBy(xpath="//*[@id=\"settings-page\"]/div/div[8]/a")
	WebElement languageAndRegionBtn;
	
	@FindBy(xpath="//a[contains(text(), 'Add New Currency')]")
	WebElement addNewCurrencyBtn;
	
	public void addCurrency() {
		ClickButton(settingsBtn);
		ClickButton(languageAndRegionBtn);
		ClickButton(addNewCurrencyBtn);
		
	}

}
