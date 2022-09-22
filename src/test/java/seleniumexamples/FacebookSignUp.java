package seleniumexamples;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FacebookSignUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Krittika\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.xpath("//div/input[@name='firstname']")).sendKeys("Krittika");
		driver.findElement(By.xpath("//div/input[@name='lastname']")).sendKeys("Agrawal");
		driver.findElement(By.xpath("//div/input[@name='reg_email__']")).sendKeys("admin123@gmail.com");
		driver.findElement(By.xpath("//div/input[@name='reg_email_confirmation__']")).sendKeys("admin123@gmail.com");
		driver.findElement(By.xpath("//div/input[@name='reg_passwd__']")).sendKeys("Admin@123");
		WebElement day= driver.findElement(By.name("birthday_day"));
		Select select=new Select(day);
		select.selectByVisibleText("11");
		WebElement month= driver.findElement(By.name("birthday_month"));
		Select select1=new Select(month);
		select1.selectByVisibleText("Nov");
		WebElement year= driver.findElement(By.name("birthday_year"));
		Select select2=new Select(year);
		select2.selectByVisibleText("1999");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.findElement(By.xpath("//div/button[@name='websubmit']")).click();
	}
}
