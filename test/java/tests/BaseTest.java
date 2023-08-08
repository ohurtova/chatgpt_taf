package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import webDriverFactory.WebDriverFactory;

public class BaseTest {
    public WebDriver driver;

    private static final String BASE_URL = "https://www.bing.com/ ";


    @BeforeMethod
    public void openHomePage() {
        driver = new WebDriverFactory().createWebDriver(WebDriverFactory.BrowserType.CHROME);
        driver.navigate().to(BASE_URL);
    }

    @AfterMethod(alwaysRun = true)
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
