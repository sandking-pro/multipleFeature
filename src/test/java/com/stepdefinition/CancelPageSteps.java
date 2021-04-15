package com.stepdefinition;

import org.login.elements.CancelBookingPage;

import cucumber.api.java.en.Then;

public class CancelPageSteps {

	CancelBookingPage cb;
	
	public CancelPageSteps() {
		cb=new CancelBookingPage();
	}
	
	@Then("User should search order id clicks cancel order and click ok")
	public void userShouldSearchOrderIdClicksCancelOrderAndClickOk() {
	    cb.cancelBooking(BookingPageSteps.currentOrderId);
	    
	}
	
	@Then("User should click cancel order {string} and click ok")
	public void userShouldClickCancelOrderAndClickOk(String orderId) {
		cb.cancelBooking(orderId);
	}
	
	@Then("User should verify order {string} is displayed")
	public void userShouldVerifyOrderIsDisplayed(String bookingMsg) {
		cb.verifyCancellationAssert(bookingMsg);
	}
	
}
