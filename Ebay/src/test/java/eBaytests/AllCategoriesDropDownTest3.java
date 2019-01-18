package eBaytests;

import eBayUtil.AllCategoriesDropDown;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class AllCategoriesDropDownTest3 extends AllCategoriesDropDown {

    AllCategoriesDropDown allCategoriesDropDown;

    @BeforeMethod
    public void initElements(){
        allCategoriesDropDown = PageFactory.initElements(driver, AllCategoriesDropDown.class);
    }
    @Test
    public void eBayMotorsTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectEbayMotorsFromDropDown();
    }
    @Test
    public void entertainmentMemorabiliaTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectEntertainmentMemorabiliaFromDropDown();
    }
    @Test
    public void giftCardsAndcouponsTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectGiftCardsAndCouponsFromDropDown();
    }
    @Test

}
