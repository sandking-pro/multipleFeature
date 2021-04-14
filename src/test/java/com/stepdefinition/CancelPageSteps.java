package com.stepdefinition;

import org.login.elements.BookHotelPage;

import cucumber.api.java.en.Then;

public class CancelPageSteps {

	BookHotelPage bh;
	
	public CancelPageSteps() {
		bh=new BookHotelPage();
	}
	
	@Then("User should verify order id and click Booked Itinerary")
	public void userShouldVerifyOrderIdAndClickBookedItinerary() {		
		bh.verifyOrderAssert();
		
	}

	@Then("User should search order id clicks cancel order and click ok")
	public void userShouldSearchOrderIdClicksCancelOrderAndClickOk() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}
