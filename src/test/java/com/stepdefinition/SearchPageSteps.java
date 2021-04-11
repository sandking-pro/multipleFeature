package com.stepdefinition;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.adactin.BaseClass;
import org.junit.Assert;
import org.login.elements.BookHotel;
import org.login.elements.SearchHotelElements;
import org.login.elements.SelectHotel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Then;
import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.DiscoveryStrategy.Explicit;

public class SearchPageSteps extends BaseClass {

	SearchHotelElements sh;
	SelectHotel slh;
	BookHotel bh;

	private static int n = 0;

	@Then("User should search hotels with all valid details")
	public void user_should_search_hotels_with_all_valid_details(io.cucumber.datatable.DataTable dataTable) {
		sh = new SearchHotelElements();
		Assert.assertTrue("verify", sh.getLoginVerify().getAttribute("value").contains("prakash"));
		List<Map<String, String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(n);
		sh.searchHotel(map.get("location"), map.get("hotels"), map.get("roomType"), map.get("numberOfRooms"),
				map.get("checkIn"), map.get("checkOut"), map.get("apr"), map.get("cpr"));
	}
	
	@Then("User should verify {string} is displayed")
	public void user_should_verify_is_displayed(String msg) {
		slh = new SelectHotel();
		slh.verifyAssert(msg);
		
	}

	@Then("User should select hotel and click the continue button")
	public void user_should_select_hotel_and_click_the_continue_button() {
		
		slh.SelectHotel();
	}

	@Then("User should book hotel using valid user details")
	public void user_should_book_hotel_using_valid_user_details(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> asMaps1 = dataTable.asMaps();
		Map<String, String> map = asMaps1.get(n);

		bh = new BookHotel();
		bh.bookHotel(map.get("firstName"), map.get("lastName"), map.get("address"), map.get("crediCardNo"),
				map.get("creditCardType"), map.get("expiryMonth"), map.get("expiryYear"), map.get("cvv"));

	}

	@Then("User should book the hotel and verify order details")
	public void user_should_book_the_hotel_and_verify_order_details() {
		btnClick(bh.getBook_now());
	//	driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		System.out.println("Order Id" + getAttributeText(bh.getOrderno()));
	}

	@Then("User should logout and exit")
	public void user_should_logout_and_exit() {
		n++;
		driver.close();
	}

}
