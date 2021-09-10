package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(id = "prependedInput")
    private WebElement login;

    @FindBy(id = "prependedInput2")
    private WebElement pass;

    @FindBy(id = "_submit")
    private WebElement btn1;

    @FindBy(xpath = "//a[@class=\'unclickable\']/span[contains(text(),\'Проекты\')]")
    private WebElement projekts;

    @FindBy(css = ".dropdown:nth-child(3) .single:nth-child(4) .title")
    private WebElement myProjekts;

    @FindBy(linkText = "Создать проект")
    private WebElement createProjekt;

    @FindBy(name = "crm_project[name]")
    private WebElement projektName;

    @FindBy(css = ".select2-default > .select2-chosen")
    private WebElement organ;

    @FindBy(id = "select2-drop-mask")
    private WebElement organ1;

    @FindBy(css = ".select2-default > .select2-chosen")
    private WebElement kl;

    @FindBy(id = "select2-drop-mask")
    private WebElement kl1;

    @FindBy(name = "crm_project[businessUnit]")
    private WebElement business;

    @FindBy(xpath = "//option[. = 'Research & Development']")
    private WebElement business1;

    @FindBy(name = "crm_project[curator]")
    private WebElement curator;

    @FindBy(xpath = "//option[. = 'Юзеров Юзер']")
    private WebElement curator1;

    @FindBy(name = "crm_project[rp]")
    private WebElement rp;

    @FindBy(xpath = "//option[. = 'Корыстин Василий']")
    private WebElement rp1;

    @FindBy(name = "crm_project[administrator]")
    private WebElement admin;

    @FindBy(xpath = "//option[. = 'Юзеров Юзер']")
    private WebElement admin1;

    @FindBy(name = "crm_project[manager]")
    private WebElement manager;

    @FindBy(xpath = "//option[. = 'Палкина Анна']")
    private WebElement manager1;

    @FindBy(css = ".btn-group:nth-child(4) > .btn")
    private WebElement btn5;

    public void loginClick() {
        login.click();
    }

    public void loginIn(String log) {
        login.sendKeys(log);
    }

    public void passClick() {
        pass.click();
    }

    public void passIn(String password) {
        pass.sendKeys(password);
    }

    public void btn1Click() {
        btn1.click();
    }

    public void projektsClick() {
        projekts.click();
    }

    public void myProjektsClick() {
        myProjekts.click();
    }

    public void createProjekt() {
        createProjekt.click();
    }

    public void projektNameClick() {
        projektName.click();
    }

    public void projektNameIn(String name) {
        projektName.sendKeys(name);
    }

    public void organClick() {
        organ.click();
    }

    public void organ1Click() {
        organ1.click();
    }

    public void klClick() {
        kl.click();
    }

    public void kl1Click() {
        kl1.click();
    }

    public void businessClick() {
        business.click();
    }

    public void business1Click() {
        business1.click();
    }

    public void curatorClick() {
        curator.click();
    }

    public void curator1Click() {
        curator1.click();
    }

    public void rpClick() {
        rp.click();
    }

    public void rp1Click() {
        rp1.click();
    }

    public void adminClick() {
        admin.click();
    }

    public void admin1Click() {
        admin1.click();
    }

    public void managerClick() {
        manager.click();
    }

    public void manager1Click() {
        manager1.click();
    }

    public void btn5Click() {
        btn5.click();
    }
}
