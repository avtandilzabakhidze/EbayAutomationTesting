package com.ebay.actions;

import org.openqa.selenium.WebDriver;

import static com.ebay.pages.DailyDealsPage.dealProductImg;
import static com.ebay.pages.DailyDealsPage.dealsButton;

public class DailyDealsAction extends BasePage{
    public DailyDealsAction(WebDriver driver) {
        super(driver);
    }
    public boolean dealProductVisibility() {
        click(dealsButton);
        boolean displayed = find(dealProductImg).isDisplayed();
        return displayed;
    }
}
