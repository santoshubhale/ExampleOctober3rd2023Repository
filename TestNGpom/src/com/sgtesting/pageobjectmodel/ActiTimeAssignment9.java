package com.sgtesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeAssignment9 {
	public ActiTimeAssignment9(WebDriver oBrowser) {
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

	public WebElement getCreateUserforclickButton() {
		return CreateUser;
	}

	// create web element for logout link
	@FindBy(linkText = "Logout")
	private WebElement oLogout;

	public WebElement getLogout() {
		return oLogout;
	}

	// start explore actitime user1
	@FindBy(xpath = "//*[@id=\"welcomeScreenBoxId\"]/div[3]/div")
	private WebElement startexplore;

	public WebElement getstartExploreActitime() {
		return startexplore;
	}

	// modify 1
	@FindBy(xpath = "//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]")
	private WebElement modify1;

	public WebElement getmodify1() {
		return modify1;
	}

	// modify save
	@FindBy(xpath = "//span[@class='buttonTitle']")
	private WebElement modifysave;

	public WebElement getmodifysave() {
		return modifysave;
	}

	// modify 2
	@FindBy(xpath = "//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[2]/div[1]")
	private WebElement modify2;

	public WebElement getmodify2() {
		return modify2;
	}

	// modify 3
	@FindBy(xpath = "//*[@id=\"userListTableContainer\"]/table/tbody/tr[4]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement modify3;

	public WebElement getmodify3() {
		return modify3;
	}

	// delete
	private WebElement userDataLightBox_deleteBtn;

	public WebElement getDelete() {
		return userDataLightBox_deleteBtn;
	}

	// delete santosh
	@FindBy(xpath = "//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement deletesantosh;

	public WebElement getdeletesantosh() {
		return deletesantosh;
	}

	// delete suhas
	@FindBy(xpath = "//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	private WebElement deletesuhas;

	public WebElement getdeletesuhas() {
		return deletesuhas;
	}

	// delete darshan
	@FindBy(xpath = "//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
	
	private WebElement deletedarshan;

	public WebElement getdeletedarshan() {
		return deletedarshan;
	}
}
