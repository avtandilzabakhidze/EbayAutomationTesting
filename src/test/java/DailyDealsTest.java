import com.ebay.pages.DailyDealsPage;
import com.ebay.pages.SearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DailyDealsTest {
    private WebDriver driver;
    private DailyDealsPage dailyDealsPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        dailyDealsPage = new DailyDealsPage(driver);
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void dailyDealsTest() {
        boolean isDisplayed = dailyDealsPage.dealProductVisibility();
        Assert.assertTrue(isDisplayed,"\n Daily Deals Page is displayed \n");
    }
}
