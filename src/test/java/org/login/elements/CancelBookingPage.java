package org.login.elements;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.security.Key;
import java.util.List;

import org.adactin.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.stepdefinition.BookingPageSteps;

public class CancelBookingPage extends BaseClass {

	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_id_text")
	private WebElement txtboxSearchOrder;

	@FindBy(xpath = "//td//strong[contains(text(),'Order Id')]//parent::td//parent::tr//following-sibling::tr")
	private List<WebElement> tdSearchOrder;

	@FindBy(id = "search_result_error")
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

	public void cancelBooking(String orderId) {
		List<WebElement> rowBooking = getTdSearchOrder();
		
		for (int i = rowBooking.size()-1; i > 0 ; i--) {
			List<WebElement> getRowData = rowBooking.get(i).findElements(By.xpath("//td[3]//input[@value='Cancel "+orderId+"']"));
			for (WebElement cellData : getRowData) {
				cellData.click();
				switchToAlert().accept();
			}
			
		}
	}

	public void verifyCancellationAssert(String expecctedMsg) {
		WebElement webDriverWait = webDriverWait(getLabelErrorMsg(), 10);
		String actualTxt = getElementText(webDriverWait(getLabelErrorMsg(), 10));
		verifyAssert(expecctedMsg, actualTxt);
	}

}
