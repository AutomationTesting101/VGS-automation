package com.erp.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.erp.qa.base.TestBase;
import com.erp.qa.pages.DasbordPage;
import com.erp.qa.pages.LoginPage;


public class LoginPageTest extends TestBase {

	DasbordPage dasbordPage;
	LoginPage loginPage;
	

	public LoginPageTest(){
		super();
		}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		dasbordPage = new DasbordPage();
		
	}
	
	
	
	@Test(priority=1)
	public void validateloginPageTitleTest(){
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "Kagami");
	}
	
	@Test(priority=2)
	public void validatelogupimgTest(){
		boolean flag = loginPage.validatevoltaImage();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void validatebuttonTest(){
		boolean flag = loginPage.validatebutton();
		Assert.assertFalse(flag);
	}
	
	
	@Test(priority=4)
	public void loginTest(){
		dasbordPage = loginPage.login(prop.getProperty("Username"), prop.getProperty("password"));
	}
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
