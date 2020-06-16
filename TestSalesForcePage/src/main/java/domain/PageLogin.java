package domain;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.ConstantsLogin;
import factory.LoginFactory;

public class PageLogin extends Page {
	WebDriver driver;
	LoginFactory lf;
	
	public PageLogin(WebDriver driver) throws AWTException, InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		w = new WebDriverWait(driver, 5);
		lf = new LoginFactory(driver);
	}
	
	public void fillLoginFields(String username, String pass) throws InterruptedException {
		
		lf.getUserName().sendKeys(username);
		lf.getPass().sendKeys(pass);
		lf.getLoginButton().click();
	}
}
