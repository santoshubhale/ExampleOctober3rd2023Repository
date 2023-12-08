package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActTimeInFireFoxBrowserDemo {

	
		private static WebDriver oBrowser=null;
		public static void main(String[] args) {
			launchBrowser();
			navigateBrowser();
			claseApplication();
		}

		private static void launchBrowser() {
			try {
				
				oBrowser = new FirefoxDriver();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		private static void navigateBrowser() {
			try {
				
				oBrowser.get("http://localhost/login.do");
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
