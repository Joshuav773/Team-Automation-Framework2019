package eBayUtil;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class SignIn extends CommonAPI {
    @FindBy(xpath = "//a[contains (text(), 'Sign in')]")public static WebElement signInlink;
    @FindBy(css = "#sgnBt")public static WebElement signInButton;
    @FindBy(css ="#userid")public static WebElement userIdInputBar;
    @FindBy(css = "#pass")public static WebElement passwordInputBar;
    @FindBy(xpath = "//a[contains (text(), 'register')]") public static WebElement registerLink;
    @FindBy(css = "#firstname")public static WebElement firstNameforRegister;
    @FindBy(css = "#lastname")public static WebElement lastNameforRegister;
    @FindBy(css = "#email")public static WebElement emailForRegister;
    @FindBy(xpath = "//input[@name= 'PASSWORD']")public static WebElement passwordForRegister;
    @FindBy(css = "#ppaFormSbtBtn")public static WebElement registerButton;

    public void signIn(){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       signInlink.click();
       userIdInputBar.sendKeys("joshuav773@gmail.com");
       passwordInputBar.sendKeys("Bball1773");
       signInButton.click();
    }
    public void registerNewUser(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        registerLink.click();
        firstNameforRegister.sendKeys("akeleyoyo");
        lastNameforRegister.sendKeys("akeleyoyomamasita");
        emailForRegister.sendKeys("joshuav773@outlook.com");
        passwordForRegister.sendKeys("Bball1772");
        registerButton.click();
    }

}
