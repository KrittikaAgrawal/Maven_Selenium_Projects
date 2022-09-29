package seleniumexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxOpen {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Krittika\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S940528237%3A1664207739006542&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQDHYWqWrJeu0NZQQPvPnTLOJVm2Nzi0h1E1nD7Mj2SbsHxhmMk87Imh_oe7AXKL8Fl5rutMk7y0");
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("Krittika");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/c-wiz/div/div[2]/div/div[2]/div/div[1]/div/div/button/span")).click();
	}

}
