package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ActiTimePageForCreateUserAll {

	public ActiTimePageForCreateUserAll(WebDriver oBrowser) {
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

	// create web element for users
	@FindBy(xpath = "//div[text()='USERS']")
	private WebElement Createuser;

	public WebElement getcreateuser() {
		return Createuser;

	}

	// create Add user for create user
	@FindBy(xpath = "// div[text()='Add User']")
	private WebElement addUser;

	public WebElement getAssUser() {
		return addUser;
	}

	// for first name
	private WebElement firstName;

	public WebElement getFN() {
		return firstName;
	}

	// for last name
	private WebElement lastName;

	public WebElement getLN() {
		return lastName;
	}

	// for email
	private WebElement email;

	public WebElement getemail() {
		return email;
	}

	// for User name
	
	public WebElement getusername() {
		return username;
	}

	// for password
	private WebElement password;

	public WebElement getpassword() {
		return password;
	}

	// for password copy
	private WebElement passwordCopy;

	public WebElement getpasswordcopy() {
		return passwordCopy;
	}

	// for create user data
	@FindBy(xpath = "//span[text()='Create User']")

	private WebElement CreateUser;

	public WebElement getCreateUser() {
		return CreateUser;
	}

	// modify user

	@FindBy(xpath = "//span[text()='ubhale, santosh']")
	private WebElement user;

	public WebElement getmodifyuserdata() {
		return user;
	}

	// for modifying lastname

	public WebElement getLNmodification() {
		return lastName;
	}
	// for saving the modify data
	private WebElement userDataLightBox_commitBtn;

	public WebElement getmodifyCreateUser() {
		return userDataLightBox_commitBtn;
	}
	// click user field
	@FindBy(xpath = "//span[text()='software, santosh']")
	private WebElement userForDelete;

	public WebElement getuserForDelete() {
		return userForDelete;
	}
	// delete the user
	private WebElement userDataLightBox_deleteBtn;

	public WebElement getuserDelete() {
		return userDataLightBox_deleteBtn;
	}
	// create web element for logout link
		@FindBy(linkText = "Logout")
		private WebElement oLogout;
		public WebElement getLogout() {
			return oLogout;
		}
}
