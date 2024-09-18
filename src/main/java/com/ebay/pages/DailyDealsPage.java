package com.ebay.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DailyDealsPage extends BasePage{
    private final By dealsButton = By.linkText("Daily Deals");
    private final By dealProductImg = By.xpath("//div[@class=\"ebayui-dne-summary-card__wrapper\"]//img");

    public DailyDealsPage(WebDriver driver) {
        super(driver);
    }

    public boolean dealProductVisibility(){
        click(dealsButton);
        boolean displayed = find(dealProductImg).isDisplayed();
        return displayed;
    }
}
