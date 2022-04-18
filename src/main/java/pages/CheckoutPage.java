package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends PageBase {
	public CheckoutPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"phone-number\"]")
	WebElement phoneNumber;
	
	@FindBy(xpath="//*[@id=\"first-name\"]")
	WebElement firstName;
	
	@FindBy(xpath="//*[@id=\"contact-email\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"country-id\"]")
	WebElement country;
	
	@FindBy(xpath="//*[@id=\"zone-id\"]")
	WebElement state;
	
	@FindBy(xpath="//*[@id=\"street-details\"]")
	WebElement streetDetails;
	
	@FindBy(xpath="//*[@id=\"buildingdetails\"]")
	WebElement buildingDetails;
	
	@FindBy(xpath="*//div/div/div/div[1]/div/button")
	WebElement shippingBtn;


		
		public void continueToShipping(String number, String name, String Country, String State, String street, String building ) throws InterruptedException {
			SendText(phoneNumber, number);
			SendText(firstName, name);	
			Select countryList = new Select(country);
			countryList.selectByValue(Country);
			Select stateList = new Select(state);
			stateList.selectByValue(State);		
			ClickButton(state);
			SendText(streetDetails, street);		
			SendText(buildingDetails, building);	
			Thread.sleep(3000);
			ClickButton(shippingBtn);

			

		}

}
