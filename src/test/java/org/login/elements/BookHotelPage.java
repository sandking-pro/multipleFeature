package org.login.elements;

import org.adactin.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepdefinition.BookingPageSteps;
import com.stepdefinition.SelectPageSteps;

public class BookHotelPage extends BaseClass {

	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement fname;

	@FindBy(id = "last_name")
	private WebElement lname;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(id = "cc_num")
	private WebElement ccnum;

	@FindBy(id = "cc_type")
	private WebElement cctype;

	@FindBy(id = "cc_exp_month")
	private WebElement cc_exp_month;

	@FindBy(id = "cc_exp_year")
	private WebElement cc_exp_year;

	@FindBy(id = "cc_cvv")
	private WebElement cc_cvv;

	@FindBy(id = "book_now")
	private WebElement book_now;

	@FindBy(id = "order_no")
	private WebElement orderno;

	@FindBy(id = "first_name_span")
	private WebElement spanFname;

	@FindBy(id = "last_name_span")
	private WebElement spanLname;

	@FindBy(id = "address_span")
	private WebElement spanAddress;

	@FindBy(id = "cc_num_span")
	private WebElement spanCcnum;

	@FindBy(id = "cc_type_span")
	private WebElement spanCctype;

	@FindBy(id = "cc_expiry_span")
	private WebElement spanCcexp;

	@FindBy(id = "cc_cvv_span")
	private WebElement spanCcv;

	@FindBy(id = "my_itinerary")
	private WebElement btnItenary;

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCc_exp_month() {
		return cc_exp_month;
	}

	public WebElement getCc_exp_year() {
		return cc_exp_year;
	}

	public WebElement getCc_cvv() {
		return cc_cvv;
	}

	public WebElement getBook_now() {
		return book_now;
	}

	public WebElement getOrderno() {
		return orderno;
	}

	public WebElement getSpanFname() {
		return spanFname;
	}

	public WebElement getSpanLname() {
		return spanLname;
	}

	public WebElement getSpanAddress() {
		return spanAddress;
	}

	public WebElement getBtnItenary() {
		return btnItenary;
	}

	public void verifyOrderAssert() {
		WebElement orderBtn = webDriverWait(getOrderno(), 10);
		String orderText = getAttributeText(orderBtn);
		verifyBoolAssert("Verify OrderId", (!orderText.isEmpty()));
		BookingPageSteps.currentOrderId = orderText;
	}

	public void verifyErrorAssert(String fnameErr, String lnameErr, String addressErr) {
		verifyBoolAssert("Verify FirstName", webDriverWait(getSpanFname(), 10).getText().contains(fnameErr));
		verifyBoolAssert("Verify LastName", webDriverWait(getSpanLname(), 10).getText().contains(lnameErr));
		verifyBoolAssert("Verify Address", webDriverWait(getSpanAddress(), 10).getText().contains(addressErr));
	}

	public void bookHotel(String fname, String lname, String address, String creditCardNumber, String creditCardType,
			String expiryMonth, String expiryYear, String cvv) {
		enterText(getFname(), fname);
		enterText(getLname(), lname);
		enterText(getAddress(), address);
		enterText(getCcnum(), creditCardNumber);
		selectDropdown(getCctype(), creditCardType, "vt");
		selectDropdown(getCc_exp_month(), expiryMonth, "vt");
		selectDropdown(getCc_exp_year(), expiryYear, "vt");
		enterText(getCc_cvv(), cvv);
		btnClick(getBook_now());
	}

	public void bookHotel() {
		btnClick(getBook_now());
	}

	public void navigateToCancellation() {
		btnClick(getBtnItenary());
	}

}
