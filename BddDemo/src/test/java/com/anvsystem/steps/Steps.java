package com.anvsystem.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Steps {

	@Given("I enter username {string}")
	public void i_enter_username(String string) {
		System.out.println(string);
	   System.out.println("Hello I am step 1");
	}

	@Given("I enter passowrd {string}")
	public void i_enter_passowrd(String string) {
		System.out.println(string);
		System.out.println("Hello I am Step 2");
	}

	@Given("I click on Login button")
	public void i_click_on_login_button() {
		System.out.println("Hello I am Step 3");
	}

	@Then("I should be redirected to Homepage")
	public void i_should_be_redirected_to_homepage() {
		System.out.println("Hello I am Step 4");
	}

	@Given("I enter invalid username")
	public void i_enter_invalid_username() {
		System.out.println("Hello I am Step 5");
	}

	@Given("I enter invalid password")
	public void i_enter_invalid_password() {
		System.out.println("Hello I am Step 6");
	}

	@Then("I should get authentication error page")
	public void i_should_get_authentication_error_page() {
		System.out.println("Hello I am Step 7");
	}
}
