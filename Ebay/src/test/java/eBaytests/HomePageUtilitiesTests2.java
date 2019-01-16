package eBaytests;

import base.CommonAPI;
import eBayUtil.HomepageUtilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomePageUtilitiesTests2 extends HomepageUtilities {

    HomepageUtilities homepageUtilities;

    @BeforeMethod
    public void initElements(){
        homepageUtilities = PageFactory.initElements(driver, HomepageUtilities.class);
    }
    @Test
    public void homeAndGardenTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeAndGarden();
    }
    @Test
    public void sportingGoodsTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sportingGoodsUtility();
    }
    @Test
    public void toysUtilityTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        toysUtility();
    }
    @Test
    public void businessAndIndustrialUtilityTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        businessAndIndustrialUtility();
    }
    @Test
    public void musicUtilityTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        musicUtility();
    }
    @Test
    public void dealsUtilityTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        dealsUtility();
    }
    @Test
    public void under10utilityTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        under10Utility();
    }
}
