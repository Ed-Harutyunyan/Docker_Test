import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;
    private static final By PRIVACY_MODAL = By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]");
    private static final By SEARCH_BUTTON = By.xpath("//button[@data-test-btn=\"search-cta\"]");
    private static final By SEARCH_INPUT = By.xpath("//input[@class=\"form-control form-control form-input-search\"]");
    private static final By SEARCH_BUTTON_TO_SEARCH = By.xpath("//button[contains(@class, 'btn') and contains(@class, 'search-btn')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public HomePage acceptPrivacyModal() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(PRIVACY_MODAL)).click();
        } catch (Exception ignored) {

        }
        return this;
    }

    public HomePage clickSearchIcon() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(SEARCH_BUTTON)).click();
        return this;
    }

    public SearchResult search(String search) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(SEARCH_INPUT)).sendKeys(search);
        wait.until(ExpectedConditions.visibilityOfElementLocated(SEARCH_BUTTON_TO_SEARCH)).click();
        return new SearchResult(driver);
    }

}
