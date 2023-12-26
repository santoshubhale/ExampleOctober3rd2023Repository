package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutWebElementDemo {

	private static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		
	}
	
	private static void launchBrowser()
	{
		try
		{
			oBrowser=new ChromeDriver();
			oBrowser.manage().window().maximize();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("demoUser1");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).sendKeys("demoUser2");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).sendKeys("demoUser3");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).sendKeys("demoUser4");
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).clear();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("username")).sendKeys("demoUser12345");
			Thread.sleep(1000);
			String v1=oBrowser.findElement(By.id("username")).getAttribute("value");
			System.out.println(v1);
			Thread.sleep(1000);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
