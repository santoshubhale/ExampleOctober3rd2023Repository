package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	public ActiTimePage(WebDriver oBrowser) {
		PageFactory.initElements(oBrowser, this);
	}

	// Create webElement for user Name text field
	private WebElement username;

	public WebElement getUserName() {
		return username;
	}
	// Create webElement for password text field

	private WebElement pwd;

	public WebElement getPassWord() {
		return pwd;
	}
	// Create webElement for login button

	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLoginButton() {
		return oLogin;
	
	}
	// create webElement fly out window
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow() {
		return gettingStartedShortcutsPanelId;
	}
	
	// create webelement for logout link
	@FindBy(linkText = "Logout")
	private WebElement oLogout;
	public WebElement getLogout() {
		return oLogout;
	}
	
}
