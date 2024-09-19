import com.ebay.actions.LanguageAction;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LanguageTest {
    private WebDriver driver;
    private LanguageAction languageAction;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        languageAction = new LanguageAction(driver);
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testSelectAustraliaLanguage() {
        String resultText = languageAction.selectAustraliaLanguage();
        String expectedText = "Australia";
        Assert.assertEquals(resultText, expectedText , "\n Language did not change \n");
    }

    @Test
    public void testSelectIrelandLanguage() {
        String resultText = languageAction.selectIrelandLanguage();
        String expectedText = "Ireland";
        Assert.assertEquals(resultText, expectedText , "\n Language did not change \n");
    }

    @Test
    public void testSelectArgentinaLanguage() {
        String resultText = languageAction.selectArgentinaLanguage();
        String expectedText = "Argentina";
        Assert.assertEquals(resultText, expectedText , "\n Language did not change \n");
    }
}
