package com.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.adactin.BaseClass;
import org.junit.Assert;
import org.login.elements.BookHotel;
import org.login.elements.LoginPageElements;
import org.login.elements.SearchHotelElements;
import org.login.elements.SelectHotel;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.ast.DataTable;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageSteps extends BaseClass {
	LoginPageElements lp;

	@Given("User is on the AdactinHotelApp login page")
	public void user_is_on_the_AdactinHotelApp_login_page() {
		System.out.println("prakash writ");
		getDriver();
		launchUrl("http://adactinhotelapp.com/");
	}

	@When("User should enter valid {string} , {string} and click the login button")
	public void user_should_enter_valid_and_click_the_login_button(String un, String pswd) {
		lp = new LoginPageElements();
		lp.login(un, pswd);
	}

}
