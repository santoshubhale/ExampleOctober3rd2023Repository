package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sgtesting.pageobjectmodel.ActiTimePageForCreateUserAll;

public class CreateUserScenario {

	public static WebDriver oBrowser = null;
	public static ActiTimePageForCreateUserAll oPage = null;

	@Test(priority = 1)
	public void launchBrowser() {
		try {
			oBrowser = new ChromeDriver();
			oPage = new ActiTimePageForCreateUserAll(oBrowser);
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
			
			oPage.getemail().sendKeys("s@gmail.com");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 10)
	public void username() {
		try {
			
			oPage.getusername().sendKeys("su");
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
	public void modifyUserdata() {
		try {
			
			oPage.getmodifyuserdata().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 15)
	public void modifyData() {
		try {
			
			oPage.getLNmodification().clear();
			Thread.sleep(2000);
			oPage.getLNmodification().sendKeys("software");
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 16)
	public void modifycreateuser() {
		try {
			
			oPage.getmodifyCreateUser().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 17)
	public void userForOpen() {
		try {
			
			oPage.getuserForDelete().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 18)
	public void userdelete() {
		try {
			
			oPage.getuserDelete().click();
			Thread.sleep(5000);
			 Alert oAlert=oBrowser.switchTo().alert();
			   String content=oAlert.getText();
			   System.out.println(content);
			   oAlert.accept();
			   Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test(priority = 19)
	public static void logout() {
		try {
			oPage.getLogout().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test(priority = 20)
	public static void closeApplication() {
		try {
			oBrowser.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
