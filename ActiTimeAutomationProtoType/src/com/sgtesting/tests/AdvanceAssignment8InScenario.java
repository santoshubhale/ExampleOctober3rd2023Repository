package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdvanceAssignment8InScenario {
	private static WebDriver oBrowser = null;

	@Test(priority = 1)
	public void launchBrowser() {
		try {
			oBrowser = new ChromeDriver();
		//	oBrowser.manage().window().maximize();
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
	public void createUser() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(5000);
			// user 1
			oBrowser.findElement(By.name("firstName")).sendKeys("user1");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("A");
			oBrowser.findElement(By.name("email")).sendKeys("sg@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User1");
			oBrowser.findElement(By.name("password")).sendKeys("user@1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user@1");
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(5000);
			WebElement oEle = oBrowser.findElement(By.xpath("//span[text()='A, user1']"));
			Assert.assertTrue(oEle.isDisplayed());
			// user 2
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user2");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("B");
			oBrowser.findElement(By.name("email")).sendKeys("user2@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("User2");
			oBrowser.findElement(By.name("password")).sendKeys("user@2");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user@2");
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(4000);
			WebElement oEle1 = oBrowser.findElement(By.xpath("//span[text()='B, user2']"));
			Assert.assertTrue(oEle1.isDisplayed());
			// user 3
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user3");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("C");
			oBrowser.findElement(By.name("email")).sendKeys("user3@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("User3");
			oBrowser.findElement(By.name("password")).sendKeys("user@3");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user@3");
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(4000);
			WebElement oEle2 = oBrowser.findElement(By.xpath("//span[text()='C, user3']"));
			Assert.assertTrue(oEle2.isDisplayed());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 6)
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

	@Test(priority = 7, dataProvider = "loginDataUser1")
	public void loginUser1(String user, String pwd) {
		try {
			oBrowser.findElement(By.id("username")).sendKeys(user);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
			WebElement oEle = oBrowser.findElement(By.xpath("//div[text()='Welcome to actiTIME!']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 8)
	private static void StartExploreActiTimeuser1() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			WebElement oEle = oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 9)
	public static void logoutUser1() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
			String title = oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 10, dataProvider = "loginDataUser2")
	public void loginUser2(String user, String pwd) {
		try {
			oBrowser.findElement(By.id("username")).sendKeys(user);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
			WebElement oEle = oBrowser.findElement(By.xpath("//div[text()='Welcome to actiTIME!']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 11)
	private static void StartExploreActiTimeuser2() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			WebElement oEle = oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 12)
	public static void logoutUser2() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
			String title = oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 13, dataProvider = "loginDataUser3")
	public void loginUser3(String user, String pwd) {
		try {
			oBrowser.findElement(By.id("username")).sendKeys(user);
			oBrowser.findElement(By.name("pwd")).sendKeys(pwd);
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
			WebElement oEle = oBrowser.findElement(By.xpath("//div[text()='Welcome to actiTIME!']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 14)
	private static void StartExploreActiTimeuser3() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			WebElement oEle = oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 15)
	public static void logoutUser3() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
			String title = oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 16, dataProvider = "loginDataAdmin")
	public void loginAsAdmin(String user, String pwd) {
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

	@Test(priority = 17)
	private static void adminUser() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			WebElement oEle = oBrowser.findElement(By.xpath("//span[text()='A, user1']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 18)
	public void modifyUser() {
		try {
			oBrowser.findElement(By.xpath(
					"//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]"))
					.click();
			Thread.sleep(4000);
			oBrowser.findElement(By.name("password")).sendKeys("user@111");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user@111");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div")).click();
			Thread.sleep(4000);
			WebElement oEle = oBrowser.findElement(By.xpath("//span[text()='A, user1']"));
			Assert.assertTrue(oEle.isDisplayed());
			// modify user 2
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.name("password")).sendKeys("user@222");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user@222");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div")).click();
			Thread.sleep(4000);
			WebElement oEle1 = oBrowser.findElement(By.xpath("//span[text()='B, user2']"));
			Assert.assertTrue(oEle1.isDisplayed());
			// modify user 3
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.name("password")).sendKeys("user@333");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user@333");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div")).click();
			Thread.sleep(4000);
			WebElement oEle2 = oBrowser.findElement(By.xpath("//span[text()='C, user3']"));
			Assert.assertTrue(oEle2.isDisplayed());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 19)
	public static void modifylogout() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
			String title = oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 20, dataProvider = "loginDataAfterModifyUser1")
	public void modifyloginUser1(String user, String pwd) {
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
	@Test(priority = 21)
	public static void modifyuser1logout() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
			String title = oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 22, dataProvider = "loginDataAfterModifyUser2")
	public void modifyloginUser2(String user, String pwd) {
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
	@Test(priority = 23)
	public static void modifyuser2logout() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
			String title = oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 24, dataProvider = "loginDataAfterModifyUser3")
	public void modifyloginUser3(String user, String pwd) {
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
	@Test(priority = 25)
	public static void modifyuser3logout() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
			String title = oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 26, dataProvider = "loginDataAdminAfterModify")
	public void loginAsAdminAfterModify(String user, String pwd) {
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

	@Test(priority = 27)
	private static void adminUserAfterModify() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			WebElement oEle = oBrowser.findElement(By.xpath("//span[text()='A, user1']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	@Test(priority = 28)
	private static void deleteUsers() {
		try {
			// user 1 delete
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table"))
					.click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert = oBrowser.switchTo().alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			WebElement oEle = oBrowser.findElement(By.xpath("//span[text()='A, user1']"));
			Assert.assertFalse(oEle.isDisplayed());
			// user 2 delete
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert1 = oBrowser.switchTo().alert();
			String content1 = oAlert1.getText();
			System.out.println(content1);
			oAlert1.accept();
			Thread.sleep(2000);
			WebElement oEle1 = oBrowser.findElement(By.xpath("//span[text()='B, user2']"));
			Assert.assertFalse(oEle1.isDisplayed());
			// user 3 delete
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert2 = oBrowser.switchTo().alert();
			String content2 = oAlert2.getText();
			System.out.println(content2);
			oAlert2.accept();
			Thread.sleep(2000);
			WebElement oEle2 = oBrowser.findElement(By.xpath("//span[text()='C, user3']"));
			Assert.assertFalse(oEle2.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 29)
	public void endlogout()
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
	
	@Test(priority = 30)
	public void closeApplication()
	{
		try {
			
			oBrowser.quit();
			oBrowser=null;
			Assert.assertNull(oBrowser);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@DataProvider(name = "navigateURL")
	public Object[][] getAppURL() {
		return new Object[][] { { "http://localhost/login.do" } };
	}

	@DataProvider(name = "loginData")
	public Object[][] getLoginData() {
		return new Object[][] { { "admin", "manager" } };
	}

	@DataProvider(name = "loginDataUser1")
	public Object[][] getLoginDatauser1() {
		return new Object[][] { { "user1", "user@1" } };
	}

	@DataProvider(name = "loginDataUser2")
	public Object[][] getLoginDatauser2() {
		return new Object[][] { { "user2", "user@2" } };
	}

	@DataProvider(name = "loginDataUser3")
	public Object[][] getLoginDatauser3() {
		return new Object[][] { { "user3", "user@3" } };
	}

	@DataProvider(name = "loginDataAdmin")
	public Object[][] getLoginDataAdmin() {
		return new Object[][] { { "admin", "manager" } };
	}
	@DataProvider(name = "loginDataAfterModifyUser1")
	public Object[][] getLoginDataAfterModifyuser1() {
		return new Object[][] { { "user1", "user@111" } };
	}
	@DataProvider(name = "loginDataAfterModifyUser2")
	public Object[][] getLoginDataAfterModifyuser2() {
		return new Object[][] { { "user2", "user@222" } };
	}
	@DataProvider(name = "loginDataAfterModifyUser3")
	public Object[][] getLoginDataAfterModifyuser3() {
		return new Object[][] { { "user3", "user@333" } };
	}
	@DataProvider(name = "loginDataAdminAfterModify")
	public Object[][] loginDataAdminAfterModify() {
		return new Object[][] { { "admin", "manager" } };
	}
}
