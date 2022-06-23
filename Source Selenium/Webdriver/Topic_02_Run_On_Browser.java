package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Topic_02_Run_On_Browser {
    WebDriver driver;
    String projectPath = System.getProperty("user.dir");

    String pathGeckoDriver = "D:\\common\\browserDrivers";

    @Test
    public void TC_01_Firefox_Lastest() {
        // Firefox lastest: 89
        // Selenium 3.141.59
        // TestNG 6.14.59
        // Gecko Driver
        System.setProperty("webdriver.gecko.driver", pathGeckoDriver + "\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get ("https://trove-web.dev2.goldfishcode.com/");
        driver.quit();
    }
    // @Test
    public void TC_02_Firefox_Old() {
        // Firefox 47.0.2
        // Selenium 2.53.1
        // Ko TestNG
        // Ko Gecko Driver
        driver = new FirefoxDriver();
    }
}
