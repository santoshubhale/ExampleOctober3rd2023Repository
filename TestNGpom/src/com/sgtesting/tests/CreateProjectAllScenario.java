package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sgtesting.pageobjectmodel.ActiTimeCreateProjectAll;

public class CreateProjectAllScenario {
	public static WebDriver oBrowser = null;
	public static ActiTimeCreateProjectAll oPage = null;

	@Test(priority = 1)
	public void launchBrowser() {
		try {
			oBrowser = new ChromeDriver();
			oPage = new ActiTimeCreateProjectAll(oBrowser);
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
	public void AddnewProject() {
		try {
			oPage.getNewProject().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 8)
	public void insertdataintoProject() {
		try {
			oPage.getinsertdataProject().click();
			oPage.getinsertdataProject().sendKeys("helth project");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 9)
	public void insertdataintocustomer() {
		try {

			oPage.getinsertdatacustomer().sendKeys("krishna");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 10)
	public void clickCreateButton() {
		try {

			oPage.getcreateButton().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 11)
	public void clickCustomerSettingButton() {
		try {
			oPage.getclickSettingButton().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 12)
	public void clickCustomerActiveButton() {
		try {
			oPage.getclickActiveButton().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 13)
	public void clickCustomerArchivedButton() {
		try {
			oPage.getclickArchivedButton().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 14)
	public void clickActionButton() {
		try {
			oPage.getActionButton().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 15)
	public void clickDeleteButton() {
		try {
			oPage.getDeleteButton().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 16)
	public void clickpermanenetDeleteButton() {
		try {
			oPage.getpermanentDelete().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 17)
	public static void logout() {
		try {
			oPage.getLogout().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test(priority = 18)
	public static void closeApplication() {
		try {
			oBrowser.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
