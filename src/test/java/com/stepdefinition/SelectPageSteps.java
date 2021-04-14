package com.stepdefinition;



import org.adactin.BaseClass;
import org.login.elements.SelectHotelPage;

import cucumber.api.java.en.Then;

public class SelectPageSteps extends BaseClass {

	SelectHotelPage slh;

	@Then("User should select hotel and click continue button")
	public void userShouldSelectHotelAndClickContinueButton() {
		slh = new SelectHotelPage();
		slh.SelectHotel();
	}

}
