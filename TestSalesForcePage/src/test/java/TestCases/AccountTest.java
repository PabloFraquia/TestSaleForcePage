package TestCases;

import java.awt.Window;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import UtilityPackage.MyUtility;
import domain.NewAccountPage;
import domain.Page;
import domain.PageLogin;
import domain.SetupPage;
import excelExportAndFileIO.ReadAccountFile;
import operation.ReadObject;

public class AccountTest extends MainTest {
	
	WebDriver driver;
	Page p;
	NewAccountPage nap;
	PageLogin pl;
	ReadObject ro;
	Properties prop;

	
	
	@BeforeClass
	@Override
	public void login() throws Exception {
		// TODO Auto-generated method stub
		super.setLoginKeys();
		super.login();
	}
	
	
	
	/*public void setLoginKeys() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pablo\\Desktop\\selenium\\SalesForceExercise\\src\\test\\resources\\ChromeDrivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		
		prop = ReadObject.getObjectRepository();
		ChromeOptions options = MyUtility.ignorePopUps();
		WebDriver driver = new ChromeDriver(options);
		this.driver = driver;

		p = new Page(driver);
		nap = new NewAccountPage(driver);
		pl = new PageLogin(driver);
		ro = new ReadObject();
		driver.get(prop.getProperty("url"));
		//driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		
	}*/
	
	
	@Test(priority = 1)
	public void clickButtonNewAccount() {
		p.clickNewAccountTestUSer();
	}
	
	@Test(priority = 2,dataProvider = "hybridData")
	public void test1 (String accountName, String phone, String webSite, String customerPriority, String billingStreet, String day) throws Exception {
		
		nap.fillAccountFieldsTestUser(accountName, phone, webSite, customerPriority, billingStreet, day);
		Thread.sleep(3000);
		//nap.cancelAccount();
		p.saveAndNew();
		
	}

	@DataProvider(name = "hybridData")
	public Object[][] getDataFromDataprovider() throws IOException {
		Object[][] object = null;
		ReadAccountFile file = new ReadAccountFile();

		Sheet sheet = file.readExcel(System.getProperty("user.dir") + "\\", "AccountFilesTestCases.xlsx", "Sheet1");

		int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		object = new Object[rowCount][sheet.getRow(1).getLastCellNum()];
		for (int i = 0; i < rowCount; i++) {
			
			Row row = sheet.getRow(i + 1);
			
			for (int j = 0; j < row.getLastCellNum(); j++) {
				Cell c = row.getCell(j);
				object[i][j] = c.toString();
				}
			}
		System.out.println("");
		return object;
	}
	
	@AfterMethod
	public void waitASeconds() throws Exception {
		Thread.sleep(5000);
	}
	/*@AfterSuite
	public void closeBrowser() {
		driver.close();
	}*/
}
