package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdvanceAssignment9InScenario {
	private static WebDriver oBrowser = null;

	@Test(priority = 1)
	public void launchBrowser() {
		try {
			oBrowser = new ChromeDriver();
			// oBrowser.manage().window().maximize();
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

	@Test(priority = 3)
	public void login() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
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
	public void createUser1() {
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

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 6)
	public void logoutadmin() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
			String title = oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 7)
	public void loginUser1() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("user1");
			oBrowser.findElement(By.name("pwd")).sendKeys("user@1");
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
	public void createUser2() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(5000);
			// user 1
			oBrowser.findElement(By.name("firstName")).sendKeys("user2");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("B");
			oBrowser.findElement(By.name("email")).sendKeys("sg@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User2");
			oBrowser.findElement(By.name("password")).sendKeys("user@2");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user@2");
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(5000);
			WebElement oEle = oBrowser.findElement(By.xpath("//span[text()='B, user2']"));
			Assert.assertTrue(oEle.isDisplayed());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 10)
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

	@Test(priority = 11)
	public void loginUser2() {
		try {
			oBrowser.findElement(By.name("username")).sendKeys("user2");
			oBrowser.findElement(By.name("pwd")).sendKeys("user@2");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
			WebElement oEle = oBrowser.findElement(By.xpath("//div[text()='Welcome to actiTIME!']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 12)
	private static void StartExploreActiTimeuser2() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			WebElement oEle = oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 13)
	public void createUser3() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(5000);
			// user 1
			oBrowser.findElement(By.name("firstName")).sendKeys("user3");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("C");
			oBrowser.findElement(By.name("email")).sendKeys("sg@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("User3");
			oBrowser.findElement(By.name("password")).sendKeys("user@3");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user@3");
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(5000);
			WebElement oEle = oBrowser.findElement(By.xpath("//span[text()='B, user2']"));
			Assert.assertTrue(oEle.isDisplayed());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 14)
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

	@Test(priority = 15)
	public void loginUser3() {
		try {
			oBrowser.findElement(By.name("username")).sendKeys("user3");
			oBrowser.findElement(By.name("pwd")).sendKeys("user@3");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
			WebElement oEle = oBrowser.findElement(By.xpath("//div[text()='Welcome to actiTIME!']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 16)
	private static void StartExploreActiTimeuser3() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			WebElement oEle = oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 17)
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

	@Test(priority = 18)
	public void loginUser2ForModifyUser3() {
		try {
			oBrowser.findElement(By.name("username")).sendKeys("user2");
			oBrowser.findElement(By.name("pwd")).sendKeys("user@2");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
			WebElement oEle = oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 19)
	public void modifyPasswordForUser3() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
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

	@Test(priority = 20)
	public static void logoutUser2AfterModification() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
			String title = oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 21)
	public void loginUser3AfterModification() {
		try {
			oBrowser.findElement(By.name("username")).sendKeys("user3");
			oBrowser.findElement(By.name("pwd")).sendKeys("user@333");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
			WebElement oEle = oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 22)
	public static void logoutUser3AfterModification() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
			String title = oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 23)
	public void loginUser1ForModifyUser2() {
		try {
			oBrowser.findElement(By.name("username")).sendKeys("user1");
			oBrowser.findElement(By.name("pwd")).sendKeys("user@1");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
			WebElement oEle = oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 24)
	public void modifyPasswordForUser2() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath(
					"//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]"))
					.click();
			Thread.sleep(4000);
			oBrowser.findElement(By.name("password")).sendKeys("user@222");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user@222");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div")).click();
			Thread.sleep(4000);
			WebElement oEle2 = oBrowser.findElement(By.xpath("//span[text()='B, user2']"));
			Assert.assertTrue(oEle2.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 25)
	public static void logoutUser1AfterModification() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
			String title = oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 26)
	public void loginUser2AfterModification() {
		try {
			oBrowser.findElement(By.name("username")).sendKeys("user2");
			oBrowser.findElement(By.name("pwd")).sendKeys("user@222");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
			WebElement oEle = oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 27)
	public static void logoutUser2AfterNextModification() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
			String title = oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 28)
	public void loginAdmin() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
			WebElement oEle = oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 29)
	public void modifyPasswordForUser1() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
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
			WebElement oEle2 = oBrowser.findElement(By.xpath("//span[text()='A, user1']"));
			Assert.assertTrue(oEle2.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 30)
	public static void logoutUser1AfterAdminModify() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
			String title = oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 31)
	public void loginAsUser1AfterModification() {
		try {
			oBrowser.findElement(By.name("username")).sendKeys("user1");
			oBrowser.findElement(By.name("pwd")).sendKeys("user@111");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
			WebElement oEle = oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 32)
	public static void logoutAsUser1AfterModification() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
			String title = oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 33)
	public void loginAsUser2last() {
		try {
			oBrowser.findElement(By.name("username")).sendKeys("user2");
			oBrowser.findElement(By.name("pwd")).sendKeys("user@222");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
			WebElement oEle = oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 34)
	public static void DeleteUser3() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]")).click();
			Thread.sleep(4000);
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
	@Test(priority = 35)
	public static void logoutuser2() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
			String title = oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 36)
	public void loginAsUser1last() {
		try {
			oBrowser.findElement(By.name("username")).sendKeys("user1");
			oBrowser.findElement(By.name("pwd")).sendKeys("user@111");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
			WebElement oEle = oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 37)
	public static void DeleteUser2() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath(
					"//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]"))
					.click();
			Thread.sleep(4000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert1 = oBrowser.switchTo().alert();
			String content1 = oAlert1.getText();
			System.out.println(content1);
			oAlert1.accept();
			Thread.sleep(2000);
			WebElement oEle1 = oBrowser.findElement(By.xpath("//span[text()='B, user2']"));
			Assert.assertFalse(oEle1.isDisplayed());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 38)
	public static void logoutuser1() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
			String title = oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 39)
	public void loginlastAdmin() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);
			WebElement oEle = oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 40)
	public static void DeleteUser1() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert = oBrowser.switchTo().alert();
			String content2 = oAlert.getText();
			System.out.println(content2);
			oAlert.accept();
			Thread.sleep(2000);
			WebElement oEle1 = oBrowser.findElement(By.xpath("//span[text()='A, user1']"));
			Assert.assertFalse(oEle1.isDisplayed());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 41)
	public static void logoutlastuser1() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
			String title = oBrowser.getTitle();
			Assert.assertEquals("actiTIME - Login", title);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 42)
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

}