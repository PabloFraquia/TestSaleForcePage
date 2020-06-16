	package excelExportAndFileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadAccountFile {

	public Sheet readExcel(String filePath, String fileName, String sheetName) throws IOException {

		File file = new File("C:\\Users\\pablo\\Desktop\\selenium\\TestSalesForcePage\\src\\main\\java\\excelExportAndFileIO\\AccountFilesTestCases.xlsx");

		FileInputStream iStream = new FileInputStream(file);

		Workbook salesForceExercise;

		String fileExtensionName = fileName.substring(fileName.indexOf("."));

		if (fileExtensionName.equals(".xlsx")) {
			salesForceExercise = new XSSFWorkbook(iStream);

		} else {
			salesForceExercise = new HSSFWorkbook(iStream);
		}

		Sheet sheet = salesForceExercise.getSheet(sheetName);
		return sheet;
	}

}
	


