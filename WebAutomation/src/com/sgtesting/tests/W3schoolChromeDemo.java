package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3schoolChromeDemo {
	private static WebDriver oBrowser = null;

	public static void main(String[] args) {
		launchBrowser();
		navigateBrowser();
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

	private static void navigateBrowser() {
		try {

			oBrowser.get("https://www.w3schools.in");
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
