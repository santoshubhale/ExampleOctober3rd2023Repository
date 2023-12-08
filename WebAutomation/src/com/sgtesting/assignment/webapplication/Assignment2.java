package com.sgtesting.assignment.webapplication;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {
	private static WebDriver oBrowser = null;
	public static void main(String[] args) {
		launchBrowser();
		navigateBrowser();
		login();
		minimize();
		createUser();
		modifyUser();
		deleteUser();
		logout();
		closeApplication();

	}
	public static void launchBrowser() {
		try {

			oBrowser = new ChromeDriver();
			oBrowser.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void navigateBrowser() {
		try {

			oBrowser.get("http://localhost/login.do");
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void login() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//div[text()='Login ']")).click();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void minimize() {
		try {
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void createUser() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.name("firstName")).sendKeys("Demo2");
			oBrowser.findElement(By.name("lastName")).sendKeys("User2");
			oBrowser.findElement(By.name("email")).sendKeys("sg@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("DemoUser");
			oBrowser.findElement(By.name("password")).sendKeys("s123");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("s123");
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void modifyUser() {
		try {
			oBrowser.findElement(By.xpath("//span[text()='User2, Demo2']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.name("lastName")).clear();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("lastName")).sendKeys("User3");
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void deleteUser() {
		try {
			
			oBrowser.findElement(By.xpath("//span[text()='User3, Demo2']")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
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
	public static void logout() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(5000);
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
