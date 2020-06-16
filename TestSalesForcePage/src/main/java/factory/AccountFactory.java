package factory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.ConstantsNewAccount;

public class AccountFactory {
	
	WebDriver driver;

	@FindBy (xpath = ConstantsNewAccount.customerPriority) private WebElement customerPty;
	@FindBy (xpath = ConstantsNewAccount.webSite) private WebElement wSite;
	@FindBy (xpath = ConstantsNewAccount.accountPhone) private WebElement accPhone;
	@FindBy (xpath = ConstantsNewAccount.accountBillingStreet) private WebElement accBStreet;
	@FindBy (xpath = ConstantsNewAccount.accountName) private WebElement accName;
	@FindBy (tagName = ConstantsNewAccount.articlebox) private WebElement article;
	@FindBy (css =  ConstantsNewAccount.checkBoxSupportPlan) private WebElement checkBoxSupportPlan;
	

	public AccountFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	

	
	public WebElement getCheckBoxSupportPlan() {
		return checkBoxSupportPlan;
	}



	public WebElement getArticle() {
		return article;
	}

	public WebElement getAccBStreet() {
		return accBStreet;
	}
	
	public WebElement getAccName() {
		return accName;
	}
	
	public WebElement getCustomerPty() {
		return customerPty;
	}

	public WebElement getwSite() {
		return wSite;
	}

	public WebElement getAccPhone() {
		return accPhone;
	}
	
	
	//repleaced

	public WebElement getCustPty(String priority) {
		WebElement ret = driver.findElement(By.xpath(ConstantsNewAccount.cPriority.replace("$Priority", priority)));
		return ret;
	}

}
