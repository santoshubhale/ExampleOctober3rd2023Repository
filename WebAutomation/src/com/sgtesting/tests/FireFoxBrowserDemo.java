package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserDemo {
	private static WebDriver oBrowser = null;
	public static void main(String[] args) {
	//	launchBrowser();

	}

	private static void launchBrowser() {
		try {
			oBrowser = new FirefoxDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
