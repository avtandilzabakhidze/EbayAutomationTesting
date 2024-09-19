import com.ebay.actions.HelpContactAction;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HelpContactTest {
    private WebDriver driver;
    private HelpContactAction helpContact;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        helpContact = new HelpContactAction(driver);
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void helpContactTest() {
        String expectedText = "How can we help you today?";
        boolean isDisplay = helpContact.contactUsIsDisplay(expectedText);
        Assert.assertTrue(isDisplay, "\n Contact Page is not display \n");
    }

    @Test
    public void sellerInformationCenterTest() {
        String expectedText = "Welcome to the eBay Seller Center";
        boolean isDisplay = helpContact.sellerInformationCenterIsDisplay(expectedText);
        Assert.assertTrue(isDisplay, "\n Information Center Page is not display \n");
    }
}
