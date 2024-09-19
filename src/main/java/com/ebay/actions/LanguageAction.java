package com.ebay.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static com.ebay.pages.LanguagePage.*;

public class LanguageAction extends BasePage{
    private Actions actions = new Actions(driver);

    public LanguageAction(WebDriver driver) {
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
