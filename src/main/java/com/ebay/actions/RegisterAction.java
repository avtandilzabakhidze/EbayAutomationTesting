package com.ebay.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.ebay.pages.RegisterPage.*;

public class RegisterAction extends BasePage{
    public RegisterAction(WebDriver driver) {
        super(driver);
    }

    public boolean enterPersonalInformation(String fName, String lName, String em, String pass) {
        find(registerButton).click();
        find(firstName).sendKeys(fName);
        find(lastName).sendKeys(lName);
        find(email).sendKeys(em);
        find(password).sendKeys(pass);
        WebElement webElement = waitForVisibility(createPersonalAccount);

        return webElement.isEnabled();
    }
}
