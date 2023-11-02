package com.anvsystems.tests;

import org.testng.annotations.Test;

import com.anvsystems.pages.LoginPage;
import com.anvsystems.utils.Hooks;

public class LoginTest extends Hooks{

	@Test
	public void loginTestWithValidCredentials() throws InterruptedException {
		LoginPage page = new LoginPage(driver);
		page.loginIntoApp("https://demo.guru99.com/v2/", "mngr535012", "qasYnys");
		Thread.sleep(1000);
	}
}
