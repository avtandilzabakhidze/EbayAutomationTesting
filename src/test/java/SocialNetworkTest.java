import com.ebay.pages.SocialNetworkPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SocialNetworkTest {
    private WebDriver driver;
    private SocialNetworkPage socialNetworkPage;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        socialNetworkPage = new SocialNetworkPage(driver);
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testFacebookPage() {
        String facebookPage = socialNetworkPage.openFacebookPage( "https://www.facebook.com/ebay/");
        String url ="https://www.facebook.com/ebay/";
        Assert.assertEquals(facebookPage,url,"\n Facebook page is not opened \n");
    }

    @Test
    public void testBlogPage() {
        String facebookPage = socialNetworkPage.openBlogPage( "https://www.ebayinc.com/");
        String url ="https://www.ebayinc.com/";
        Assert.assertEquals(facebookPage,url,"\n Blog page is not opened \n");
    }

    @Test
    public void testTwitterPage() {
        String facebookPage = socialNetworkPage.openTwitterPage( "https://x.com/eBay");
        String url ="https://x.com/eBay";
        Assert.assertEquals(facebookPage,url,"\n Twitter page is not opened \n");
    }
}