package testngexamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefoxopen {
  @Test
  public void firefox() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Krittika\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
  }
}
