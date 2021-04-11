package org.login.elements;

import org.adactin.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends BaseClass {
	
	public SelectHotel(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement selectHotel;
	

	@FindBy(id="continue")
	private WebElement continueBtn;

	public WebElement getContinueBtn() {
		return continueBtn;
	}
	
	public WebElement getSelectHotel() {
		return selectHotel;
	}
	
	@FindBy(xpath="//td[contains(text(),'Select Hotel')]")
	private WebElement verifyTxt;

	public WebElement getVerifyTxt() {
		return verifyTxt;
	}

	public void setVerifyTxt(WebElement verifyTxt) {
		this.verifyTxt = verifyTxt;
	}
	
	public void verifyAssert(String vfy) {
		Assert.assertTrue(getVerifyTxt().getText().contains(vfy));
	}
	
	public void SelectHotel(){
	    btnClick(getSelectHotel());
		btnClick(getContinueBtn());
	}


}
