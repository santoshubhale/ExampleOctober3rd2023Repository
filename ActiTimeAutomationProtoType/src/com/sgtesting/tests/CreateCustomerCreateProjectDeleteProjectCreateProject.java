package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateCustomerCreateProjectDeleteProjectCreateProject {

	private static WebDriver oBrowser = null;

	@Test(priority = 1)
	public void launchBrowser() {
		try {
			oBrowser = new ChromeDriver();
			Assert.assertNotNull(oBrowser);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 2)
	public void navigateBrowser() {
		try {
			oBrowser.navigate().to("http://localhost/login.do");
			String title = oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 3, dataProvider = "loginData")
	public void login(String user, String pwd) {
		try {
			oBrowser.findElement(By.id("username")).sendKeys(user);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
			WebElement oEle = oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 4)
	public void minimizeFlyOutWindow() {
		try {
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			String attributeValue = oBrowser.findElement(By.id("gettingStartedShortcutsMenuWrapper"))
					.getAttribute("style");
			Assert.assertTrue(attributeValue.equals("display: none;"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 5)
	public static void createCustomer() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[2]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("santosh");
			oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Software Developer");
			oBrowser.findElement(By.id("customerLightBox_commitBtn")).click();
			Thread.sleep(5000);
			WebElement oEle = oBrowser.findElement(By.xpath("//div[text()='santosh']"));
			Assert.assertTrue(oEle.isDisplayed());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 6)
	public static void createProject() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[3]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Actitime Project");
			oBrowser.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("Automation Testing");
			oBrowser.findElement(By.id("projectPopup_commitBtn")).click();
			Thread.sleep(5000);
			WebElement oEle = oBrowser.findElement(By.xpath("//div[text()='Actitime Project']"));
			Assert.assertTrue(oEle.isDisplayed());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 7)
	public static void deleteProject() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"projectPanel_deleteConfirm_submitBtn\"]/div")).click();
			Thread.sleep(5000);
			WebElement oEle = oBrowser.findElement(By.xpath("//div[text()='Actitime Project']"));
			Assert.assertFalse(oEle.isDisplayed());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 8)
	public static void deleteCustomer() {
		try {

			oBrowser.findElement(
					By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]"))
					.click();
			Thread.sleep(5000);
			oBrowser.findElement(
					By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]"))
					.click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")).click();
			Thread.sleep(5000);
			WebElement oEle = oBrowser.findElement(By.xpath("//div[text()='santosh']"));
			Assert.assertFalse(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 9)
	public void logout() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			String title = oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 10)
	public void closeApplication() {
		oBrowser.quit();
		oBrowser = null;
		Assert.assertNull(oBrowser);
	}

	@DataProvider(name = "navigateURL")
	public Object[][] getAppURL() {
		return new Object[][] { { "http://localhost/login.do" } };
	}

	@DataProvider(name = "loginData")
	public Object[][] getLoginData() {
		return new Object[][] { { "admin", "manager" } };
	}

}
