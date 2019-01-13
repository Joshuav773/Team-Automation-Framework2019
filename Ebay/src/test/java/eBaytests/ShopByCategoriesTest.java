package eBaytests;

import eBayUtil.ShopByCategoriesDropDown;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShopByCategoriesTest extends ShopByCategoriesDropDown {

    ShopByCategoriesDropDown shopByCategoriesDropDown;

    @BeforeMethod
    public void initElements(){
        shopByCategoriesDropDown = PageFactory.initElements(driver, ShopByCategoriesDropDown.class);
    }
    @Test
    public void selectCollectiblesAndArtFromDropDownTest(){
        selectCollectiblesAndArtFromDropDown();
    }
    @Test
    public void selectElectronicsFromDropDownTest(){
        selectElectronicsFromDropDrown();
    }
    @Test
    public void selectEntertainmentMemorabiliaFromDropDownTest(){
        selectEntertainmentMemorabiliaFromDropDown();
    }
    @Test
    public void selectFashionFromDropDownTest(){
        selectFashionFromDropDown();
    }
    @Test
    public void selectHomeAndGardenFromDropDownTest(){
        selectHomeAndGardenFromDropDown();
    }
    @Test
    public void selectMotorsFromDropDownTest(){
        selectMotorsFromDropDown();
    }
    @Test
    public void selectSportingGoodsFromDropDownTest(){
        selectSportingGoodsFromDropDown();
    }
    @Test
    public void selectToysAndHobbiesFromDropDownTest(){
        selectToysAndHobbiesFromDropDown();
    }
    @Test
    public void selectOtherCategoriesFromDropDownTest(){
        selectOtherCategoriesFromDropDown();
    }
}
