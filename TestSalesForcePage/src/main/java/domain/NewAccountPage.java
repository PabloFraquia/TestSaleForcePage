package domain;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import UtilityPackage.MyUtility;
import constants.ConstantPage;
import constants.ConstantsNewAccount;
import factory.AccountFactory;
import factory.FactoryPages;

public class NewAccountPage extends Page {
	
	AccountFactory af;
	MyUtility my;
	FactoryPages hp;
	
	public NewAccountPage(WebDriver driver) throws AWTException, InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		w = new WebDriverWait(driver, 10);
		af = new AccountFactory(driver);
		my = new MyUtility();

	}
	

	
	public void fillAccountFieldsTestUser(String accountName, String phone,String webSite, String customerPriority , String billingStreet, String calendarDay) throws Exception {
		
		w.until(ExpectedConditions.elementToBeClickable(af.getAccName())).click();
		
		af.getAccName().sendKeys(accountName);
		
		af.getAccPhone().sendKeys(phone);
		
		af.getwSite().sendKeys(webSite);
		
		my.scrollToViewElement(driver, af.getCustomerPty());
		w.until(ExpectedConditions.elementToBeClickable(af.getCustomerPty())).sendKeys(Keys.ARROW_DOWN);
		af.getCustPty(customerPriority).click();
		
		af.getAccBStreet().sendKeys(billingStreet);
		
		fillCalendarNewAccount(calendarDay);
		
		
		
	}

}
