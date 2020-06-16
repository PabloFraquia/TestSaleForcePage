package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.ConstantsLogin;

public class LoginFactory {
	
	@FindBy (id = ConstantsLogin.userNameId) private WebElement userName;
	@FindBy (id = ConstantsLogin.passId) private WebElement pass;
	@FindBy (id = ConstantsLogin.loginButton) private WebElement loginButton;
	
	public LoginFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getUserName() {
		return userName;
	}
	
	public WebElement getPass() {
		return pass;
	}
	
	public WebElement getLoginButton() {
		return loginButton;
	}
}
