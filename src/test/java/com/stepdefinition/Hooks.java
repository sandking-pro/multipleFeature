package com.stepdefinition;

import org.adactin.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class Hooks extends BaseClass{

	@After
	public void tc1(Scenario sc) {
//		if(sc.isFailed()) {
//			TakesScreenshot ts = (TakesScreenshot) driver;
//			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
////			int randomNum = 1 + (int)(Math.random() * 5);
//			sc.embed(screenshotAs,"adacting.png");
//		}
		driver.quit();
	}
}
