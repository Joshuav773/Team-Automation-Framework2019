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

    }
    @AfterMethod
    public void cleanUp(){
        driver.close();
    }
    public void quit(){
        driver.quit();
    }
    public void navigateBack(){
        driver.navigate().back();
    }
    public void typeOnsearchBar(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }
    public void typeAndEnter(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value, Keys.ENTER);
    }
    public void clickOnSearchButton(String locator){
        driver.findElement(By.cssSelector(locator)).click();
    }
    public void searchByClickOnSearchButton(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
        clickOnSearchButton(locator);
    }

}
