package com.webAutomation.webAutomation.testcases;

import com.webAutomation.webAutomation.base.TestBase;
import com.webAutomation.webAutomation.pages.HomePage;
import com.webAutomation.webAutomation.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    LoginPage loginPage;

    public LoginPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
    }

    @Test(priority = 1)
    public void loginPageTittleTest() {
        String tittle = loginPage.validatePageTittle();
        Assert.assertEquals(tittle, "Free CRM software for customer relationship management, sales, and support.");
    }

    @Test(priority = 2)
    public void crmLoginPageLogoTest() {
        boolean isLogoDisplayed = loginPage.validateCrmLogo();
        Assert.assertTrue(isLogoDisplayed);
    }

    @Test(priority = 3)
    public void loginTest() {
        HomePage home = loginPage.login("shikhar.batham@gmail.com", "Shikhar@123");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
