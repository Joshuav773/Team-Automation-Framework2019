package ebayUtil;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
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




    public void selectCollectiblesAndArtFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopByCategoriesOption.click();
        collectiblesAndArt.click();
    }
    public void selectElectronicsFromDropDrown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopByCategoriesOption.click();
        electronics.click();
    }
    public void selectEntertainmentMemorabiliaFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopByCategoriesOption.click();
        entertainmentMemorabilia.click();
    }
    public void selectFashionFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopByCategoriesOption.click();
        fashion.click();
    }
    public void selectHomeAndGardenFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopByCategoriesOption.click();
        homeAndGarden.click();
    }
    public void selectMotorsFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopByCategoriesOption.click();
        motors.click();
    }
    public void selectSportingGoodsFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopByCategoriesOption.click();
        sportingGoods.click();
    }
    public void selectToysAndHobbiesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopByCategoriesOption.click();
        toysAndHobbies.click();
    }
    public void selectOtherCategoriesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopByCategoriesOption.click();
        otherCategories.click();
    }
}
