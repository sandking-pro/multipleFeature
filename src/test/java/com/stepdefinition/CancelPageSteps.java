package com.stepdefinition;

import org.login.elements.BookHotelPage;
import org.login.elements.CancelBookingPage;

import cucumber.api.java.en.Then;

public class CancelPageSteps {

	CancelBookingPage cb;
	
	public CancelPageSteps() {
		cb=new CancelBookingPage();
	}
	
	@Then("User should search order id clicks cancel order and click ok")
	public void userShouldSearchOrderIdClicksCancelOrderAndClickOk() {
	    cb.cancelBooking();
	    
	}
	
	@Then("User should verify order {string} is displayed")
	public void userShouldVerifyOrderIsDisplayed(String bookingMsg) {
		cb.verifyCancellationAssert(bookingMsg);
	}
}
