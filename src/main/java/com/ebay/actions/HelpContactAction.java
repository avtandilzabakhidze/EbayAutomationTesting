package com.ebay.actions;

import org.openqa.selenium.WebDriver;

import static com.ebay.pages.HelpContactPage.*;

public class HelpContactAction extends BasePage {
    public HelpContactAction(WebDriver driver) {
        super(driver);
    }

    public boolean contactUsIsDisplay(String expectedText) {
        click(contactUs);
        String contactText = getText(contactMessage);
        boolean contains = contactText.contains(expectedText);
        return contains;
    }

    public boolean sellerInformationCenterIsDisplay(String expectedText) {
        click(sellerInformationCenter);
        String contactText = getText(sellerMessage);

        boolean contains = contactText.contains(expectedText);
        return contains;
    }
}
