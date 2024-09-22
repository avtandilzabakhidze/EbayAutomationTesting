package com.ebay.pages;

import org.openqa.selenium.By;

public class RegisterPage {
    public static final By registerButton = By.linkText("register");
    public static final By firstName = By.id("firstname");
    public static final By lastName = By.id("lastname");
    public static final By email = By.id("Email");
    public static final By password = By.id("password");
    public static final By createPersonalAccount = By.id("EMAIL_REG_FORM_SUBMIT ");
    public static final By iAmHuman = By.id("checkbox ");
}
