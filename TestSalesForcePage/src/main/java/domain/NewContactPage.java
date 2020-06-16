package domain;

import java.awt.AWTException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.AccountFactory;
import factory.ContactFactory;
import factory.FactoryPages;

public class NewContactPage extends Page {

	WebDriver driver;
	WebDriverWait w;
	FactoryPages hp;
	ContactFactory cf;

	public NewContactPage(WebDriver driver) throws AWTException, InterruptedException {
		super.driver = driver;
		PageFactory.initElements(driver, this);
		w = new WebDriverWait(driver, 30);
		hp = new FactoryPages(driver);

	}
	public void fillContactFieldsTestUser(String saludation, String firstName, String lastName, String contactAccountName, String phone, String mobile,  String email,  String leadSource) throws Exception {
		
		w.until(ExpectedConditions.elementToBeClickable(cf.getSaludation())).click();
		
		cf.getSaludation().click();
		cf.getSaludationSelected(saludation).click();
		
		cf.getContactIdentity("firstName").sendKeys(firstName);
		cf.getContactIdentity("lastName").sendKeys(lastName);
		
		cf.getSearchAccount().sendKeys(contactAccountName);
		w.until(ExpectedConditions.elementToBeClickable(cf.getContactAccountName(contactAccountName))).click();
		
		
		cf.getContactPhone().sendKeys(phone);
		cf.getContactMobile().sendKeys(mobile);
		
		cf.getContactEmail().sendKeys(email);
		
		cf.getContactLeadSource().sendKeys(leadSource);
		w.until(ExpectedConditions.elementToBeClickable(cf.getContactLeadSource(leadSource))).click();
		
		
		
		
	}

}
