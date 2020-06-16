package domain;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import factory.FactoryPages;
import factory.SetupPageFactory;

public class SetupPage extends Page {
	
	SetupPageFactory spf;
	
	public SetupPage(WebDriver driver) throws AWTException, InterruptedException {
		super(driver);
		PageFactory.initElements(driver, this);
		spf = new SetupPageFactory(driver);
	}
	
	public void waitImageLoad() {
		w.until(ExpectedConditions.visibilityOf(spf.getFirstImg()));
	}
	
}
