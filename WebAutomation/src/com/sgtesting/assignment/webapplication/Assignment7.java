package com.sgtesting.assignment.webapplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
	public static WebDriver oBrowser = null;

	public static void main(String[] args) {
		launchBrowser();
		navigateBrowser();
		login();
		minimize();
		createCustomer();
		createProject();
		createTask();
		deleteTask();
		deleteProject();
		deleteCustomer();
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
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void minimize() {
		try {
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void createCustomer() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("santosh");
			oBrowser.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Software Developer");
			oBrowser.findElement(By.id("customerLightBox_commitBtn")).click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void createProject() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[3]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Actitime Project");
			oBrowser.findElement(By.id("projectPopup_projectDescriptionField")).sendKeys("Automation Testing");
			oBrowser.findElement(By.id("projectPopup_commitBtn")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void createTask() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[1]/div[3]/div/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("/html/body/div[13]/div[1]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_createTasksTableContainer\"]/table/tbody/tr[1]/td[1]/input")).sendKeys("Task1");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"createTasksPopup_commitBtn\"]/div/span")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void deleteTask() {
		try {
			oBrowser.findElement(By.xpath("//div[text()='Task1']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[3]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[3]/div[4]/div/div[3]/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Delete permanently']")).click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void deleteProject() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"projectPanel_deleteConfirm_submitBtn\"]/div")).click();
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void deleteCustomer() {
		try {

			oBrowser.findElement(
					By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]"))
					.click();
			Thread.sleep(5000);
			oBrowser.findElement(
					By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]"))
					.click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"customerPanel_deleteConfirm_submitBtn\"]/div")).click();
			Thread.sleep(5000);
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