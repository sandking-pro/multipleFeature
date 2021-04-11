package org.login.elements;

import org.adactin.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElements extends BaseClass{
	
	public HomePageElements() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="location")
	private WebElement selectLocation;
	
	@FindBy(id="hotels")
	private WebElement selectHotels;

	@FindBy(id="room_type")
	private WebElement selectRoomtype;
	
	@FindBy(id="room_nos")
	private WebElement selectRoomnos;
	
	@FindBy(id="datepick_in")
	private WebElement datepickin;
	
	@FindBy(id="datepick_out")
	private WebElement datepickout;
	
	@FindBy(id="adult_room")
	private WebElement selectAdult_room;
	
	@FindBy(id="child_room")
	private WebElement selectChild_room;
	
	@FindBy(id="Submit")
	private WebElement submit;

	public WebElement getSubmit() {
		return submit;
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

	public WebElement getSelectRoomnos() {
		return selectRoomnos;
	}

	public WebElement getDatepickin() {
		return datepickin;
	}

	public WebElement getDatepickout() {
		return datepickout;
	}

	public WebElement getSelectAdult_room() {
		return selectAdult_room;
	}

	public WebElement getSelectChild_room() {
		return selectChild_room;
	}

}
