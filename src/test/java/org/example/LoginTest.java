package org.example;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class LoginTest {
    public static LoginPage loginPage;
    public static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\DRIVERS\\chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().window().maximize();
        driver.get(ConfProperties.getProperty("loginpage"));

    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void loginTest() {
        loginPage.loginClick();
        loginPage.loginIn(ConfProperties.getProperty("log"));
        Assert.assertEquals("Applanatest1", ConfProperties.getProperty("log"));
        loginPage.passClick();
        loginPage.passIn(ConfProperties.getProperty("password"));
        Assert.assertEquals("Student2020!", ConfProperties.getProperty("password"));
        loginPage.btn1Click();
        String title1 = driver.getTitle();
        Assert.assertEquals("Панель инструментов", title1);
        loginPage.projektsClick();
        loginPage.myProjektsClick();
        loginPage.createProjekt();
        loginPage.projektNameClick();
        loginPage.projektNameIn(ConfProperties.getProperty("name"));
        Assert.assertEquals("projekt1010", ConfProperties.getProperty("name"));
        loginPage.organClick();
        loginPage.organ1Click();
        loginPage.klClick();
        loginPage.kl1Click();
        loginPage.businessClick();
        loginPage.business1Click();
        loginPage.curatorClick();
        loginPage.curator1Click();
        loginPage.rpClick();
        loginPage.rp1Click();
        loginPage.adminClick();
        loginPage.admin1Click();
        loginPage.managerClick();
        loginPage.manager1Click();
        loginPage.btn5Click();
    }
}
