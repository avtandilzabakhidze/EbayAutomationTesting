package com.ebay.actions;

import com.ebay.pages.CartPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Set;

import static com.ebay.pages.CartPage.*;

public class CartAction extends BasePage{
    private CartPage cartPage;

    public CartAction(WebDriver driver) {
        super(driver);
    }

    public int addOneProductToCart(String productName, int number) {
        searchElement(productName);

        waitForClickable(findProducts);
        List<WebElement> products = findElements(findProducts);
        WebElement product = products.get(number);
        WebElement titleElement = product.findElement(productTitle);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", titleElement);
        wait.until(ExpectedConditions.elementToBeClickable(titleElement)).click();

        switchToNewWindow();
        wait.until(ExpectedConditions.elementToBeClickable(addToCart)).click();
        switchToOriginalWindow();

        return getCartCount();
    }

    private void searchElement(String text) {
        find(searchInput).clear();
        find(searchInput).sendKeys(text);
        find(submitButton).click();
    }

    private void switchToNewWindow() {
        String originalWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    private void switchToOriginalWindow() {
        String originalWindow = driver.getWindowHandle();
        driver.switchTo().window(originalWindow);
    }

    private int getCartCount() {
        String addedNumber = getText(addedProductNumber);
        try {
            return Integer.parseInt(addedNumber);
        } catch (NumberFormatException e) {
            System.err.println("Cart count could not be parsed: " + addedNumber);
            return 0;
        }
    }
}
