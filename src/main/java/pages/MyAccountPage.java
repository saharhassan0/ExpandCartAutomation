package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase{
	
	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//*[@id=\"Path_12163\"]")
	WebElement myOrdersBtn;
	
	@FindBy(xpath="//a[contains(text(), 'View order')]")
	WebElement viewOrderBtn;
	
	@FindBy(xpath="//a[contains(text(), 'Return')]")
	WebElement returnBtn;
	
	@FindBy(xpath="//*[@id=\"return-reason-id2\"]")
	WebElement returnReasonBtn;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submitBtn;
	
	public void returnOrderSteps() throws Exception {		
		ClickButton(myOrdersBtn);
		ClickButton(viewOrderBtn);
		ClickButton(returnBtn);
		ClickButton(returnReasonBtn);
		Thread.sleep(19000);
		ClickButton(submitBtn);
	}

}
