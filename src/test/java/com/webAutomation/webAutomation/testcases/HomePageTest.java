package com.webAutomation.webAutomation.testcases;

import com.webAutomation.webAutomation.base.TestBase;
import com.webAutomation.webAutomation.pages.HomePage;
import com.webAutomation.webAutomation.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;

    HomePageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
        homePage = loginPage.login("shikhar.batham@gmail.com", "Shikhar@123");
    }

    @Test(priority = 1)
    public void verifyHomePageTittleTest(){
        String tittle = homePage.verifyHomePageTittle();
        Assert.assertEquals(tittle,"COGMENTO","Home page tittle not matched");
    }



    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
