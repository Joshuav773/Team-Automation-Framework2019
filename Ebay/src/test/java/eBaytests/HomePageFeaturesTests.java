package eBaytests;

import base.CommonAPI;
import eBayUtil.HomePageFeatures;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomePageFeaturesTests extends HomePageFeatures {

    HomePageFeatures homePageFeatures;

    @BeforeMethod
    public void initElements(){
        homePageFeatures = PageFactory.initElements(driver, HomePageFeatures.class);
    }
    @Test
    public void seeAllDailyDealsTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeAllDailyDeals();
    }
    @Test
    public void trendingDealsArrowButtonsTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        trendingDealsArrowButtons();
    }
    @Test
    public void seeAllTrendsFeatureTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeAllTrends();
    }
    @Test
    public void seeAllFeaturedSalesAndEventsTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeAllFeaturedSalesAndEvents();
    }
    @Test
    public void seeAllEditorPicksTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeAllEditorPicks();
    }
}
