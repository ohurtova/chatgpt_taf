package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchResultsPage extends BasePage {

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }


    public static SearchResultsPage initPage(WebDriver driver) {
        return new SearchResultsPage(driver);
    }

    public List<String> getResultsList() {
        List<WebElement> elementList = driver.findElements(By
                .xpath("//*[@id='b_results']//div[contains(@class, 'b_algo')]"));
        List<String> resultList = new ArrayList<>();
        for (WebElement webelement: elementList) {
            resultList.add(webelement.getText());
        }
        return resultList;
    }
}
