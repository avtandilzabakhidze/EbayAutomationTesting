package com.ebay.pages;

import org.openqa.selenium.By;

public class DailyDealsPage {
    public static final By dealsButton = By.linkText("Daily Deals");
    public static final By dealProductImg = By.xpath("//div[@class=\"ebayui-dne-summary-card__wrapper\"]//img");
}
