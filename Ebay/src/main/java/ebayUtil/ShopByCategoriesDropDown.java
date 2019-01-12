package ebayUtil;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
        shopByCategoriesOption.click();
        collectiblesAndArt.click();
    }
    public void selectElectronicsFromDropDrown(){
        shopByCategoriesOption.click();
        electronics.click();
    }
    public void selectEntertainmentMemorabiliaFromDropDown(){
        shopByCategoriesOption.click();
        entertainmentMemorabilia.click();
    }
    public void selectFashionFromDropDown(){
        shopByCategoriesOption.click();
        fashion.click();
    }
    public void selectHomeAndGardenFromDropDown(){
        shopByCategoriesOption.click();
        homeAndGarden.click();
    }
    public void selectMotorsFromDropDown(){
        shopByCategoriesOption.click();
        motors.click();
    }
    public void selectSportingGoodsFromDropDown(){
        shopByCategoriesOption.click();
        sportingGoods.click();
    }
    public void selecttoysAndHobbiesFromDropDown(){
        shopByCategoriesOption.click();
        toysAndHobbies.click();
    }
    public void selectOtherCategoriesFromDropDown(){
        shopByCategoriesOption.click();
        otherCategories.click();
    }
}
