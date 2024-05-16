import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchResult {

    private WebDriver driver;
    private WebDriverWait wait;
    private static final List<By> RETURNED_PRODUCTS = List.of(By.xpath("//div[contains(@class, 'results-list') and contains(@class, 'qa-search-results-list')]"));

    public SearchResult(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public int searchResults() {
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath(
                        "//div[contains(@class, 'results-list') and contains(@class, 'qa-search-results-list')]"),
                0));

        return RETURNED_PRODUCTS.size();
    }

}
