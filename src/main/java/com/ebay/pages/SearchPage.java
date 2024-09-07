package com.ebay.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage extends BasePage {
    private By searchInput = By.id("gh-ac");
    private By submitButton = By.id("gh-btn");
    private By findProducts = By.xpath("//li[contains(@id,'item')]");
    private By productTitle = By.xpath("//li[contains(@id,'item')]//span[@role=\"heading\"]");

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> searchFirstFiveResult(String text) {
        driver.findElement(searchInput).sendKeys(text);
        driver.findElement(submitButton).click();
        List<WebElement> products = driver.findElements(findProducts);

        for (int i = 0; i < Math.min(5, products.size()); i++) {
            WebElement product = products.get(i);

            WebElement titleElement = product.findElement(productTitle);
            String title = titleElement.getText();
        }

        return products;
    }
}
