package com.ebay.pages;

import org.openqa.selenium.By;

public class SearchPage {
   public static final By searchInput = By.id("gh-ac");
   public static final By submitButton = By.id("gh-btn");
   public static final By findProducts = By.xpath("//li[contains(@id,'item')]");
   public static final By errorMessage = By.xpath("//div[@class ='s-error']");
   public static final By advancedSearchButton = By.linkText("Advanced");
   public static final By advancedSearchProduct = By.id("_nkw");
}
