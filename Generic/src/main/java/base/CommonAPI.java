package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

   WebDriver driver = null;

    @BeforeMethod
    public void openBrowser(){
        System.setProperty("webdriver.gecko.driver","/Users/joshuasmba/Documents/WebAutomationFramework/drivers/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void cleanUp(){
        driver.close();
    }

}
