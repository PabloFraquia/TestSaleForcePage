package constants;

public class ConstantPage {
	public static final String btnSearchAppBox = "//*[@class = 'slds-icon-waffle']";
	public static final String inputSearchAppBox = "//*[@class = 'slds-input']";
	public static final String linkAccount = "//*[@id='Account']";
	public static final String btnNewAccount = "//*[@title = 'New']";
	public static final String calendarDate = "//a[contains(@class,'datePicker')]";
	public static final String calendarYear = "//select[contains(@class,'slds-select')]";
	public static final String calendarNextMonthBtn = "//a[@title='Go to next month']";
	public static final String calendarMonth = "//h2[@class='monthYear']";
	public static final String calendarPrevMonthBtn = "//a[@title='Go to previous month']";
	public static final String cancelButton = "//div[contains(@class,'button-container-inner')]/button/span[text()='Cancel']/parent::button";
	public static final String saveAndNewButton = "//div[contains(@class,'button-container-inner')]/button/span[text()='Save & New']/parent::button";
	public static final String inputCalendar = "//span[contains(text(),'SLA Ex')]/parent::label/following-sibling::div/input";

	
	
	//Generic xpaths
	public static final String calendarDay = "//td[@class='uiDayInMonthCell']/span[text() = '$Day']";
	
	//Generic cssLocator
	public static final String cssLocatorTab = "a[title = '$tab']";
	
}
