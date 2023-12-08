package com.sgtesting.assignment.webapplication;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedAssignment8 {
	private static WebDriver oBrowser = null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimize();
		createUser();
		logout();
		loginAsUser1();
		StartExploreActiTimeuser1();
		logoutUser1();
		loginAsUser2();
		StartExploreActiTimeuser2();
		logoutUser2();
		loginAsUser3();
		StartExploreActiTimeuser3();
		logoutUser3();
		adminLogin();
		adminUser();
		modifyUsers();
		modifyLogout();
		modifyLoginAsUser1();
		modifylogoutUser1();
		modifyLoginAsUser2();
		modifyLogoutUser2();
		modifyLoginAsUser3();
		modifyLogoutUser3();
		afterModifyAdminLogin();
		afterModifyCreateUser();
		deleteUsers();
		endLogout();
		closeApplication();

	}

	private static void launchBrowser() {
		try {
			oBrowser = new ChromeDriver();
			oBrowser.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void navigate() {
		try {
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void login() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(5000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void minimize() {
		try {
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void createUser() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			// user 1
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user1");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("A");
			oBrowser.findElement(By.name("email")).sendKeys("user1@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("User1");
			oBrowser.findElement(By.name("password")).sendKeys("user@1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user@1");
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(4000);
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

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void logout() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// user 1
	public static void loginAsUser1() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("user1");
			Thread.sleep(5000);
			oBrowser.findElement(By.name("pwd")).sendKeys("user@1");
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void StartExploreActiTimeuser1() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void logoutUser1() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// user 2
	public static void loginAsUser2() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("user2");
			Thread.sleep(5000);
			oBrowser.findElement(By.name("pwd")).sendKeys("user@2");
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void StartExploreActiTimeuser2() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void logoutUser2() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// user 3
	public static void loginAsUser3() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("user3");
			Thread.sleep(5000);
			oBrowser.findElement(By.name("pwd")).sendKeys("user@3");
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void StartExploreActiTimeuser3() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void logoutUser3() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Admin login
	private static void adminLogin() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(5000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void adminUser() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void modifyUsers() {
		try {
			// modify user1
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
			// modify user 2
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.name("password")).sendKeys("user@222");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user@222");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div")).click();
			Thread.sleep(4000);
			// modify user 3
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.name("password")).sendKeys("user@333");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user@333");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void modifyLogout() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// modify user 1
	public static void modifyLoginAsUser1() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("user1");
			Thread.sleep(5000);
			oBrowser.findElement(By.name("pwd")).sendKeys("user@111");
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void modifylogoutUser1() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// modify user 2
	public static void modifyLoginAsUser2() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("user2");
			Thread.sleep(5000);
			oBrowser.findElement(By.name("pwd")).sendKeys("user@222");
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void modifyLogoutUser2() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// modify user 3
	public static void modifyLoginAsUser3() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("user3");
			Thread.sleep(5000);
			oBrowser.findElement(By.name("pwd")).sendKeys("user@333");
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void modifyLogoutUser3() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void afterModifyAdminLogin() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(5000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void afterModifyCreateUser() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

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
			// user 2 delete
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert1 = oBrowser.switchTo().alert();
			String content1 = oAlert1.getText();
			System.out.println(content1);
			oAlert.accept();
			Thread.sleep(2000);
			// user 3 delete
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert2 = oBrowser.switchTo().alert();
			String content2 = oAlert2.getText();
			System.out.println(content2);
			oAlert.accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void endLogout() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void closeApplication() {
		try {
			oBrowser.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
