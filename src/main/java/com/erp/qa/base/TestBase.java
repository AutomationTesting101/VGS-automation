package com.erp.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;

	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+  "\\src\\main\\java\\com\\erp"
					+ "\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	


	public static void initialization(){
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			ChromeOptions CO = new ChromeOptions();
			CO.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			System.setProperty("webdriver.chrome.driver", "D:\\selenium file\\webdriver\\chromedriver.exe");	
			driver = new ChromeDriver(CO); 
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "D:\\selenium file\\webdriver\\geckodriver.exe");	
			driver = new FirefoxDriver(); 
		}
		
	
		
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
    new WebDriverWait(driver, Duration.ofSeconds(120));

		
	driver.get(prop.getProperty("url"));
   }
	
}
