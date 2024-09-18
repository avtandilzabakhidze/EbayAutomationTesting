package com.ebay.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage extends BasePage {
    private final By searchInput = By.id("gh-ac");
    private final By submitButton = By.id("gh-btn");
    private final By findProducts = By.xpath("//li[contains(@id,'item')]");
    private final By errorMessage = By.xpath("//div[@class ='s-error']");
    private final By advancedSearchButton = By.linkText("Advanced");
    private final By advancedSearchProduct= By.id("_nkw");

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public boolean searchButtonPresence() {
        find(searchInput).clear();
        return find(searchInput).isDisplayed();
    }

    public boolean submitButtonIsPresence() {
        find(searchInput).clear();
        return find(searchInput).isDisplayed();
    }

    public int searchElementSize(String text) {
        find(searchInput).clear();
        find(searchInput).sendKeys(text);
        find(submitButton).click();
        List<WebElement> products = findElements(findProducts);
        return products.size();
    }

    public boolean searchMaxQuerySize(String text) {
        find(searchInput).clear();
        find(searchInput).sendKeys(text);
        find(submitButton).click();
        waitForVisibility(errorMessage);
        String resultText = getText(errorMessage);
        boolean contains = resultText.contains("Let's try that again.");

        return contains;
    }

    public boolean searchMinQuerySize(String text) {
        find(searchInput).clear();
        find(searchInput).sendKeys(text);
        find(submitButton).click();
        waitForVisibility(errorMessage);
        String resultText = getText(errorMessage);
        boolean contains = resultText.contains("Let's try that again.");

        return contains;
    }

    //Advanced search
    public void testAdvancedSearch() {
        find(advancedSearchButton).click();

    }
}
