package com.erp.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erp.qa.base.TestBase;


public class LoginPage extends TestBase{
	
	// Page Factory - OR:
			@FindBy(xpath = "//input[@id='username']")
			WebElement username;

			@FindBy(xpath = "//form[@name='loginForm']//input[@id='password']")
			WebElement password;

			@FindBy(xpath = "//input[@value='Sign In']")
			WebElement signinBtn;

			@FindBy(xpath = "//form[@name='loginForm']//img[@title='Powered by KagamiERP']")
			WebElement voltaLogo;

			// Initializing the Page Objects:
			public LoginPage() {
				PageFactory.initElements(driver, this);
			}

			// Actions:
			public String validateLoginPageTitle() {
				return driver.getTitle();
			}

			public boolean validatevoltaImage(){
					return voltaLogo.isDisplayed();
			}
			
			public boolean validatebutton(){
				return signinBtn.isEnabled();
		}
			
			public DasbordPage login(String un, String pwd){
				username.sendKeys(un);
				password.sendKeys(pwd);
				signinBtn.click();
				return new DasbordPage();
			}
		

}
