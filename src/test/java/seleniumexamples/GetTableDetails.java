package seleniumexamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTableDetails {

	public static void main(String[] args) {
		String str;
		System.setProperty("webdriver.chrome.driver", "C:\\Krittika\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		str= driver.findElement(By.xpath("//table/tbody/tr[3]/td[1]")).getText();
		System.out.println("The extracted data from the Table is : "+str);
	}

}
