package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePageForCreateCustomerAndDeleteCustomer {
	public ActiTimePageForCreateCustomerAndDeleteCustomer(WebDriver oBrowser) {
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

	// create task link on actitime
	@FindBy(xpath = "//*[@id='topnav']/tbody/tr[1]/td[3]/a/div[2]")
	private WebElement oTask;

	public WebElement getTask() {
		return oTask;
	}

	// click on add new task
	@FindBy(xpath = "//div[text()='Add New']")
	private WebElement AddNew;

	public WebElement getAddNewTask() {
		return AddNew;
	}

	// click on create customer
	@FindBy(xpath = "/html/body/div[14]/div[1]")
	private WebElement createTask;

	public WebElement getAddNewCustomer() {
		return createTask;
	}

	// insert data into a customer
	private WebElement customerLightBox_nameField;

	public WebElement getInsertCustomerData() {
		return customerLightBox_nameField;
	}

	// insert data into a customer
	private WebElement customerLightBox_descriptionField;

	public WebElement getInsertCustomerDataDiscription() {
		return customerLightBox_descriptionField;
	}

	// click on create button for customer creation
	@FindBy(xpath = "//span[text()='Create Customer']")
	private WebElement createCustomer;

	public WebElement getclickCreateButton() {
		return createCustomer;
	}

	// click on setting button
	@FindBy(xpath = "//div[@class = 'editButton available']")
	private WebElement clickSettingButton;

	public WebElement getclickSettingButton() {
		return clickSettingButton;
	}

	// click on Action button
	@FindBy(xpath = "//div[@class='actionButton']")
	private WebElement actionButton;

	public WebElement getActionButton() {
		return actionButton;
	}

	// click on delete button
	@FindBy(xpath = "//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")
	private WebElement DeleteButton;

	public WebElement getDeleteButton() {
		return DeleteButton;
	}

	// click on permanent delete button
	private WebElement customerPanel_deleteConfirm_submitTitle;

	public WebElement getpermanentDelete() {
		return customerPanel_deleteConfirm_submitTitle;
	}

	// create web element for logout link
	@FindBy(linkText = "Logout")
	private WebElement oLogout;

	public WebElement getLogout() {
		return oLogout;
	}
}
