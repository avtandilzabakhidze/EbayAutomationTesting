package com.ebay.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static com.ebay.pages.SocialNetworkPage.*;

public class SocialNetworkAction extends BasePage{
    private WebDriverWait wait;

    public SocialNetworkAction(WebDriver driver) {
        super(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String openBlogPage(String newUrl) {
        driver.findElement(blog).click();
        waitForUrlToChange(newUrl);
        String currentUrl = driver.getCurrentUrl();
        return currentUrl;
    }

    public String openFacebookPage(String newUrl) {
        driver.findElement(facebook).click();
        waitForUrlToChange(newUrl);
        String currentUrl = driver.getCurrentUrl();
        return currentUrl;
    }

    public String openTwitterPage(String newUrl) {
        driver.findElement(twitter).click();
        waitForUrlToChange(newUrl);
        String currentUrl = driver.getCurrentUrl();
        return currentUrl;
    }
}
