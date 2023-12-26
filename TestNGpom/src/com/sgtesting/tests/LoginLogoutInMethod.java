package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sgtesting.pageobjectmodel.ActiTimePage;

public class LoginLogoutInMethod {
	public static WebDriver oBrowser = null;
	public static ActiTimePage oPage = null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		flyOutWindow();
		logout();
		closeApplication();

	}
	public static void launchBrowser() {
		try {
			oBrowser= new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void navigate() {
		try {
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void login() {
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
	public static void flyOutWindow() {
		try {
			oPage.getFlyOutWindow().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void logout() {
		try {
			oPage.getLogout().click();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void closeApplication() {
		try {
			oBrowser.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
