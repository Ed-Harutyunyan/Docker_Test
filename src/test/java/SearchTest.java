import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SearchTest extends BaseTest{

    @Test
    public void test_() {
        int returnedNumberOfProducts = BaseTest.homePage
                .acceptPrivacyModal()
                .clickSearchIcon()
                .search("1149-1859-309")
                .searchResults();

        Assertions.assertEquals(returnedNumberOfProducts, 1);
    }



}
