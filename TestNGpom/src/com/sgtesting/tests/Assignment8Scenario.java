package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sgtesting.pageobjectmodel.ActiTimeAssignment8;

public class Assignment8Scenario {
	public static WebDriver oBrowser = null;
	public static ActiTimeAssignment8 oPage = null;

	@Test(priority = 1)
	public void launchBrowser() {
		try {
			oBrowser = new ChromeDriver();
			oPage = new ActiTimeAssignment8(oBrowser);
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
	public void createUser() {
		try {
			oPage.getcreateuser().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 6)
	public void Adduser() {
		try {
			oPage.getAssUser().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 7)
	public void FN() {
		try {

			oPage.getFN().sendKeys("santosh");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 8)
	public void LN() {
		try {

			oPage.getLN().sendKeys("ubhale");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 9)
	public void Email() {
		try {

			oPage.getemail().sendKeys("santosh@gmail.com");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 10)
	public void username() {
		try {

			oPage.getusername().sendKeys("santosh");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 11)
	public void password() {
		try {

			oPage.getpassword().sendKeys("santosh@1");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 12)
	public void passwordcopy() {
		try {

			oPage.getpasswordcopy().sendKeys("santosh@1");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 13)
	public void createuser() {
		try {

			oPage.getCreateUser().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 14)
	public void Adduser2() {
		try {
			oPage.getAssUser().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 15)
	public void FN2() {
		try {

			oPage.getFN().sendKeys("suhas");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 16)
	public void LN2() {
		try {

			oPage.getLN().sendKeys("ubhale");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 17)
	public void Email2() {
		try {

			oPage.getemail().sendKeys("suhas@gmail.com");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 18)
	public void username2() {
		try {

			oPage.getusername().sendKeys("suhas");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 19)
	public void password2() {
		try {

			oPage.getpassword().sendKeys("suhas@1");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 20)
	public void passwordcopy2() {
		try {

			oPage.getpasswordcopy().sendKeys("suhas@1");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 21)
	public void createuser3() {
		try {

			oPage.getCreateUser().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 22)
	public void Adduser3() {
		try {
			oPage.getAssUser().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 23)
	public void FN3() {
		try {

			oPage.getFN().sendKeys("darshan");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 24)
	public void LN3() {
		try {

			oPage.getLN().sendKeys("ubhale");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 25)
	public void Email3() {
		try {

			oPage.getemail().sendKeys("darshan@gmail.com");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 26)
	public void username3() {
		try {

			oPage.getusername().sendKeys("darshan");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 27)
	public void password3() {
		try {

			oPage.getpassword().sendKeys("darshan@1");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 28)
	public void passwordcopy3() {
		try {

			oPage.getpasswordcopy().sendKeys("darshan@1");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 29)
	public void createuser2() {
		try {

			oPage.getCreateUser().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 30)
	public static void logout() {
		try {
			oPage.getLogout().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 31)
	public void loginuser1() {
		try {
			oPage.getUserName().sendKeys("santosh");
			Thread.sleep(3000);
			oPage.getPassWord().sendKeys("santosh@1");
			Thread.sleep(3000);
			oPage.getLoginButton().click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 32)
	public static void startExploreuser1() {
		try {
			oPage.getstartExploreActitime().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 33)
	public static void logoutuser1() {
		try {
			oPage.getLogout().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 34)
	public void loginuser2() {
		try {
			oPage.getUserName().sendKeys("suhas");
			Thread.sleep(3000);
			oPage.getPassWord().sendKeys("suhas@1");
			Thread.sleep(3000);
			oPage.getLoginButton().click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 35)
	public static void startExploreuser2() {
		try {
			oPage.getstartExploreActitime().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 36)
	public static void logoutuser2() {
		try {
			oPage.getLogout().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 37)
	public void loginuser3() {
		try {
			oPage.getUserName().sendKeys("darshan");
			Thread.sleep(3000);
			oPage.getPassWord().sendKeys("darshan@1");
			Thread.sleep(3000);
			oPage.getLoginButton().click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 38)
	public static void startExploreuser3() {
		try {
			oPage.getstartExploreActitime().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 39)
	public static void logoutuser3() {
		try {
			oPage.getLogout().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 40)
	public void loginAsAdmin() {
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

	@Test(priority = 41)
	public void adminuser() {

		try {
			oPage.getcreateuser().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 42)
	public void modify1() {

		try {
			oPage.getmodify1().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 43)
	public void modify1password() {
		try {

			oPage.getpassword().sendKeys("darshan@111");
			oPage.getpasswordcopy().sendKeys("darshan@111");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 44)
	public void modifycreateuser1() {
		try {

			oPage.getmodifysave().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 45)
	public void modify2() {

		try {
			oPage.getmodify2().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 46)
	public void modify2password() {
		try {

			oPage.getpassword().sendKeys("santosh@111");
			oPage.getpasswordcopy().sendKeys("santosh@111");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 47)

	public void modifycreateuser2() {
		try {

			oPage.getmodifysave().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 48)
	public void modify3() {

		try {
			oPage.getmodify3().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 49)
	public void modify3password() {
		try {

			oPage.getpassword().sendKeys("suhas@111");
			oPage.getpasswordcopy().sendKeys("suhas@111");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 50)

	public void modifycreateuser3() {
		try {

			oPage.getmodifysave().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 51)
	public static void modifylogoutadmin() {
		try {
			oPage.getLogout().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 52)
	public void modifyloginuser1() {
		try {
			oPage.getUserName().sendKeys("santosh");
			Thread.sleep(3000);
			oPage.getPassWord().sendKeys("santosh@111");
			Thread.sleep(3000);
			oPage.getLoginButton().click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 53)
	public static void modifylogoutuser1() {
		try {
			oPage.getLogout().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 54)
	public void modifyloginuser2() {
		try {
			oPage.getUserName().sendKeys("suhas");
			Thread.sleep(3000);
			oPage.getPassWord().sendKeys("suhas@111");
			Thread.sleep(3000);
			oPage.getLoginButton().click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 55)
	public static void modifylogoutuser2() {
		try {
			oPage.getLogout().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 56)
	public void modifyloginuser3() {
		try {
			oPage.getUserName().sendKeys("darshan");
			Thread.sleep(3000);
			oPage.getPassWord().sendKeys("darshan@111");
			Thread.sleep(3000);
			oPage.getLoginButton().click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 57)
	public static void modifylogoutuser3() {
		try {
			oPage.getLogout().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 58)
	public void Adminlogin() {
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

	@Test(priority = 59)
	public void modifycreateUser() {
		try {
			oPage.getcreateuser().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 60)
	public void modify1delete() {

		try {
			oPage.getdeletedarshan().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 61)
	public void user1delete() {
		try {

			oPage.getDelete().click();
			Thread.sleep(5000);
			Alert oAlert = oBrowser.switchTo().alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 62)
	public void modify2delete() {

		try {
			oPage.getdeletesantosh().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 63)
	public void user2delete() {
		try {

			oPage.getDelete().click();
			Thread.sleep(5000);
			Alert oAlert = oBrowser.switchTo().alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 64)
	public void modify3delete() {

		try {
			oPage.getdeletesuhas().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 65)
	public void user3delete() {
		try {

			oPage.getDelete().click();
			Thread.sleep(5000);
			Alert oAlert = oBrowser.switchTo().alert();
			String content = oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 66)
	public static void logoutlast() {
		try {
			oPage.getLogout().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Test(priority = 67)
	public static void closeApplication() {
		try {
			oBrowser.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
