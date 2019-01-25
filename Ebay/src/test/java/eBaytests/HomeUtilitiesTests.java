package eBaytests;

import base.CommonAPI;
import eBayUtil.HomepageUtilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomeUtilitiesTests extends HomepageUtilities {

    HomepageUtilities homepageUtilities;

    @BeforeMethod
    public void initelEments(){
        homepageUtilities = PageFactory.initElements(driver, HomepageUtilities.class);
    }
    @Test
    public void homeButtonTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeButton();
    }
    //Must be signed in
    @Test
    public void savedUtilityTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        savedUtility();
    }
    @Test
    public void motorsUtilTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        motorsUtility();
    }
    @Test
    public void fashionUtilityTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        fashionutility();
    }
    @Test
    public void electronicsUtilityTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        electronicsUtilitly();
    }
    @Test
    public void collectiblesAndArtTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        collectiblesAndArt();
    }
}
