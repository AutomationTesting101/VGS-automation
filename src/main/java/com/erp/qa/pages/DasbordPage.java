package com.erp.qa.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erp.qa.base.TestBase;

public class DasbordPage extends TestBase {

	@FindBy(xpath = "//img[@title='Powered by KagamiERP']")
	WebElement logo;

	@FindBy(xpath = "//span[contains(text(),'Purchase Management')]")
	WebElement purchasemanagerlink;
	
	@FindBy(xpath = "//span[@title='Purchase Indent']")
	WebElement purchaseindentlink;
	
	public DasbordPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifydashboardPageTitle() {
		return driver.getTitle();
	}

	public boolean validatelogo() {
		return logo.isDisplayed();
	}

	public PurchaseIndentPage clickOnpurchaseindentLink() {
		purchasemanagerlink.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		purchaseindentlink.click();
		return new PurchaseIndentPage();
		}
	}

