package com.erp.qa.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.erp.qa.base.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 120;
	public static long IMPLICIT_WAIT = 120;

	public void branchselectmethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/kgm-container[1]/div[1]/div[1]/div[1]/kgm-content[1]/div[1]/kgm-process[1]/div[1]/ui-view[1]/kgm-pc-embed-form-presentation[1]/kgm-pc-embed[1]/div[1]/div[2]/kgm-step-wizard[1]/div[1]/div[1]/div[1]/kgm-step-wizard-step[1]/section[1]/div[1]/div[1]/div[1]/div[1]/kgm-field[1]/div[1]/kgm-async-search[1]/div[1]/div[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath(
				"//ul[@class='ui-select-choices ui-select-choices-content ui-select-dropdown dropdown-menu ng-scope withOutImage']//div"));
		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().equals("DUMMY")) {
				list.get(i).click();
				break;
			}
		}
	}

	public void Departmentselectmethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/kgm-container[1]/div[1]/div[1]/div[1]/kgm-content[1]/div[1]/kgm-process[1]/div[1]/ui-view[1]/kgm-pc-embed-form-presentation[1]/kgm-pc-embed[1]/div[1]/div[2]/kgm-step-wizard[1]/div[1]/div[1]/div[1]/kgm-step-wizard-step[1]/section[1]/div[1]/div[3]/div[1]/div[1]/kgm-field[1]/div[1]/kgm-async-search[1]/div[1]/div[1]/div[1]/span[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath(
				"//ul[@class='ui-select-choices ui-select-choices-content ui-select-dropdown dropdown-menu ng-scope withOutImage']//div"));
		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().equals("Management")) {
				list.get(i).click();
				break;
			}
		}
	}

	public void projectselectmethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/kgm-container[1]/div[1]/div[1]/div[1]/kgm-content[1]/div[1]/kgm-process[1]/div[1]/ui-view[1]/kgm-pc-embed-form-presentation[1]/kgm-pc-embed[1]/div[1]/div[2]/kgm-step-wizard[1]/div[1]/div[1]/div[1]/kgm-step-wizard-step[1]/section[1]/div[1]/div[4]/div[1]/div[1]/kgm-field[1]/div[1]/kgm-async-search[1]/div[1]/div[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath(
				"//ul[@class='ui-select-choices ui-select-choices-content ui-select-dropdown dropdown-menu ng-scope withOutImage']//div"));
		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().equals("Dummy Project1 - 100242")) {
				list.get(i).click();
				break;
			}
		}
	}

	public void divisionselectmethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/kgm-container[1]/div[1]/div[1]/div[1]/kgm-content[1]/div[1]/kgm-process[1]/div[1]/ui-view[1]/kgm-pc-embed-form-presentation[1]/kgm-pc-embed[1]/div[1]/div[2]/kgm-step-wizard[1]/div[1]/div[1]/div[1]/kgm-step-wizard-step[1]/section[1]/div[1]/div[5]/div[1]/div[1]/kgm-field[1]/div[1]/kgm-async-search[1]/div[1]/div[1]/div[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath(
				"//ul[@class='ui-select-choices ui-select-choices-content ui-select-dropdown dropdown-menu ng-scope withOutImage']//div"));
		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().equals("Rapid Building Structures")) {
				list.get(i).click();
				break;
			}
		}
	}
	
	public void materialselectmethod() throws InterruptedException {
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[5]/input[1]"))
				.click();
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath(
				"/html[1]/body[1]/div[5]/ul[1]//div"));
		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().equals("TO100265")) {
				list.get(i).click();
				break;
			}
		}
	}

	
}
