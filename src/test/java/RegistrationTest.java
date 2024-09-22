import com.ebay.actions.RegisterAction;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationTest {
    private WebDriver driver;
    private RegisterAction registerAction;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        registerAction = new RegisterAction(driver);
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testRegistration() {
        boolean isEnabledCreateButton = registerAction.enterPersonalInformation("one", "two", "onetwo323543@gmail.com", "Passwo12344!");

        Assert.assertTrue(isEnabledCreateButton,"\n register button is not enable \n");
    }
}
