import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SomeTest extends BaseTest{

    @Test
    public void test() {

        WebElement priceElement = BaseTest.getDriver().findElement(By.cssSelector(".product-sale-price"));

        // Extract the price text
        String price = priceElement.getText().trim();

        // Print the extracted price
        System.out.println("Price: " + price);
    }
}
