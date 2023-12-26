package com.sgtesting.tests;

import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sgtesting.pageobjectmodel.ActiTimePage;

public class LoginLogoutInTestNg {

		
			public static WebDriver oBrowser = null;
			public static ActiTimePage oPage = null;
			
			@Test(priority = 1)
			public static void launchBrowser() {
				try {
					oBrowser= new ChromeDriver();
					oPage=new ActiTimePage(oBrowser);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			@Test(priority = 2)
			public static void navigate() {
				try {
					oBrowser.get("http://localhost/login.do");
					Thread.sleep(5000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			@Test(priority = 3, dataProvider = "adminLoginData")
			public static void login(String user , String pwd) {
				try {
					oPage.getUserName().sendKeys(user);
					Thread.sleep(3000);
					oPage.getPassWord().sendKeys(pwd);
					Thread.sleep(3000);
					oPage.getLoginButton().click();
					Thread.sleep(3000);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			@Test(priority = 4)
			public static void flyOutWindow() {
				try {
					oPage.getFlyOutWindow().click();
					Thread.sleep(3000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			@Test(priority = 5)
			public static void logout() {
				try {
					oPage.getLogout().click();
					Thread.sleep(3000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			@Test(priority = 6)
			public static void closeApplication() {
				try {
					oBrowser.quit();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
@DataProvider(name="adminLoginData")
public Object[][] getLoginData(){
	return new Object[][] {{"admin","manager"}};
}
		

}


