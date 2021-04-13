package org.login.elements;

import org.adactin.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//select[@id='location']")
	private WebElement selectLocation;

	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement selectHotels;

	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement selectRoomtype;

	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement selectNoOfRooms;

	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement selectAdultPerRoom;

	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement selectChildPerRoom;

	@FindBy(id = "username_show")
	private WebElement txtboxLoginVerify;

	@FindBy(id = "datepick_in")
	private WebElement txtCheckin;

	@FindBy(id = "datepick_out")
	private WebElement txtCheckout;

	@FindBy(id = "Submit")
	private WebElement submitSearch;

	@FindBy(id = "checkin_span")
	private WebElement spanCheckin;

	@FindBy(id = "checkout_span")
	private WebElement spanCheckout;

	@FindBy(id = "location_span")
	private WebElement spanLocation;

	public WebElement getSpanLocation() {
		return spanLocation;
	}

	public WebElement getSpanCheckout() {
		return spanCheckout;
	}

	public WebElement getSelectLocation() {
		return selectLocation;
	}

	public WebElement getSelectHotels() {
		return selectHotels;
	}

	public WebElement getSelectRoomtype() {
		return selectRoomtype;
	}

	public WebElement getSelectNoOfRooms() {
		return selectNoOfRooms;
	}

	public WebElement getSelectAdultPerRoom() {
		return selectAdultPerRoom;
	}

	public WebElement getSelectChildPerRoom() {
		return selectChildPerRoom;
	}

	public WebElement getTxtboxLoginVerify() {
		return txtboxLoginVerify;
	}

	public WebElement getTxtCheckin() {
		return txtCheckin;
	}

	public WebElement getTxtCheckout() {
		return txtCheckout;
	}

	public WebElement getSpanCheckin() {
		return spanCheckin;
	}

	public WebElement getLoginVerify() {
		return txtboxLoginVerify;
	}

	public void setLoginVerify(WebElement txtboxLoginVerify) {
		this.txtboxLoginVerify = txtboxLoginVerify;
	}

	public WebElement getLocation() {
		return selectLocation;
	}

	public WebElement getHotels() {
		return selectHotels;
	}

	public WebElement getRt() {
		return selectRoomtype;
	}

	public WebElement getNor() {
		return selectNoOfRooms;
	}

	public WebElement getApr() {
		return selectAdultPerRoom;
	}

	public WebElement getCpr() {
		return selectChildPerRoom;
	}

	public WebElement getCheckin() {
		return txtCheckin;
	}

	public WebElement getCheckout() {
		return txtCheckout;
	}

	public WebElement getSubmitSearch() {
		return submitSearch;
	}

	public void verifyLoginAssert(String name) {
		verifyBoolAssert("Verify Login", getLoginVerify().getAttribute("value").contains(name));
	}

	public void verifyCheckInOutAssert(String indate, String outdate) {
		verifyBoolAssert("Verify Checkin", getSpanCheckin().getText().contains(indate));
		verifyBoolAssert("Verify Checkout", getSpanCheckout().getText().contains(outdate));
	}

	public void verifyLocationAssert(String locationMsg) {
		verifyBoolAssert("Verify Location", getSpanLocation().getText().contains(locationMsg));
	}

	public void searchHotel(String location, String hotels, String rt, String nor, String cin, String cout, String apr,
			String cpr) {
		selectDropdown(getLocation(), location, "vt");
		selectDropdown(getHotels(), hotels, "vt");
		selectDropdown(getRt(), rt, "vt");
		selectDropdown(getNor(), nor, "vt");
		enterText(getCheckin(), cin);
		enterText(getCheckout(), cout);
		selectDropdown(getApr(), apr, "vt");
		selectDropdown(getCpr(), cpr, "vt");
		btnClick(getSubmitSearch());
	}

	public void searchHotel(String location, String nor, String cin, String cout, String apr) {
		selectDropdown(getLocation(), location, "vt");
		selectDropdown(getNor(), nor, "vt");
		enterText(getCheckin(), cin);
		enterText(getCheckout(), cout);
		selectDropdown(getApr(), apr, "vt");
		btnClick(getSubmitSearch());
	}

	public void searchHotel() {
		btnClick(getSubmitSearch());
	}

}
