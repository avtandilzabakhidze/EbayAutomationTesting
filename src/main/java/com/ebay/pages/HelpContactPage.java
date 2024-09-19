package com.ebay.pages;

import org.openqa.selenium.By;

public class HelpContactPage {
    public static final By sellerInformationCenter = By.linkText("Seller Information Center");
    public static final By sellerMessage = By.xpath("//div[@class=\"text\"]//h1");
    public static final By contactUs = By.linkText("Contact us");
    public static final By contactMessage = By.id("srTil");
}
