package com.ebay.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelpContactPage extends BasePage {
    private final By sellerInformationCenter = By.linkText("Seller Information Center");
    private final By sellerMessage = By.xpath("//div[@class=\"text\"]//h1");
    private final By contactUs = By.linkText("Contact us");
    private final By contactMessage = By.id("srTil");

    public HelpContactPage(WebDriver driver) {
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
