package seleniumexamples;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromExcel {
	public static void main(String[] args) throws IOException {
		String filePath="C:\\Users\\ei13087\\eclipse-workspace";
		String fileName="Facebook.xlsx";
		String sheetName="Sheet1";
	    File file = new File(filePath+"\\"+fileName);
	    FileInputStream inputStream = new FileInputStream(file);
	    @SuppressWarnings("resource")
	    Workbook workBook = new XSSFWorkbook(inputStream);
	    Sheet sheet = workBook.getSheet(sheetName);
	    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	    System.out.println("Row count " +rowCount);
	    String username, password;
	    Row row = sheet.getRow(1);
	    username=row.getCell(0).getStringCellValue();
	    password =row.getCell(1).getStringCellValue();
	    System.setProperty("webdriver.chrome.driver", "C:\\Krittika\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div/input[@name='email']")).sendKeys(username);
		driver.findElement(By.xpath("//div/input[@name='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//div/button[@name='login']")).click();
	}	
}