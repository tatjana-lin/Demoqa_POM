package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "userName")
    WebElement userName;

    @FindBy(id = "password")
    WebElement pass;

    public LoginPage enterPersonalData(String user, String password) {
//        typeWithJS(userName, user);
        type(userName, user);
        type(pass, password);
        return this;
    }

    @FindBy(id = "login")
    WebElement loginButton;

    public ProfilePage clickOnLoginLink() {
        clickWithJS(loginButton, 0, 200);
        return new ProfilePage(driver);
    }
}
