package factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.ConstantNewContact;


public class ContactFactory {
	
	WebDriver driver;
	
	@FindBy (css = ConstantNewContact.saludation) private WebElement saludation;
	@FindBy (css = ConstantNewContact.saludationSelected) private WebElement saludationSelected;
	@FindBy (css = ConstantNewContact.searchAccount) private WebElement searchAccount;
	@FindBy (css = ConstantNewContact.contactIdentity) private WebElement contactIdentity;
	@FindBy (css = ConstantNewContact.contactAccountName) private WebElement contactAccountName;
	@FindBy (css = ConstantNewContact.email) private WebElement contactEmail;
	@FindBy (xpath = ConstantNewContact.phone) private WebElement contactPhone;
	@FindBy (xpath = ConstantNewContact.mobile) private WebElement contactMobile;
	@FindBy (xpath = ConstantNewContact.leadSource) private WebElement contactLeadSource;
	
	
	
	public ContactFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public WebElement getSaludation() {
		return saludation;
	}

	
	public WebElement getContactPhone() {
		return contactPhone;
	}


	public WebElement getSaludationSelected() {
		return saludationSelected;
	}
	

	public WebElement getContactMobile() {
		return contactMobile;
	}


	public WebElement getContactIdentity() {
		return contactIdentity;
	}

	public WebElement getContactAccountName() {
		return contactAccountName;
	}

	public WebElement getSearchAccount() {
		return searchAccount;
	}
	

	public WebElement getContactEmail() {
		return contactEmail;
	}

	public WebElement getSaludationSelected(String saludationSelected) {
		WebElement cssSaludation = driver.findElement(By.cssSelector(ConstantNewContact.saludationSelected.replace("$saludation", saludationSelected)));
		return cssSaludation;
	}
	public WebElement getContactIdentity(String contactIdentity) {
		WebElement cssIdentity = driver.findElement(By.cssSelector(ConstantNewContact.contactIdentity.replace("$identity", contactIdentity)));
		return cssIdentity;
	}
	
	public WebElement getContactAccountName(String contactAccountName) {
		WebElement cssContactAccountName = driver.findElement(By.cssSelector(ConstantNewContact.contactAccountName.replace("$accountName", contactAccountName)));
		return cssContactAccountName;

	}
	public WebElement getContactLeadSource(String leadSource) {
		WebElement cssContactLeadSource = driver.findElement(By.cssSelector(ConstantNewContact.leadSource.replace("$leadSource", leadSource)));
		return contactLeadSource;
	}
}
