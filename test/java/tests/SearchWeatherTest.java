package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchResultsPage;

import java.util.List;


public class SearchWeatherTest extends BaseTest {

    private HomePage homePage;
    private SearchResultsPage searchResultsPage;


    @BeforeMethod
    public void initPages() {
        homePage = HomePage.initPage(driver);
        searchResultsPage = SearchResultsPage.initPage(driver);
    }

    @Test
    public void testSearchBar() {
        homePage.inputSearchBar("weather in Lviv”");
        List<String> results = searchResultsPage.getResultsList();
        Assert.assertTrue(results
                .stream()
                .allMatch(e -> e
                        .contains("Lviv") || e.contains("L'viv") && e
                        .contains("°C") || e.contains("forecast") || e.contains("weather")),
                "Not all results contain expected conditions!");
    }
}
