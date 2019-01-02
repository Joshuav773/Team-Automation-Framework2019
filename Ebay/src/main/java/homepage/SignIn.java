package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn extends CommonAPI {
    @FindBy(xpath = "//a[contains (text(), 'Sign in')]")public static WebElement signInlink;
    @FindBy(css = "#sgnBt")public static WebElement signInButton;
    @FindBy(css ="#userid")public static WebElement userIdInputBar;
    @FindBy(css = "#pass")public static WebElement passwordInputBar;
    @FindBy(xpath = "//a[contains (text(), 'register')]") public static WebElement registerLink;

    public void signIn(){
       signInlink.click();
       userIdInputBar.sendKeys("joshuav773@gmail.com");
       passwordInputBar.sendKeys("Bball1773");
       signInButton.click();
    }
    public void registerNewUser(){
        registerLink.click();


    }
}
