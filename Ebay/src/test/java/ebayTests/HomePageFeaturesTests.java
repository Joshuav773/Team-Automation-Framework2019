package ebayTests;

import ebayUtil.HomePageFeatures;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageFeaturesTests extends HomePageFeatures {

    HomePageFeatures homePageFeatures;

    @BeforeMethod
    public void initElements(){
        homePageFeatures = PageFactory.initElements(driver, HomePageFeatures.class);
    }
    @Test
    public void seeAllDailyDealsTest(){
        seeAllDailyDeals();
    }
    @Test
    public void trendingDealsArrowButtonsTest(){
        trendingDealsArrowButtons();
    }
    @Test
    public void seeAllTrendsFeatureTest(){
        seeAllTrends();
    }
    @Test
    public void seeAllFeaturedSalesAndEventsTest(){
        seeAllFeaturedSalesAndEvents();
    }
    @Test
    public void seeAllEditorPicksTest(){
        seeAllEditorPicks();
    }
}
