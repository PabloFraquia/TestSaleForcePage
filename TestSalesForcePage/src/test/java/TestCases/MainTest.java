package TestCases;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import UtilityPackage.MyUtility;
import domain.PageLogin;
import operation.ReadObject;

public class MainTest {
	
	WebDriver driver;
	Properties prop;
	PageLogin pl;
	
	
	
	public void setLoginKeys() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pablo\\Desktop\\selenium\\SalesForceExercise\\src\\test\\resources\\ChromeDrivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		
		prop = ReadObject.getObjectRepository();
		ChromeOptions options = MyUtility.ignorePopUps();
		WebDriver driver = new ChromeDriver(options);
		this.driver = driver;
		pl = new PageLogin(driver);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();

	}
	public void login() throws Exception {
		pl.fillLoginFields(prop.getProperty("username"), prop.getProperty("password"));
	}
	
}
