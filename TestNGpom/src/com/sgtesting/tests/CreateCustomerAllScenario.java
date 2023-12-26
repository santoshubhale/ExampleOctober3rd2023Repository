package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.sgtesting.pageobjectmodel.ActiTimeCreateCustomerAll;

public class CreateCustomerAllScenario {
	public static WebDriver oBrowser = null;
	public static ActiTimeCreateCustomerAll oPage = null;

	@Test(priority = 1)
	public void launchBrowser() {
		try {
			oBrowser = new ChromeDriver();
			oPage = new ActiTimeCreateCustomerAll(oBrowser);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 2)
	public void navigate() {
		try {
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 3)
	public void login() {
		try {
			oPage.getUserName().sendKeys("admin");
			Thread.sleep(3000);
			oPage.getPassWord().sendKeys("manager");
			Thread.sleep(3000);
			oPage.getLoginButton().click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 4)
	public void flyOutWindow() {
		try {
			oPage.getFlyOutWindow().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 5)
	public void taskClick() {
		try {
			oPage.getTask().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 6)
	public void AddnewTask() {
		try {
			oPage.getAddNewTask().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 7)
	public void AddnewCustomer() {
		try {
			oPage.getAddNewCustomer().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 8)
	public void InsertDataIntoCustomer() {
		try {
			oPage.getInsertCustomerData().sendKeys("santosh");
			Thread.sleep(3000);
			// customer descriptionField insert data
			oPage.getInsertCustomerDataDiscription().sendKeys("Software Developer Engineer");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 9)
	public void clickCustomerButton() {
		try {
			oPage.getclickCreateButton().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 10)
	public void clickCustomerSettingButton() {
		try {
			oPage.getclickSettingButton().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 11)
	public void clickCustomerActiveButton() {
		try {
			oPage.getclickActiveButton().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 12)
	public void clickCustomerArchivedButton() {
		try {
			oPage.getclickArchivedButton().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 13)
	public void clickActionButton() {
		try {
			oPage.getActionButton().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 14)
	public void clickDeleteButton() {
		try {
			oPage.getDeleteButton().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 15)
	public void clickpermanenetDeleteButton() {
		try {
			oPage.getpermanentDelete().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 16)
	public static void logout() {
		try {
			oPage.getLogout().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test(priority = 17)
	public static void closeApplication() {
		try {
			oBrowser.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}