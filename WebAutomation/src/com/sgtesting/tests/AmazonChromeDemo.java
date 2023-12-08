package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonChromeDemo {
	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigateBrowser();
		claseApplication();
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
			
			oBrowser.get("https://www.amazon.in");
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void claseApplication() {
		try {
			oBrowser.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
