package com.stepdefinition;


import org.adactin.BaseClass;
import org.login.elements.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class LoginPageSteps extends BaseClass {
	LoginPage lp;

	@Given("User is on the AdactinHotelApp login page")
	public void user_is_on_the_AdactinHotelApp_login_page() {
		getDriver();
		launchUrl("http://adactinhotelapp.com/");
	}
	
	@When("User should enter valid {string} , {string} and click the login button")
	public void userShouldEnterValidAndClickTheLoginButton(String un, String pswd) {
	    lp = new LoginPage();
		lp.login(un, pswd);
	}

}
