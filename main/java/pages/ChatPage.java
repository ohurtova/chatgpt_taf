package pages;

import org.openqa.selenium.WebDriver;
import utils.Utils;

public class ChatPage extends BasePage {
    private String popupId = "sydneyPayWallContent";

    public ChatPage(WebDriver driver) {
        super(driver);
    }

    public static ChatPage initPage(WebDriver driver) {
        return new ChatPage(driver);
    }

    public boolean isPopupDisplayed() {
        return Utils.isElementDisplayed(driver, popupId);
    }
}
