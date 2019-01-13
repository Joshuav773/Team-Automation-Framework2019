package eBayUtil;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class HomepageUtilities extends CommonAPI {

    @FindBy(xpath = "//span[contains (text(), 'Home')]")public static WebElement homeButton;
    @FindBy(xpath = "//a[contains(text(), 'Saved') and @href='/feed']")public static WebElement savedUtility;
    @FindBy(xpath = "//a[@href = 'https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334' and contains (text(), 'Motors')]")
    public static WebElement motorsOption;
    @FindBy(xpath = "//a[contains (text(), 'Fashion') and @_sp = 'p2481888.m1380.l3250']")public static WebElement fashionUtility;
    @FindBy(xpath = "//a[contains(text(), 'Electronics') and @_sp='p2481888.m1381.l3250']")public static WebElement electronicsUtility;
    @FindBy(xpath = "//a[contains(text(), 'Collectibles & Art') and @href = 'https://www.ebay.com/b/Collectibles-Art/bn_7000259855']")
    public static WebElement collectiblesAndArt;
    @FindBy(xpath = "//a[contains(text(), 'Home & Garden') and @_sp='p2481888.m1383.l3250']")
    public static WebElement homeAndGarden;
    @FindBy(xpath = "//a[contains(text(), 'Sporting Goods') and @href ='https://www.ebay.com/b/Sporting-Goods/888/bn_1865031' ]")
    public static WebElement sportingGoodsUtility;
    @FindBy(xpath ="//a[contains(text(), 'Toys') and @href ='https://www.ebay.com/b/Toys-Hobbies/220/bn_1865497' ]")
    public static WebElement toysUtility;
    @FindBy(xpath = "//a[contains(text(), 'Business & Industrial') and @href ='https://www.ebay.com/b/Business-Industrial/12576/bn_1853744' ]")
    public static WebElement businessAndIndustrialUtility;
    @FindBy(xpath = "//a[contains (text(), 'Music') and @_sp = 'p2481888.m1387.l3250']")public static WebElement musicUtility;
    @FindBy(xpath = "//a[contains (text(), 'Deals') and @_sp = 'p2481888.m1388.l3250']")public static WebElement dealsUtility;
    @FindBy(xpath = "//a[contains (text(), 'Under $10') and @_sp = 'p2481888.m1389.l3250']")public static WebElement under10Utility;
    @FindBy(css = "#sgnBt")public static WebElement signInButton;

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
    }
    public void fashionutility(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        fashionUtility.click();
    }
    public void electronicsUtilitly(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        electronicsUtility.click();
    }
    public void collectiblesandart(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        collectiblesAndArt.click();
    }
    public void homeAndGarden(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeAndGarden.click();
    }
    public void sportingGoodsUtility(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sportingGoodsUtility.click();
    }
    public void toysUtility(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        toysUtility.click();
    }
    public void businessAndIndustrialUtility(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        businessAndIndustrialUtility.click();
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
