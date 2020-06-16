package constants;

public class ConstantNewContact {

	public static final String saludation = "div[class*='salutation']";
	public static final String phone = "//span[text()='Phone']/parent::label/following-sibling::input";
	
	//para repasar luego
	//$$('div [class="slds-grid slds-gutters_small full cols-2 forcePageBlockSectionRow"] > div > div')[1]
	
	public static final String mobile = "//span[text()='Mobile']/parent::label/following-sibling::input";
	public static final String email ="input[type = 'email']";
	public static final String leadSource ="//span[text()='Lead Source']/parent::span/following-sibling::div";
	//public static final String level ="";
	public static final String searchAccount = "input[title='Search Accounts']";
	
	
	//generic css selector
	public static final String saludationSelected = "a[title='$saludation']";
	public static final String contactIdentity = "input[class *= '$identity']";
	public static final String contactAccountName = "div[title = '$accountName']";
	

}
