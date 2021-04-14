package org.login.elements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.util.List;

import org.adactin.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepdefinition.BookingPageSteps;

public class CancelBookingPage extends BaseClass{
	
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_id_text")
	private WebElement txtboxSearchOrder;
	
	@FindBy(xpath="//td//strong[contains(text(),'Order Id')]//parent::td//parent::tr//following-sibling::tr[1]//td[3]")
	private List<WebElement> tdSearchOrder;
	
	@FindBy(id="search_result_error")
	private WebElement labelErrorMsg;

	public WebElement getLabelErrorMsg() {
		return labelErrorMsg;
	}

	public WebElement getTxtboxSearchOrder() {
		return txtboxSearchOrder;
	}

	public List<WebElement> getTdSearchOrder() {
		return tdSearchOrder;
	}
	
	public void cancelBooking(){
		enterTextSubmit(txtboxSearchOrder, BookingPageSteps.currentOrderId);
		List<WebElement> listOrderId = getTdSearchOrder();
		System.out.println(getAttributeText(listOrderId.get(0)));
		//&& getAttributeText(listOrderId.get(0)).contains(BookingPageSteps.currentOrderId)
		if(listOrderId.size() == 1 ) {
			listOrderId.get(0).click();
			switchToAlert().accept();
		}
	}
	
	public void verifyCancellationAssert(String expecctedMsg) {
		WebElement webDriverWait = webDriverWait(getLabelErrorMsg(),10);
		System.out.println(webDriverWait.getText());
		String verifyCancelTxt = getElementText(webDriverWait(getLabelErrorMsg(),10));
		System.out.println(verifyCancelTxt);
		System.out.println(expecctedMsg);
	}

}
