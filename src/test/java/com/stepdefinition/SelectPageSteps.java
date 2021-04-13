package com.stepdefinition;

import org.adactin.BaseClass;
import org.login.elements.SelectHotelPage;

import cucumber.api.java.en.Then;

public class SelectPageSteps extends BaseClass {

	SelectHotelPage slh;

	@Then("User should select hotel and click continue button")
	public void userShouldSelectHotelAndClickContinueButton() {
		slh =new SelectHotelPage();
		slh.SelectHotel();
	}

	@Then("User should book hotel using valid user details {string}, {string}, {string} and click book now")
	public void userShouldBookHotelUsingValidUserDetailsAndClickBookNow(String string, String string2, String string3, io.cucumber.datatable.DataTable dataTable) {
		
	}

	@Then("User should verify order id is displayed")
	public void userShouldVerifyOrderIdIsDisplayed() {
		
	}

	@Then("User should verify login and search hotels with valid details {string}, {string}, {string}, {string},{string}, {string}, {string} and {string}")
	public void userShouldVerifyLoginAndSearchHotelsWithValidDetailsAnd(String string, String string2, String string3,
			String string4, String string5, String string6, String string7, String string8) {
		
	}

	@Then("User should click book now without passing any details")
	public void userShouldClickBookNowWithoutPassingAnyDetails() {
		
	}

	@Then("User should verify {string}, {string}, {string}, {string},{string},{string},{string} is displayed")
	public void userShouldVerifyIsDisplayed(String string, String string2, String string3, String string4,
			String string5, String string6, String string7) {
		
	}

}
