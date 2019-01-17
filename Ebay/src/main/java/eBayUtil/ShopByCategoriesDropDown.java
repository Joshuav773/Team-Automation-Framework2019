package eBayUtil;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class ShopByCategoriesDropDown extends CommonAPI {

    @FindBy(css = "#gh-shop-a")public static WebElement shopByCategoriesOption;
    @FindBy(xpath = "//a[@_sp = 'm570.l3410']")public static WebElement collectiblesAndArt;
    @FindBy(xpath = "//a[@_sp = 'm570.l3413']")public static WebElement electronics;
    @FindBy(xpath = "//a[@_sp = 'm570.l3649']")public static WebElement entertainmentMemorabilia;
    @FindBy(xpath = "//a[@_sp = 'm570.l3409']")public static WebElement fashion;
    @FindBy(xpath = "//a[@_sp = 'm570.l3412']")public static WebElement homeAndGarden;
    @FindBy(xpath = "//a[@_sp = 'm570.l3411']")public static WebElement motors;
    @FindBy(xpath = "//a[@_sp = 'm570.l3414']")public static WebElement sportingGoods;
    @FindBy(xpath = "//a[@_sp = 'm570.l3645']")public static WebElement toysAndHobbies;
    @FindBy(xpath = "//a[@_sp = 'm570.l3416']")public static WebElement otherCategories;
    @FindBy(xpath = "//h1")public static WebElement header;

    public void selectCollectiblesAndArtFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopByCategoriesOption.click();
        collectiblesAndArt.click();
        String actual = header.getText();
        String expected = "Collectibles & Art";
        Assert.assertEquals(actual, expected);
    }
    public void selectElectronicsFromDropDrown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopByCategoriesOption.click();
        electronics.click();
        String actual = header.getText();
        String expected = "Electronics";
        Assert.assertEquals(actual, expected);
    }
    public void selectEntertainmentMemorabiliaFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopByCategoriesOption.click();
        entertainmentMemorabilia.click();
        String actual = header.getText();
        String expected = "Entertainment Memorabilia";
        Assert.assertEquals(expected, actual);
    }
    public void selectFashionFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopByCategoriesOption.click();
        fashion.click();
        String actual = header.getText();
        String expected = "Fashion";
        Assert.assertEquals(actual, expected);
    }
    public void selectHomeAndGardenFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopByCategoriesOption.click();
        homeAndGarden.click();
        String actual = header.getText();
        String expected = "Home & Garden";
        Assert.assertEquals(actual, expected);
    }
    public void selectMotorsFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopByCategoriesOption.click();
        motors.click();
        String actual = header.getText();
        String expected = "eBay Motors";
        Assert.assertEquals(actual, expected);
    }
    public void selectSportingGoodsFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopByCategoriesOption.click();
        sportingGoods.click();
        String actual = header.getText();
        String expected = "Sporting Goods to Keep You Moving";
        Assert.assertEquals(actual, expected);
    }
    public void selectToysAndHobbiesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopByCategoriesOption.click();
        toysAndHobbies.click();
        String actual = header.getText();
        String expected = "Toys & Hobbies";
        Assert.assertEquals(actual, expected);
    }
    public void selectOtherCategoriesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopByCategoriesOption.click();
        otherCategories.click();
        String actual = header.getText();
        String expected = "All Categories";
        Assert.assertEquals(actual, expected);
    }
}
