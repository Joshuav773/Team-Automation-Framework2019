package eBayUtil;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class HomepageUtilities extends CommonAPI {

    @FindBy(xpath = "//span[contains (text(), 'Home')]")public static WebElement homeButton;
    @FindBy(xpath = "//a[contains(text(), 'Saved') and @href='/feed']")public static WebElement savedUtility;
    @FindBy(xpath = "//a[@_sp = 'p2481888.m1379.l3250' and contains (text(), 'Motors')]") public static WebElement motorsOption;
    @FindBy(xpath = "//a[contains (text(), 'Fashion') and @_sp = 'p2481888.m1380.l3250']")public static WebElement fashionUtility;
    @FindBy(xpath = "//a[contains(text(), 'Electronics') and @_sp='p2481888.m1381.l3250']")public static WebElement electronicsUtility;
    @FindBy(xpath = "//a[contains(text(), 'Collectibles & Art') and @_sp ='p2481888.m1382.l3250']")public static WebElement collectiblesAndArt;
    @FindBy(xpath = "//a[contains(text(), 'Home & Garden') and @_sp='p2481888.m1383.l3250']") public static WebElement homeAndGarden;
    @FindBy(xpath = "//a[contains(text(), 'Sporting Goods') and @_sp ='p2481888.m1384.l3250']") public static WebElement sportingGoodsUtility;
    @FindBy(xpath ="//a[contains(text(), 'Toys') and @_sp ='p2481888.m1385.l3250']") public static WebElement toysUtility;
    @FindBy(xpath = "//a[contains(text(), 'Business & Industrial') and @_sp ='p2481888.m1386.l3250']")
    public static WebElement businessAndIndustrialUtility;
    @FindBy(xpath = "//a[contains (text(), 'Music') and @_sp = 'p2481888.m1387.l3250']")public static WebElement musicUtility;
    @FindBy(xpath = "//a[contains (text(), 'Deals') and @_sp = 'p2481888.m1388.l3250']")public static WebElement dealsUtility;
    @FindBy(xpath = "//a[contains (text(), 'Under $10') and @_sp = 'p2481888.m1389.l3250']")public static WebElement under10Utility;
    @FindBy(css = "#sgnBt")public static WebElement signInButton;
    @FindBy(xpath = "//h1")public static WebElement motorsHeader;
    @FindBy(xpath = "//h1")public static WebElement fashionHeader;
    @FindBy(xpath = "//h1")public static WebElement electronicsHeader;
    @FindBy(xpath = "//h1")public static WebElement collectiblesAndArtHeader;
    @FindBy(xpath = "//h1")public static WebElement homeAndGardenHeader;
    @FindBy(xpath = "//h1")public static WebElement sportingGoodsHeader;
    @FindBy(xpath = "//h1")public static WebElement toysHeader;
    @FindBy(xpath = "//h1")public static WebElement businessAndIndustrialHeader;

    public void homeButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeButton.click();
    }
    //Must be signed in to access feed
    public void savedUtility(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        savedUtility.click();
        signInUserName("#userid", "joshuav773@gmail.com");
        signInPassWord("#pass", "Bball1773");
        signInButton.click();
    }
    public void motorsUtility(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motorsOption.click();
        String actual = motorsHeader.getText();
        String expected = "eBay Motors";
        Assert.assertEquals(actual, expected);
    }
    public void fashionutility(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        fashionUtility.click();
        String actual = fashionHeader.getText();
        String expected = "Fashion";
        Assert.assertEquals(actual, expected);
    }
    public void electronicsUtilitly(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        electronicsUtility.click();
        String actual = electronicsHeader.getText();
        String expected = "Electronics";
        Assert.assertEquals(actual, expected);
    }
    public void collectiblesandart(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        collectiblesAndArt.click();
        String actual = collectiblesAndArtHeader.getText();
        String expected = "Collectibles & Arts";

    }
    public void homeAndGarden(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeAndGarden.click();
        String actual = homeAndGardenHeader.getText();
        String expected = "Home & Garden";
        Assert.assertEquals(actual, expected);
    }
    public void sportingGoodsUtility(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sportingGoodsUtility.click();
        String actual = sportingGoodsHeader.getText();
        String expected = "Sporting Goods to Keep You Moving";
        Assert.assertEquals(actual, expected);
    }
    public void toysUtility(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        toysUtility.click();
        String actual = toysHeader.getText();
        String expected = "Toys & Hobbies";
        Assert.assertEquals(actual, expected);
    }
    public void businessAndIndustrialUtility(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        businessAndIndustrialUtility.click();
        String actual = businessAndIndustrialHeader.getText();
        String expected = "Business & Industrial";
        Assert.assertEquals(expected, actual);
    }
    public void musicUtility(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        musicUtility.click();
    }
    public void dealsUtility(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        dealsUtility.click();
    }
    public void under10Utility(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        under10Utility.click();
    }
}
