package com.ebay.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.ebay.pages.SearchPage.*;


public class SearchAction extends BasePage{

    public SearchAction(WebDriver driver) {
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
