package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Utils {

    private WebDriver driver;

    public Utils(WebDriver driver) {
        this.driver = driver;
    }

    public static void click(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        element.click();
    }

    public static boolean isElementDisplayed(WebDriver driver, String elementId) {
        WebElement element;
        try {
            element = driver.findElement(By.id(elementId));
        } catch (Exception e) {
            driver.navigate().refresh();
            element = driver.findElement(By.id(elementId));
        }

        return element.isDisplayed();
    }
}
