package TestCases;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import domain.NewContactPage;
import domain.Page;
import domain.PageLogin;
import excelExportAndFileIO.ReadAccountFile;
import excelExportAndFileIO.ReadContactFile;
import operation.ReadObject;

public class ConatctTest extends MainTest {
	
	WebDriver driver;
	
	Page p;
	NewContactPage ncp;
	PageLogin pl;
	ReadObject ro;
	Properties prop;

	@BeforeClass
	@Override
	public void login() throws Exception {
		// TODO Auto-generated method stub
		super.setLoginKeys();
		super.login();
		p.selectTab("Contacts");
	}
	
	@Test(dataProvider = "hybridData")
	public void test1 (String saludation, String firstName, String lastName, String contactAccountName, String phone, String mobile,  String email,  String leadSource) throws Exception {
		
		ncp.fillContactFieldsTestUser(saludation, firstName, lastName, contactAccountName, phone, mobile, email, leadSource);
		Thread.sleep(3000);
		//nap.cancelAccount();
		p.saveAndNew();
		
	}

	@DataProvider(name = "hybridData")
	public Object[][] getDataFromDataprovider() throws IOException {
		Object[][] object = null;
		ReadContactFile file = new ReadContactFile();

		Sheet sheet = file.readExcel(System.getProperty("user.dir") + "\\", "ContactsFileTestCases.xlsx", "Sheet1");

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
	
	
	
	
	

}
