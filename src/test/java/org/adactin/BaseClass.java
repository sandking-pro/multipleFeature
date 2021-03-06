package org.adactin;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void launchUrl(String url) {
		driver.get(url);
	}

	public String getCurl() {
		return driver.getCurrentUrl();
	}

	public void timeOut(int i) {
		driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
	}

	public void enterText(WebElement element, String value) {
		element.clear();
		element.sendKeys(value);
	}
	
	public void enterTextSubmit(WebElement element, String value) {
		element.clear();
		element.sendKeys(value,Keys.ENTER);
	}

	public void btnClick(WebElement element) {
		element.click();
	}

	public void screenShot(String data) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File(System.getProperty("user.dir") + "\\target\\" + data + ".png");
		FileUtils.copyFile(srcFile, destFile);
	}

	public void selectDropdown(WebElement dropdown, String text, String by) {
		Select sel = new Select(dropdown);

		switch (by) {
		case "vt":
			sel.selectByVisibleText(text);
			break;
		case "val":
			sel.selectByValue(text);
			break;
		default:
			sel.selectByIndex(Integer.parseInt(text));
		}
	}

	public String getAttributeText(WebElement element) {
		return element.getAttribute("value");
	}
	
	public String getElementText(WebElement element) {
		return element.getText();
	}
	
	public void verifyAssert(String expected,String actual) {
		Assert.assertEquals(expected, actual);
	}
	
	public void verifyBoolAssert(String message,Boolean bool) {
		Assert.assertTrue(message,bool);
	}
	
	public WebElement webDriverWait(WebElement element,int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		WebElement until = wait.until(ExpectedConditions.visibilityOf(element));
		return element;
	}
	
	public Alert switchToAlert() {
		Alert alert = driver.switchTo().alert();
		return alert;
	}

}
