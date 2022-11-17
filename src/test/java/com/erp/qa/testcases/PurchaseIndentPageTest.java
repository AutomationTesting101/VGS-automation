package com.erp.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.erp.qa.base.TestBase;
import com.erp.qa.pages.DasbordPage;
import com.erp.qa.pages.LoginPage;
import com.erp.qa.pages.PurchaseIndentPage;
import com.erp.qa.util.TestUtil;

public class PurchaseIndentPageTest extends TestBase {

	DasbordPage dasbordPage;
	LoginPage loginPage;
	PurchaseIndentPage purchaseIndentPage;
	TestUtil testUtil;

	public PurchaseIndentPageTest(){
		super();
		}
	
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		dasbordPage = new DasbordPage();
		purchaseIndentPage = new PurchaseIndentPage();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		dasbordPage = loginPage.login(prop.getProperty("Username"), prop.getProperty("password"));
		Thread.sleep(2000);
		dasbordPage.clickOnpurchaseindentLink();
		
	}
	
	
	
	@Test(priority=1)
	public void validatedashbordPageTitleTest(){
		String title = dasbordPage.verifydashboardPageTitle();
		Assert.assertEquals(title, "Kagami");
	}
	
	
    @Test(priority=2)
	public void lookonpurchaseindentTest() throws InterruptedException{
    	purchaseIndentPage.serchindent();
	}
	
    @Test(priority=3)
   	public void discartpurchaseindentTest() throws InterruptedException{
       	purchaseIndentPage.discartindent();
   	}
    
    @Test(priority=4)
   	public void addindentTest() throws InterruptedException{
       	purchaseIndentPage.addnewbtn();
       	Thread.sleep(2000);
       	testUtil.branchselectmethod();
       	Thread.sleep(2000);
       	testUtil.Departmentselectmethod();
       	Thread.sleep(2000);
       	testUtil.projectselectmethod();
    	Thread.sleep(2000);
    	testUtil.divisionselectmethod();
    	Thread.sleep(2000);
    	purchaseIndentPage.clicknewpidetails();
    	Thread.sleep(2000);
    	testUtil.materialselectmethod();
    	Thread.sleep(2000);
    	purchaseIndentPage.materialdetails();
    	Thread.sleep(2000);
    	purchaseIndentPage.saveindent();
   	}
    
    @Test(priority=5)
   	public void submitindentTest() throws InterruptedException{
       	purchaseIndentPage.submitindent();
   	}

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
