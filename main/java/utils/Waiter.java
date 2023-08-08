package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waiter {
    private static final int DEFAULT_TIMEOUT_SECONDS = 10;


    private Waiter() {
        // Private constructor to prevent instantiation
    }

    private static WebDriverWait getWebDriverWait(WebDriver driver, int timeoutSeconds) {
        return new WebDriverWait(driver, timeoutSeconds);
    }

    public static void waitForElementToBeClickable(WebDriver driver, By locator) {
        getWebDriverWait(driver, DEFAULT_TIMEOUT_SECONDS)
                .until(ExpectedConditions.elementToBeClickable(driver.findElement(locator)));
    }
}
