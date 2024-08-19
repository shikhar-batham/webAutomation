package com.webAutomation.webAutomation.base;

import com.webAutomation.webAutomation.util.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;

    public TestBase() {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("D:\\IdeaProjects\\webAutomation\\src\\main\\java\\com\\webAutomation\\webAutomation\\config\\config.properties");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialization() {
        String browser = prop.getProperty("browser");
//        if (browser.equals("chrome")) {
//            System.setProperty("webdriver.chrome.driver", "D:\\webDrivers\\chromedriver-win32\\chromedriver.exe");
//            driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
//        }

        System.setProperty("webdriver.chrome.driver", "D:\\webDrivers\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtil.PAGE_LOAD_TIMEOUT));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TestUtil.IMPLICIT_WAIT));

        driver.get("https://classic.freecrm.com/");
    }

}
