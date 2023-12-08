package com.sgtesting.tests;

import java.lang.annotation.Native;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBroweserDemo {
	public static WebDriver oBrowser = null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		clossApplication();
	}

	private static void launchBrowser() {
		try {
			oBrowser = new ChromeDriver();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void navigate() {
		try {
			oBrowser.get("http://localhost/login.do");
		//	oBrowser.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void clossApplication() {
		try {
		oBrowser.close();
		} catch (Exception e) {
			
		}
	}

}
