import com.ebay.pages.SearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchTest {
    private WebDriver driver;
    private SearchPage searchPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        searchPage = new SearchPage(driver);
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testSearchButtonPresence() {
        boolean isDisplayed = searchPage.searchButtonPresence();
        Assert.assertTrue(isDisplayed, "\n Search button presence is not displayed \n");
    }

    @Test
    public void testSubmitButtonIsPresence() {
        boolean isDisplayed = searchPage.submitButtonIsPresence();
        Assert.assertTrue(isDisplayed, "\n Submit button presence is not displayed \n");
    }

    @Test
    public void testSearchElementSize() {
        int elementSize = searchPage.searchElementSize("book");
        int expectedSize = 60;

        Assert.assertEquals(elementSize, expectedSize, "\n element size is incorrect \n");
    }

    @Test
    public void testSearchMaxQuerySize() {
        String text  = "s".repeat(100);
        boolean currentMessage = searchPage.searchMaxQuerySize(text);
        Assert.assertTrue(currentMessage , "\n Search max query size is incorrect \n");
    }

    @Test
    public void testSearchMinQuerySize() {
        String text  = "s";
        boolean currentMessage = searchPage.searchMinQuerySize(text);
        Assert.assertTrue(currentMessage , "\n Search min query size is incorrect \n");
    }
}
