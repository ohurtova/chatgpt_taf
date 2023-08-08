package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ChatPage;
import pages.HomePage;


public class RedirectionToChatPageTest extends BaseTest {

    private HomePage homePage;
    private ChatPage chatPage;
    private String topMenuItem = "Chat";


    @BeforeMethod
    public void initPages() {
        homePage = HomePage.initPage(driver);
        chatPage = ChatPage.initPage(driver);
    }

    @Test
    public void testChatPageRedirection() {
        homePage.clickTopMenuItem(topMenuItem);
        Assert.assertTrue(chatPage.isPopupDisplayed(), "Pop-up wasn`t displayed!");
    }
}
