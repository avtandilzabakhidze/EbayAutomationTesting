import com.ebay.actions.SearchAction;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SearchTest {
    private WebDriver driver;
    private SearchAction searchAction;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        searchAction = new SearchAction(driver);
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testSearchButtonPresence() {
        boolean isDisplayed = searchAction.searchButtonPresence();
        Assert.assertTrue(isDisplayed, "\n Search button presence is not displayed \n");
    }

    @Test
    public void testSubmitButtonIsPresence() {
        boolean isDisplayed = searchAction.submitButtonIsPresence();
        Assert.assertTrue(isDisplayed, "\n Submit button presence is not displayed \n");
    }

    @Test
    public void testSearchElementSize() {
        int elementSize = searchAction.searchElementSize("book");
        int expectedSize = 60;

        Assert.assertEquals(elementSize, expectedSize, "\n element size is incorrect \n");
    }

    @Test
    public void testSearchMaxQuerySize() {
        String text  = "s".repeat(100);
        boolean currentMessage = searchAction.searchMaxQuerySize(text);
        Assert.assertTrue(currentMessage , "\n Search max query size is incorrect \n");
    }

    @Test
    public void testSearchMinQuerySize() {
        String text  = "s";
        boolean currentMessage = searchAction.searchMinQuerySize(text);
        Assert.assertTrue(currentMessage , "\n Search min query size is incorrect \n");
    }
}
