import com.ebay.pages.SearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class SearchPageTest {
    private WebDriver driver;
    private SearchPage searchPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        searchPage =new SearchPage(driver);
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void BasePageTest() {
        List<WebElement> books = searchPage.searchFirstFiveResult("book");

        for (WebElement book : books) {
            System.out.println(book.toString());
        }
    }
}
