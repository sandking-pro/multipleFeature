package org.login.elements;

import org.adactin.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass {

	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_0")
	private WebElement selectHotel;

	@FindBy(id = "continue")
	private WebElement continueBtn;

	@FindBy(xpath = "//td[contains(text(),'Select Hotel')]")
	private WebElement tdVerifyLogin;

	public WebElement getTdVerifyLogin() {
		return tdVerifyLogin;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public void selectHotel() {
		btnClick(getSelectHotel());
		btnClick(getContinueBtn());
	}

	public void verifySearchAssert(String expected) {
		verifyAssert(expected, getTdVerifyLogin().getText());
	}

}
