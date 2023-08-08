package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Utils;
import utils.Waiter;

public class HomePage extends BasePage {
    private By SEARCH_BAR = By.id("sb_form_q");
    private By hamburgerMenu =  By.id("id_sc");
    private By settingsHambMenu = By.id("hbsettings");
    private By chatTopMenuItem = By.id("codex");
    private By settingsMoreOptionXpath =  By.xpath("//*[@class='hb_titlerow'][contains(., 'More')]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public static HomePage initPage(WebDriver driver) {
        return new HomePage(driver);
    }


    public void inputSearchBar(String searchRequest) {
        driver.findElement(SEARCH_BAR).clear();
        driver.findElement(SEARCH_BAR).click();
        driver.findElement(SEARCH_BAR).sendKeys(searchRequest);
        Utils.click(driver, By.id("search_icon"));
    }

    public void clickTopMenuItem(String menuItem) {
        switch (menuItem) {
            case "Chat":
                Waiter.waitForElementToBeClickable(driver, chatTopMenuItem);
                Utils.click(driver, chatTopMenuItem);
                break;

            // TODO: implement other cases

            default:
                throw new IllegalArgumentException("Unsupported top menu item name: " + menuItem);
        }
    }

    public void selectOptionInHamburgerSettings(String menuItem) {
        switch (menuItem) {
            case "More":
                Waiter.waitForElementToBeClickable(driver, hamburgerMenu);
                Utils.click(driver, hamburgerMenu);
                Utils.click(driver, settingsHambMenu);
                Utils.click(driver, settingsMoreOptionXpath);
                break;

            // TODO: implement other cases

            default:
                throw new IllegalArgumentException("Unsupported hamburger menu option: " + menuItem);
        }
    }
}
