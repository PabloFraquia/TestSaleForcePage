package domain;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.ConstantPage;
import factory.AccountFactory;
import factory.FactoryPages;

public class Page {

	WebDriver driver;
	WebDriverWait w;
	FactoryPages hp;
	AccountFactory af;

	public Page(WebDriver driver) throws AWTException, InterruptedException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		w = new WebDriverWait(driver, 30);
		hp = new FactoryPages(driver);

	}

	public void clickNewAccountTestUSer() {
		w.until(ExpectedConditions.elementToBeClickable(hp.getButtonNew())).click();

	}

	public void fillCalendarNewAccount(String date) {
		hp.getInputCalendar().sendKeys(date);
		
	}
	
	public void selectTab(String tabName) {
		hp.getCssLocatorTab(tabName).click();
	}

		/*String[] splitDate = date.split("/");

		for (int i = 0; i < splitDate.length; i++) {
			if (splitDate[i].indexOf("0") == 0) {
				splitDate[i] = splitDate[i].replace("0", "");
			}
		}

		hp.getCalendar().click();
		String year = splitDate[2];
		int month = Integer.parseInt(splitDate[1]);
		String day = splitDate[0];

		String monthName = hp.getnMonth().getText();

		ArrayList<String> months = new ArrayList<String>();
		months.add("january");
		months.add("february");
		months.add("march");
		months.add("april");
		months.add("may");
		months.add("june");
		months.add("july");
		months.add("august");
		months.add("september");
		months.add("october");
		months.add("november");
		months.add("december");

		int actualmonth = months.indexOf(monthName.toLowerCase());
		String indicatedMonth = months.get(month - 1);

		Select s = new Select(hp.getYear());
		s.selectByValue(year);
		
		while (!hp.getnMonth().getText().equalsIgnoreCase(indicatedMonth)) {
			if (actualmonth > month -1) {
				hp.getPrevMonth().click();
			} else {
				hp.getNextMonth().click();
			}
		}
		hp.getDay(day).click();
	}*/

	public void saveAndNew() {
		hp.getSaveAndNewButton().click();
	}

}
