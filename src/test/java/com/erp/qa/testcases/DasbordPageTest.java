package com.erp.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.erp.qa.base.TestBase;
import com.erp.qa.pages.DasbordPage;
import com.erp.qa.pages.LoginPage;

public class DasbordPageTest extends TestBase {
	DasbordPage dasbordPage;
	LoginPage loginPage;
	

	public DasbordPageTest(){
		super();
		}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		dasbordPage = new DasbordPage();
		loginPage = new LoginPage();
		dasbordPage = loginPage.login(prop.getProperty("Username"), prop.getProperty("password"));
	
	}
	
	
	
	@Test(priority=1)
	public void validatedashbordPageTitleTest(){
		String title = dasbordPage.verifydashboardPageTitle();
		Assert.assertEquals(title, "Kagami");
	}
	
	@Test(priority=2)
	public void validatelogoTest(){
		boolean flag = dasbordPage.validatelogo();
		Assert.assertTrue(flag);
	}

    @Test(priority=3)
	public void clickpurchaseindentTest(){
    	try {
    		Thread.sleep(2000);
    		} catch (InterruptedException e) {
    		e.printStackTrace();
    		}
		dasbordPage.clickOnpurchaseindentLink();
		
	}
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
