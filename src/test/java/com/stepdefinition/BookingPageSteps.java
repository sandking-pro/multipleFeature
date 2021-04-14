package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.login.elements.BookHotelPage;
import cucumber.api.java.en.Then;


public class BookingPageSteps {

	BookHotelPage bh;
	
	public BookingPageSteps() {
		bh = new BookHotelPage();
	}
	
	@Then("User should book hotel using valid user details {string}, {string}, {string} and click book now")
	public void userShouldBookHotelUsingValidUserDetailsAndClickBookNow(String fname, String lname, String address,
			io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> bookingDetails = dataTable.asMaps();
		Map<String, String> map = bookingDetails.get(0);

//		bh = new BookHotelPage();
		bh.bookHotel(fname, lname, address, map.get("creditCardNo"), map.get("creditCardType"), map.get("expiryMonth"),
				map.get("expiryYear"), map.get("cvv"));
	}

	@Then("User should verify order id is displayed")
	public void userShouldVerifyOrderIdIsDisplayed() {
		bh.verifyOrderAssert();
	}

	@Then("User should click book now without passing any details")
	public void userShouldClickBookNowWithoutPassingAnyDetails() {
//		bh = new BookHotelPage();
		bh.bookHotel();
	}

	@Then("User should verify {string}, {string} and {string} is displayed")
	public void userShouldVerifyAndIsDisplayed(String fnameErr, String lnameErr, String addressErr) {
		bh.bookHotel();
		bh.verifyErrorAssert(fnameErr, lnameErr, addressErr);
	}
}
