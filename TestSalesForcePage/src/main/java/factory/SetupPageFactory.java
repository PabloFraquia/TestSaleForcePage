package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.ConstantSetupPage;

public class SetupPageFactory {
	
	@FindBy(xpath = ConstantSetupPage.firstImg) private WebElement firstImg;
	
	public SetupPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstImg() {
		return firstImg;
	}
}
