package com.webAutomation.webAutomation.pages;

import com.webAutomation.webAutomation.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.util.TimeUtils;

public class HomePage extends TestBase {

    @FindBy(xpath = "//b[normalize-space()='SessionMates']")
    WebElement userNameLabel;

    @FindBy(xpath = "//a[@href='/contacts']")
    WebElement contactsLink;

    @FindBy(xpath = "//a[@href='/deals']")
    WebElement dealsLink;

    @FindBy(xpath = "//a[@href='/tasks']")
    WebElement tasksLink;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public String verifyHomePageTittle() {
        return driver.getTitle();
    }

    public ContactsPage clickOnContactsPage() {
        contactsLink.click();
        return new ContactsPage();
    }

    public DealsPage clickOnDealLink(){
        dealsLink.click();
        return new DealsPage();
    }

    public TasksPage clickOnTasksPage(){
        tasksLink.click();
        return new TasksPage();
    }
}
