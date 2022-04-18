package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

	public class ReturnOrderDashboard extends PageBase {
		
		public ReturnOrderDashboard(WebDriver driver)
		{
			super(driver);
		}
		
		@FindBy(xpath="/html/body/section[4]/div[2]/ul/li[2]")
		
		WebElement odersBtn;
		
		@FindBy(xpath="//a[contains(text(),'Returns')]")
		WebElement returnsPage;
		
		@FindBy(xpath="//a[contains(text(),' Return No. 1')]")
		WebElement returnOne;
		
		@FindBy(xpath="//*[@id=\"select2-return_status_id-jk-container\"]")
		WebElement awaitingProductsBtn;
		
		@FindBy(xpath="//*[@id=\"select2-return_status_id-jk-result-t5rz-3\"]")
		WebElement completeReturnBtn;
		
		@FindBy(xpath="//*[@id=\"add-order-history\"]")
		WebElement addHistoryBtn;
		
		public void completeReturnSteps() throws InterruptedException {
			ClickButton(odersBtn);
			ClickButton(returnsPage);
			Thread.sleep(3000);
			ClickButton(returnOne);
			ClickButton(awaitingProductsBtn);
			ClickButton(completeReturnBtn);
			Thread.sleep(3000);
			ClickButton(addHistoryBtn);
			
			
		}

	}

