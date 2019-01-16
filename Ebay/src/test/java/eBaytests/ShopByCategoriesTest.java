package eBaytests;

import base.CommonAPI;
import eBayUtil.ShopByCategoriesDropDown;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class ShopByCategoriesTest extends ShopByCategoriesDropDown {

    ShopByCategoriesDropDown shopByCategoriesDropDown;

    @BeforeMethod
    public void initElements(){
        shopByCategoriesDropDown = PageFactory.initElements(driver, ShopByCategoriesDropDown.class);
    }
    @Test
    public void selectCollectiblesAndArtFromDropDownTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectCollectiblesAndArtFromDropDown();
    }
    @Test
    public void selectElectronicsFromDropDownTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectElectronicsFromDropDrown();
    }
    @Test
    public void selectEntertainmentMemorabiliaFromDropDownTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectEntertainmentMemorabiliaFromDropDown();
    }
    @Test
    public void selectFashionFromDropDownTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectFashionFromDropDown();
    }
    @Test
    public void selectHomeAndGardenFromDropDownTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectHomeAndGardenFromDropDown();
    }
    @Test
    public void selectMotorsFromDropDownTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectMotorsFromDropDown();
    }
    @Test
    public void selectSportingGoodsFromDropDownTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectSportingGoodsFromDropDown();
    }
    @Test
    public void selectToysAndHobbiesFromDropDownTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectToysAndHobbiesFromDropDown();
    }
    @Test
    public void selectOtherCategoriesFromDropDownTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectOtherCategoriesFromDropDown();
    }
}
