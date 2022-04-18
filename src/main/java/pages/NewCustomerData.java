package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCustomerData extends PageBase{
	
	public NewCustomerData(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"firstname-group\"]/input")
	WebElement firstName;
	
	@FindBy(xpath="//*[@id=\"lastname-group\"]/input")
	WebElement lastName;
	
	@FindBy(xpath="//*[@id=\"email-group\"]/input")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"telephone-group\"]/input")
	WebElement telephone;
	
	@FindBy(xpath="//*[@id=\"password-group\"]/input")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"confirm-group\"]/input")
	WebElement confirmPassword;
	
	@FindBy(xpath="//*[@id=\"status-group\"]/div/label")
	WebElement status;
	
	@FindBy(xpath="//span[contains(text(), 'Save')]")
	WebElement saveBtn;	
	
	public void customerData(String fNama, String Email, String phone) throws InterruptedException {
		SendText(firstName, fNama);
		SendText(email, Email);
		SendText(telephone, phone);
		ClickButton(status);
		Thread.sleep(4000);
		ClickButton(saveBtn);
	}
}

