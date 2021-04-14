package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.adactin.BaseClass;
import org.junit.Assert;
import org.login.elements.BookHotelPage;
import org.login.elements.SearchHotelPage;
import org.login.elements.SelectHotelPage;
import cucumber.api.java.en.Then;

public class SearchPageSteps extends BaseClass {

	SearchHotelPage sh;
	SelectHotelPage slh;
	
	public SearchPageSteps() {
		sh = new SearchHotelPage();
		slh = new SelectHotelPage();
	}

	// Feature-1 :Scenario-1
	@Then("User should verify login {string} and search hotels with valid details {string}, {string}, {string}, {string},{string}, {string}, {string} and {string}")
	public void userShouldVerifyLoginAndSearchHotelsWithValidDetailsAnd(String userName,String location, String hotels, String roomType,
			String numberOfRooms, String checkIn, String checkOut, String adultPerRoom, String childPerRoom) {
		
		sh.verifyLoginAssert(userName);
		sh.searchHotel(location, hotels, roomType, numberOfRooms, checkIn, checkOut, adultPerRoom, childPerRoom);
	}

	// Feature-1 :Scenario-2
	@Then("User should verify login {string} and search hotels with mandatory details {string}, {string},{string}, {string} and {string}")
	public void userShouldVerifyLoginAndSearchHotelsWithMandatoryDetailsAnd(String userName,String location, String numberOfRooms,
			String checkIn, String checkOut, String adultPerRoom) {
		sh.verifyLoginAssert(userName);
		sh.searchHotel(location, numberOfRooms, checkIn, checkOut, adultPerRoom);
	}

	// Feature-1 :Scenario-3
	@Then("User should verify login {string} and search hotels using invalid checkin and checkout date {string}, {string},{string}, {string} and {string}")
	public void userShouldVerifyLoginAndSearchHotelsUsingInvalidCheckinAndCheckoutDateAnd(String userName,String location,
			String numberOfRooms, String checkIn, String checkOut, String adultPerRoom) {
		sh.verifyLoginAssert(userName);
		sh.searchHotel(location, numberOfRooms, checkIn, checkOut, adultPerRoom);
	}

	// Feature-1 :Scenario-3
	@Then("User should verify {string} and {string} is displayed")
	public void userShouldVerifyAndIsDisplayed(String msg1, String msg2) {
		timeOut(5);
		sh.verifyCheckInOutAssert(msg1,msg2);
	}

	// Feature-1 :Scenario-4
	@Then("User should verify login {string} and search hotels without selecting location")
	public void userShouldVerifyLoginAndSearchHotelsWithoutSelectingLocation(String userName) {
		sh.searchHotel();
	}

	// Feature-1 :Scenario-4
	@Then("User should verify error {string} is displayed")
	public void userShouldVerifyErrorIsDisplayed(String errMsg) {
		sh.verifyLocationAssert(errMsg);
	}

	// Feature-1,2 :Scenario-1,2
	@Then("User should verify {string} is displayed")
	public void user_should_verify_is_displayed(String msg) {
		slh.verifySearchAssert(msg);
	}

}
