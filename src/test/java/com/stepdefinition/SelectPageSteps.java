package com.stepdefinition;



import org.adactin.BaseClass;
import org.login.elements.SelectHotelPage;

import cucumber.api.java.en.Then;

public class SelectPageSteps extends BaseClass {

	SelectHotelPage slh;
	
	public SelectPageSteps() {
		slh = new SelectHotelPage();
	}

	// Feature-1,2 :Scenario-1,2
	@Then("User should verify {string} is displayed")
	public void user_should_verify_is_displayed(String msg) {
		slh.verifySearchAssert(msg);
	}
	
	@Then("User should select hotel and click continue button")
	public void userShouldSelectHotelAndClickContinueButton() {
		slh.selectHotel();
	}

}
