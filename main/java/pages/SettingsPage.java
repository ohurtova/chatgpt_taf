package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SettingsPage {

    private WebDriver driver;

    public SettingsPage(WebDriver driver) {
        this.driver = driver;
    }

    public static SettingsPage initPage(WebDriver driver) {
        return new SettingsPage(driver);
    }

    public boolean isSettingsTitleDisplayed() {
        WebElement titleElement = driver.findElement(By.xpath("//h2[contains(text(), 'Settings')]"));
        return titleElement.isDisplayed();
    }
}
