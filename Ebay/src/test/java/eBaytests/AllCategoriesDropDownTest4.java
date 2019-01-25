package eBaytests;

import eBayUtil.AllCategoriesDropDown;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class AllCategoriesDropDownTest4 extends AllCategoriesDropDown {

    AllCategoriesDropDown allCategoriesDropDown;

    @BeforeMethod
    public void initElements(){
        allCategoriesDropDown = PageFactory.initElements(driver, AllCategoriesDropDown.class);
    }
    @Test
    public void potteryAndGlassTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectPotteryAndGlassFromDropDown();
    }
    @Test
    public void realEtateTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectRealEstateFromDropDown();
    }
    @Test
    public void specialtyServicesTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectSpecialtyServicesFromDropDown();
    }
    @Test
    public void sportingGoodsTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectSportingGoodsFromDropDown();
    }
    @Test
    public void sportsMemCardsAndFanShop(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectSportsMemCardsAndFanShopFromDropDown();
    }
    @Test
    public void stampsTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectStampsFromDropDown();
    }
    @Test
    public void ticketsAndExperiencesTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectTicketsAndExperiencesFromDropDown();
    }
    @Test
    public void toysAndHobbiesTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectToysAndHobbiesfromDropDown();
    }
    @Test
    public void travelTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectTravelFromDropDown();
    }
}
