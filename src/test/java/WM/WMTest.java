package WM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WMTest {
	WebDriver driver;

	@BeforeMethod
	public void setUp(){
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void freeCRMTest(){
		driver.get("https://www.freecrm.com/");
		System.out.println(driver.getTitle());
	}
	
	@AfterTest
	public void tearDown(){
		driver.quit();
	}
}
