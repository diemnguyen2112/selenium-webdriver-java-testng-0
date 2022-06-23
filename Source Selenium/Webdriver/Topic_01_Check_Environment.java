package Webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Topic_01_Check_Environment {
	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	String pathGeckoDriver = "D:\\common\\browserDrivers";
	/// dòng này là dòng lấy path của em. Hiện tại giá trị của nó là
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver",".\\browserDrivers\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", pathGeckoDriver + "\\geckodriver.exe");
		// Đấy sau này cứ project nào em cũng dùng path này là đúng, dù project 1 hay 2
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void TC_01_ValidateCurrentUrl() {
		// Login Page Url matching
		String loginPageUrl = driver.getCurrentUrl();
		Assert.assertEquals(loginPageUrl, "https://www.facebook.com/");
	}

	@Test
	public void TC_02_ValidatePageTitle() {
		// Login Page title
		String loginPageTitle = driver.getTitle().split(" ")[0];
		Assert.assertEquals(loginPageTitle, "Facebook");
	}

	@Test
	public void TC_03_LoginFormDisplayed() {
		// Login form displayed
		Assert.assertTrue(driver.findElement(By.xpath("//form[@data-testid='royal_login_form']")).isDisplayed());
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}
}