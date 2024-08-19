package com.webAutomation.webAutomation.pages;

import com.webAutomation.webAutomation.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(name = "username")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//input[@class='btn btn-small']")
    WebElement loginBtn;

    @FindBy(xpath = "//a[normalize-space()='Sign Up']")
    WebElement signUpBtn;

    @FindBy(xpath = "//img[@alt='Free CRM Software for customer relationship management, sales and support']")
    WebElement crmLogo;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public String validatePageTittle() {
        return driver.getTitle();
    }

    public boolean validateCrmLogo() {
        return crmLogo.isDisplayed();
    }

    public HomePage login(String un, String pwd) {
        username.sendKeys(un);
        password.sendKeys(pwd);
        loginBtn.click();

        return new HomePage();
    }
}
