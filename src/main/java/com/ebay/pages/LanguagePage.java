package com.ebay.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LanguagePage extends BasePage {
    private By languageSelector = By.id("gf-fbtn");
    private By ArgLanguage = By.xpath("//div[@id ='gf-f']//li//p[text() ='Argentina']");
    private By AustrLanguage = By.xpath("//div[@id ='gf-f']//li//p[text() ='Australia']");
    private By IrlLanguage = By.xpath("//div[@id ='gf-f']//li//p[text() ='Ireland']");
    private Actions actions = new Actions(driver);

    public LanguagePage(WebDriver driver) {
        super(driver);
    }

    public String selectAustraliaLanguage() {
        WebElement dropdown = find(languageSelector);

        actions.moveToElement(dropdown).perform();
        waitForClickable(AustrLanguage).click();

        WebElement webElement = waitForVisibility(languageSelector);
        return getText(languageSelector);
    }

    public String selectIrelandLanguage() {
        WebElement dropdown = find(languageSelector);

        actions.moveToElement(dropdown).perform();
        waitForClickable(IrlLanguage).click();

        WebElement webElement = waitForVisibility(languageSelector);
        return getText(languageSelector);
    }

    public String selectArgentinaLanguage() {
        WebElement dropdown = find(languageSelector);

        actions.moveToElement(dropdown).perform();
        waitForClickable(ArgLanguage).click();

        WebElement webElement = waitForVisibility(languageSelector);
        return getText(languageSelector);
    }
}
