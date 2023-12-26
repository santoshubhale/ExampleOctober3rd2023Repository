package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateUserScanario {
	private static WebDriver oBrowser = null;

	@Test(priority = 1)
	public void launchBrowser() {
		try {
			oBrowser=new ChromeDriver();
			Assert.assertNotNull(oBrowser);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test (priority = 2)
	public void navigateBrowser() {
		try {
			oBrowser.navigate().to("http://localhost/login.do");
			String title=oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 3, dataProvider = "loginData")
	public void login(String user,String pwd)
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys(user);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
			WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority = 4)
	public void minimizeFlyOutWindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
			String attributeValue=oBrowser.findElement(By.id("gettingStartedShortcutsMenuWrapper")).getAttribute("style");
			Assert.assertTrue(attributeValue.equals("display: none;"));
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	@Test(priority = 5)
	public void createUser() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Demo1");
			oBrowser.findElement(By.name("lastName")).sendKeys("User1");
			oBrowser.findElement(By.name("email")).sendKeys("sg@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("DemoUser");
			oBrowser.findElement(By.name("password")).sendKeys("s123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("s123");
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(5000);
			WebElement oEle = oBrowser.findElement(By.xpath("//span[text()='User1, Demo1']")) ;
			Assert.assertTrue(oEle.isDisplayed());			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(priority = 6)
	public void logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			String title=oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	@Test(priority = 7)
	public void closeApplication()
	{
		oBrowser.quit();
		oBrowser=null;
		Assert.assertNull(oBrowser);
	}
	
	@DataProvider(name="navigateURL")
	public Object[][] getAppURL()
	{
		return new Object[][] {{"http://localhost/login.do"}};
	}
	
	@DataProvider(name = "loginData")
	public Object[][] getLoginData()
	{
		return new Object[][] {{"admin","manager"}};
	}
}
