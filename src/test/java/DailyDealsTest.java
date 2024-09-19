import com.ebay.actions.DailyDealsAction;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DailyDealsTest {
    private WebDriver driver;
    private DailyDealsAction dailyDeals;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        dailyDeals = new DailyDealsAction(driver);
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void dailyDealsTest() {
        boolean isDisplayed = dailyDeals.dealProductVisibility();
        Assert.assertTrue(isDisplayed,"\n Daily Deals Page is displayed \n");
    }
}
