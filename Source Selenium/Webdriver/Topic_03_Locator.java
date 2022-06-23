package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Topic_03_Locator {
    WebDriver driver;
    String projectPath = System.getProperty("user.dir");

    String pathGeckoDriver = "D:\\common\\browserDrivers";
    public void TC_01_Firefox() {
        System.setProperty("webdriver.gecko.driver", pathGeckoDriver + "\\geckodriver.exe");

        // mở trình duyệt lên
      driver = new FirefoxDriver();
      // set timeout để tìm element
      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
      driver.get("https://www.facebook.com/");
      driver.quit();
     @Test
             System.out.println(" Sendkey to email textbox by: ID");
     driver.findElement(By.id("email")).sendKeys("id@gmail.com");
    }
}
