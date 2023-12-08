package com.sgtesting.assignment.webapplication;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedAssignment9 {
	public static WebDriver oBrowser = null;

	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimize();
		createUser1();
		logoutAdmin();
		loginAsUser1();
		StartExploreActiTimeuser1();
		createUser2();
		logoutUser1();
		loginAsUser2();
		StartExploreActiTimeuser2();
		createUser3();
		logoutUser2();
		loginAsUser3();
		StartExploreActiTimeuser3();
		logoutUser3();
		loginAsUser2ForModifyUser3();
		modifyPasswordForUser3();
		logoutUser2AfterModify();
		loginAsUser3AfterModify();
		logoutUser3AfterModify();
		loginAsUser1ForModifyUser2();
		modifyPasswordForUser2();
		logoutUser1AfterModify();
		loginAsUser2AfterModify();
		logoutUser2AfternextModify();
		loginAsAdmin();
		modifyPasswordForUser1();
		logoutUser1AfterAdminModify();
		loginAsUser1AfterModify();
		logoutUser1AfternextModify();
		loginAsUser2last();
		DeleteUser3();
		logoutuser2();
		loginUser1();
		DeleteUser2();
		logoutuser1();
		loginAdmin();
		DeleteUser1();
		logoutAdminlast();
		closeApplication();
	}
// launchBrowser 1
	private static void launchBrowser() {
		try {
			oBrowser = new ChromeDriver();
			oBrowser.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
// navigate 2
	private static void navigate() {
		try {
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
// login as admin 3
	private static void login() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(5000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void minimize() {
		try {
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
// create user1 4
	private static void createUser1() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			// user 1
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user1");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("AA");
			oBrowser.findElement(By.name("email")).sendKeys("user1@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("User1");
			oBrowser.findElement(By.name("password")).sendKeys("user@1");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user@1");
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
// logout admin 5
	public static void logoutAdmin() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// login as user 1 6
	public static void loginAsUser1() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("user1");
			Thread.sleep(5000);
			oBrowser.findElement(By.name("pwd")).sendKeys("user@1");
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void StartExploreActiTimeuser1() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
// create user 2 7
	private static void createUser2() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			// user 1
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user2");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("BB");
			oBrowser.findElement(By.name("email")).sendKeys("user2@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("User2");
			oBrowser.findElement(By.name("password")).sendKeys("user@2");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user@2");
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
// logout user 1 8
	public static void logoutUser1() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//login user 2 9
	public static void loginAsUser2() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("user2");
			Thread.sleep(5000);
			oBrowser.findElement(By.name("pwd")).sendKeys("user@2");
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void StartExploreActiTimeuser2() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
// create user 3  10
	private static void createUser3() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			// user 1
			oBrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("user3");
			oBrowser.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("CC");
			oBrowser.findElement(By.name("email")).sendKeys("user3@gmail.com");
			oBrowser.findElement(By.id("userDataLightBox_usernameField")).sendKeys("User3");
			oBrowser.findElement(By.name("password")).sendKeys("user@3");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user@3");
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
// logout user 2  11
	public static void logoutUser2() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// login user 3  12
	public static void loginAsUser3() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("user3");
			Thread.sleep(5000);
			oBrowser.findElement(By.name("pwd")).sendKeys("user@3");
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void StartExploreActiTimeuser3() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
//logout user 3 13
	public static void logoutUser3() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

	// login as user2 14
	public static void loginAsUser2ForModifyUser3() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("user2");
			Thread.sleep(5000);
			oBrowser.findElement(By.name("pwd")).sendKeys("user@2");
			Thread.sleep(5000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

	// modify password for user3 15
	private static void modifyPasswordForUser3() {
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]")).click();
			Thread.sleep(4000);
			oBrowser.findElement(By.name("password")).sendKeys("user@333");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("user@333");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//logout user 2 16
	public static void logoutUser2AfterModify() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//login as user 3 17
	public static void loginAsUser3AfterModify() {
		try {
			oBrowser.findElement(By.id("username")).sendKeys("user3");
			Thread.sleep(7000);
			oBrowser.findElement(By.name("pwd")).sendKeys("user@333");
			Thread.sleep(7000);
			oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
			Thread.sleep(5000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	// logout user 3 18
	public static void logoutUser3AfterModify() {
		try {
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(3000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// login as user 1 19
		public static void loginAsUser1ForModifyUser2() {
			try {
				oBrowser.findElement(By.id("username")).sendKeys("user1");
				Thread.sleep(5000);
				oBrowser.findElement(By.name("pwd")).sendKeys("user@1");
				Thread.sleep(5000);
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(5000);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		
		//modify password for user 2  20
		private static void modifyPasswordForUser2() {
			try {
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(4000);
				oBrowser.findElement(By.name("password")).sendKeys("user@222");
				Thread.sleep(3000);
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("user@222");
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div")).click();
				Thread.sleep(4000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//logout user 1 21
		public static void logoutUser1AfterModify() {
			try {
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(3000);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//login as user 2 22
		public static void loginAsUser2AfterModify() {
			try {
				oBrowser.findElement(By.id("username")).sendKeys("user2");
				Thread.sleep(7000);
				oBrowser.findElement(By.name("pwd")).sendKeys("user@222");
				Thread.sleep(7000);
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(5000);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		
		// logout user 2 23
		public static void logoutUser2AfternextModify() {
			try {
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(3000);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// login as admin 24
		private static void loginAsAdmin() {
			try {
				oBrowser.findElement(By.id("username")).sendKeys("admin");
				Thread.sleep(5000);
				oBrowser.findElement(By.name("pwd")).sendKeys("manager");
				Thread.sleep(5000);
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// modify password for user 1 25
		private static void modifyPasswordForUser1() {
			try {
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
				Thread.sleep(4000);
				oBrowser.findElement(By.name("password")).sendKeys("user@111");
				Thread.sleep(3000);
				oBrowser.findElement(By.name("passwordCopy")).sendKeys("user@111");
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@id=\"userDataLightBox_commitBtn\"]/div")).click();
				Thread.sleep(4000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//logout user 1 26
		public static void logoutUser1AfterAdminModify() {
			try {
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(3000);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// login as user 1 27
		public static void loginAsUser1AfterModify() {
			try {
				oBrowser.findElement(By.id("username")).sendKeys("user1");
				Thread.sleep(7000);
				oBrowser.findElement(By.name("pwd")).sendKeys("user@111");
				Thread.sleep(7000);
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(5000);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		
		// logout user 1 28
		public static void logoutUser1AfternextModify() {
			try {
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(3000);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		// login as user2 29
		public static void loginAsUser2last() {
			try {
				oBrowser.findElement(By.id("username")).sendKeys("user2");
				Thread.sleep(7000);
				oBrowser.findElement(By.name("pwd")).sendKeys("user@222");
				Thread.sleep(7000);
				oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
				Thread.sleep(5000);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// Delete user 3 30
		public static void DeleteUser3() {
			try {
				oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
				Thread.sleep(3000);
				oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[3]/td[1]")).click();
				Thread.sleep(4000);
				oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
				Thread.sleep(2000);
				Alert oAlert = oBrowser.switchTo().alert();
				String content2 = oAlert.getText();
				System.out.println(content2);
				oAlert.accept();
				Thread.sleep(2000);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		// logout user2 31
		public static void logoutuser2() {
			try {
				oBrowser.findElement(By.linkText("Logout")).click();
				Thread.sleep(3000);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// login as user2 32
				public static void loginUser1() {
					try {
						oBrowser.findElement(By.id("username")).sendKeys("user1");
						Thread.sleep(7000);
						oBrowser.findElement(By.name("pwd")).sendKeys("user@111");
						Thread.sleep(7000);
						oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
						Thread.sleep(5000);

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				// Delete user 3 33
				public static void DeleteUser2() {
					try {
						oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
						Thread.sleep(3000);
						oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
						Thread.sleep(4000);
						oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
						Thread.sleep(2000);
						Alert oAlert = oBrowser.switchTo().alert();
						String content2 = oAlert.getText();
						System.out.println(content2);
						oAlert.accept();
						Thread.sleep(2000);
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				// logout user2 34
				public static void logoutuser1() {
					try {
						oBrowser.findElement(By.linkText("Logout")).click();
						Thread.sleep(3000);

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				// login as user2 35
				public static void loginAdmin() {
					try {
						oBrowser.findElement(By.id("username")).sendKeys("admin");
						Thread.sleep(7000);
						oBrowser.findElement(By.name("pwd")).sendKeys("manager");
						Thread.sleep(7000);
						oBrowser.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
						Thread.sleep(5000);

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				// Delete user 3 36
				public static void DeleteUser1() {
					try {
						oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
						Thread.sleep(3000);
						oBrowser.findElement(By.xpath("//*[@id=\"userListTableContainer\"]/table/tbody/tr[1]/td[1]/div/table/tbody/tr/td/div[1]/span[2]")).click();
						Thread.sleep(4000);
						oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
						Thread.sleep(2000);
						Alert oAlert = oBrowser.switchTo().alert();
						String content2 = oAlert.getText();
						System.out.println(content2);
						oAlert.accept();
						Thread.sleep(2000);
						
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				// logout user2 37
				public static void logoutAdminlast() {
					try {
						oBrowser.findElement(By.linkText("Logout")).click();
						Thread.sleep(3000);

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
	//close application 38
	private static void closeApplication() {
		try {
			oBrowser.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
