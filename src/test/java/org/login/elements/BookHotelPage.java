package org.login.elements;

import org.adactin.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass {
	
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement fname;
	
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

	@FindBy(id="last_name")
	private WebElement lname;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="cc_num")
	private WebElement ccnum;
	
	@FindBy(id="cc_type")
	private WebElement cctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement cc_exp_month;
	
	@FindBy(id="cc_exp_year")
	private WebElement cc_exp_year;
	
	@FindBy(id="cc_cvv")
	private WebElement cc_cvv;
	
	@FindBy(id="book_now")
	private WebElement book_now;
	
	@FindBy(id="order_no")
	private WebElement orderno;

	public WebElement getOrderno() {
		return orderno;
	}
	
	public void bookHotel(String fn,String ln,String addr,String ccn,String cct,String em,String ey,String cvv) {
		enterText(getFname(), fn);
		enterText(getLname(),  ln);
		enterText(getAddress(),  addr);
		enterText(getCcnum(),  ccn);
		selectDropdown(getCctype(), cct,"val");
		selectDropdown(getCc_exp_month(),  em,"val");
		selectDropdown(getCc_exp_year(),  ey,"val");
		enterText(getCc_cvv(), cvv);
	}
	

}
