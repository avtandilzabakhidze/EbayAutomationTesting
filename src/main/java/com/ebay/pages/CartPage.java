package com.ebay.pages;

import org.openqa.selenium.By;

public class CartPage {
    public static final By addedProductNumber = By.id("gh-cart-n");
    public static final By cart = By.id("gh-minicart-hover");
    public static final By searchInput = By.id("gh-ac");
    public static final By submitButton = By.id("gh-btn");
    public static final By findProducts = By.xpath("//li[contains(@id,'item')]");
    public static final By productTitle = By.xpath("//li[contains(@id,'item')]//span[@role='heading']");
    public static final By addToCart = By.id("atcBtn_btn_1");
}
