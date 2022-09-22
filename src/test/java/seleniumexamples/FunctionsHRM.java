package seleniumexamples;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FunctionsHRM {
	WebDriver driver = new ChromeDriver();
	void login() throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Krittika\\chromedriver.exe");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div/input[@name = 'username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		Thread.sleep(500);
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Krittika\\chromedriver.exe");
		FunctionsHRM obj = new FunctionsHRM();
		obj.login();
		obj.search("Admin");
		obj.search("Admin","Paul Collings");
	}
	void search(String userName) throws InterruptedException
	{
		driver.findElement(By.xpath("//a/span")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[2]/input")).sendKeys(userName);
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	}
	void search(String userName, String empName) throws InterruptedException
	{
		driver.findElement(By.xpath("//a/span")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[2]/input")).sendKeys(userName);
		driver.findElement(By.xpath("//div/div[2]/div/div/input")).sendKeys(empName);
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
	}
}
