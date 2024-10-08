import com.ebay.actions.CartAction;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CardTest {
    private WebDriver driver;
    private CartAction cartAction;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        cartAction = new CartAction(driver);
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testAddedOneProduct() {
        int currentAddedProducts = cartAction.addOneProductToCart("book", 2);
        int expectedNumber = 1;

        Assert.assertEquals(currentAddedProducts, expectedNumber, "\n Product did not add \n");
    }
}
