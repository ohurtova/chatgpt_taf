package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SettingsPage;

public class RedirectionToSettingsTest extends BaseTest {
    private HomePage homePage;
    private SettingsPage settingsPage;

    @BeforeMethod
    public void initPages() {
        homePage = HomePage.initPage(driver);
        settingsPage = SettingsPage.initPage(driver);
    }

    @Test
    public void testRedirectionToSettingsPage() {
        homePage.selectOptionInHamburgerSettings("More");
        Assert.assertTrue(settingsPage.isSettingsTitleDisplayed());
    }
}
