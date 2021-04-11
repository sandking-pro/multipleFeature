package org.login.elements;

import org.adactin.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelElements extends BaseClass {
	public SearchHotelElements() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//select[@class='search_combobox'])[1]")
	private WebElement location;

	@FindBy(xpath = "(//select[@class='search_combobox'])[2]")
	private WebElement hotels;

	@FindBy(xpath = "(//select[@class='search_combobox'])[3]")
	private WebElement rt;

	@FindBy(xpath = "(//select[@class='search_combobox'])[4]")
	private WebElement nor;

	@FindBy(xpath = "(//select[@class='search_combobox'])[5]")
	private WebElement apr;

	@FindBy(id = "username_show")
	private WebElement loginVerify;

	public WebElement getLoginVerify() {
		return loginVerify;
	}

	public void setLoginVerify(WebElement loginVerify) {
		this.loginVerify = loginVerify;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRt() {
		return rt;
	}

	public WebElement getNor() {
		return nor;
	}

	public WebElement getApr() {
		return apr;
	}

	public WebElement getCpr() {
		return cpr;
	}

	@FindBy(xpath = "(//select[@class='search_combobox'])[6]")
	private WebElement cpr;

	@FindBy(id = "datepick_in")
	private WebElement checkin;

	@FindBy(id = "datepick_out")
	private WebElement checkout;

	public WebElement getCheckin() {
		return checkin;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	@FindBy(id = "Submit")
	private WebElement submitSearch;

	public WebElement getSubmitSearch() {
		return submitSearch;
	}

	public void searchHotel(String location, String hotels, String rt, String nor, String cin, String cout, String apr,
			String cpr) {
		selectDropdown(getLocation(), location, "vt");
		selectDropdown(getHotels(), hotels, "vt");
		selectDropdown(getRt(), rt, "vt");
		selectDropdown(getNor(), nor, "val");
		enterText(getCheckin(), cin);
		enterText(getCheckout(), cout);
		selectDropdown(getApr(), apr, "val");
		selectDropdown(getCpr(), cpr, "val");
		btnClick(getSubmitSearch());
	}

}
