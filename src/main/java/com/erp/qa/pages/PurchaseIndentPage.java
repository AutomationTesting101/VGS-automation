package com.erp.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erp.qa.base.TestBase;

public class PurchaseIndentPage extends TestBase {

	@FindBy(xpath = "//input[@id='gridSearchId']")
	WebElement serchbox;

	@FindBy(xpath = "//span[@title='LOOK ON']")
	WebElement lookonbtn;

	@FindBy(xpath = "//button[@ng-disabled='action.$$disabled']//span[@title='MODIFY']")
	WebElement modifybtn;

	@FindBy(xpath = "//button[@ng-disabled='action.$$disabled']//span[@title='Discard']")
	WebElement discartbtn;

	@FindBy(xpath = "//span[@title='Add']")
	WebElement addbtn;
	
	@FindBy(xpath = "//span[@title='SUBMIT']")
	WebElement submitbtn;
	
	@FindBy(xpath = "//button[@ng-disabled='action.$$disabled']")
	WebElement redirectbtn;


	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[40]")
	WebElement chackboxdiscart;
	
	@FindBy(xpath = "(//input[contains(@type,'checkbox')])[48]")
	WebElement chackboxsubmit;

	@FindBy(xpath = "//button[normalize-space()='YES']")
	WebElement yes;
	
	@FindBy(xpath = "//body[1]/kgm-container[1]/div[1]/div[1]/div[1]/kgm-content[1]/div[1]/kgm-process[1]/div[1]/ui-view[1]/kgm-pc-embed-form-presentation[1]/kgm-pc-embed[1]/div[1]/div[2]/kgm-step-wizard[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/kgm-pc-embed[1]/div[1]/div[1]/kgm-step-wizard[1]/div[1]/div[1]/div[1]/div[2]/div[1]/kgm-grid-content[1]/div[1]/div[1]/div[1]/kgm-grid[1]/div[1]/div[1]/div[1]/div[1]/kgmgrid-body[1]/div[1]/div[2]/div[2]/button[1]")
	WebElement plusbtn;
	
	@FindBy(xpath = "//*[@id=\"modal-body\"]/div[1]/kgmgrid-modal-presentation/div[9]/div/div/div/kgmgrid-editable-cell/div/div/grid-field/div/grid-number/div/input")
	WebElement Quantity;
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement svbtn;
	
	@FindBy(xpath = "//button[contains(@ng-disabled,'vm.detailedView))')]//span[contains(@title,'Save')][normalize-space()='Save']")
	WebElement savebtn;

	public PurchaseIndentPage() {
		PageFactory.initElements(driver, this);
	}

	public void serchindent() throws InterruptedException {
		Thread.sleep(2000);
		serchbox.click();
		Thread.sleep(2000);
		serchbox.sendKeys("dummy");
		Thread.sleep(2000);
		lookonbtn.click();
	}

	public void discartindent() throws InterruptedException {
		Thread.sleep(2000);
		chackboxdiscart.click();
		Thread.sleep(2000);
		discartbtn.click();
		Thread.sleep(2000);
		yes.click();
	}

	public void addnewbtn() throws InterruptedException {
		Thread.sleep(2000);
		addbtn.click();
	}
	
	public void clicknewpidetails() throws InterruptedException {
		Thread.sleep(2000);
		plusbtn.click();
		
	}


	public void submitindent() throws InterruptedException {
		Thread.sleep(2000);
		chackboxsubmit.click();
		Thread.sleep(2000);
		submitbtn.click();
		Thread.sleep(2000);
		redirectbtn.click();
	}
	
	public void materialdetails() throws InterruptedException {
		Thread.sleep(2000);
		Quantity.click();
		Quantity.sendKeys("5");
		Thread.sleep(2000);
		svbtn.click();
	}
	
	public void saveindent() throws InterruptedException {
		Thread.sleep(2000);
		savebtn.click();
	}

}
