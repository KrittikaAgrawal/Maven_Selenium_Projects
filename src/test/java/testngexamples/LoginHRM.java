package testngexamples;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class LoginHRM {
	private static WebDriver driver = null;
  @Test
  public void login() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Krittika\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//div/input[@name = 'username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@type = 'password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
  }
  @Test
  public void logout() {
	  driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
	  driver.findElement(By.xpath("//ul/li[4]/a[@role='menuitem']")).click();
  }
}
