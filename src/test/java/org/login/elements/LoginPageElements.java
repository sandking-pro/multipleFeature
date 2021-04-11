package org.login.elements;


import org.adactin.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageElements extends BaseClass{
	
	public LoginPageElements() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement txtUsername;
	
	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	@FindBy(id="password")
	private WebElement txtpassword;
	
	@FindBy(name="login")
	private WebElement btnLogin;
	
	public void login(String un, String pswd){
		enterText(getTxtUsername(), un);
		enterText(getTxtpassword(), pswd);
		btnClick(getBtnLogin());
	}
	
	

}
