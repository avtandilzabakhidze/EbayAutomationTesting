package com.ebay.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SocialNetworkPage extends BasePage {
    private final By blog = By.linkText("eBay's Blogs");
    private final By facebook = By.linkText("Facebook");
    private final By twitter = By.linkText("Twitter");
    private WebDriverWait wait;

    public SocialNetworkPage(WebDriver driver) {
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
