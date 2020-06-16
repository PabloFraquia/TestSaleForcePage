package factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.ConstantPage;
import constants.ConstantsNewAccount;

public class FactoryPages {
	
	WebDriver driver;
	
	@FindBy (xpath = ConstantPage.btnSearchAppBox) private WebElement appIcon;
	@FindBy (xpath = ConstantPage.inputSearchAppBox) private WebElement appSearchBox;
	@FindBy (xpath = ConstantPage.linkAccount) private WebElement linkAccount;
	@FindBy (xpath = ConstantPage.btnNewAccount) private WebElement buttonNew;
	@FindBy (xpath = ConstantPage.calendarDate) private WebElement calendar;
	@FindBy (xpath = ConstantPage.calendarYear) private WebElement year;
	@FindBy (xpath = ConstantPage.calendarMonth) private WebElement nMonth;
	@FindBy (xpath = ConstantPage.calendarNextMonthBtn) private WebElement nextMonth;
	@FindBy (xpath = ConstantPage.calendarPrevMonthBtn) private WebElement prevMonth;
	@FindBy (xpath = ConstantPage.cancelButton) private WebElement cancelButton;
	@FindBy (xpath = ConstantPage.saveAndNewButton) private WebElement saveAndNewButton;
	@FindBy (xpath = ConstantPage.inputCalendar) private WebElement inputCalendar;
	@FindBy (css = ConstantPage.cssLocatorTab) private WebElement cssLocatorTab;
	
	
	public FactoryPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	

	public WebElement getCalendar() {
		return calendar;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getnMonth() {
		return nMonth;
	}

	public WebElement getNextMonth() {
		return nextMonth;
	}

	public WebElement getPrevMonth() {
		return prevMonth;
	}

	public WebElement getAppIcon() {
		return appIcon;
	}
	public WebElement getAppSearchBox() {
		return appSearchBox;
	}
	
	public WebElement getLinkAccount() {
		return linkAccount;
	}
	public WebElement getButtonNew() {
		return buttonNew;
	}
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getSaveAndNewButton() {
		return saveAndNewButton;
	}
	public WebElement getInputCalendar() {
		return inputCalendar;
	}
	
	//repleaced
	public WebElement getDay(String day) {
		WebElement ret = driver.findElement(By.xpath(ConstantPage.calendarDay.replace("$Day", day)));
		return ret;
	}
	

	public WebElement getCssLocatorTab(String tab) {
		WebElement cssTab = driver.findElement(By.cssSelector(ConstantPage.cssLocatorTab.replace("$tab", tab)));
		return cssTab;
	}

}
