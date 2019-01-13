package ebayUtil;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import reporting.TestLogger;

public class HomePageFeatures extends CommonAPI {

    @FindBy(xpath = "//a[contains (text(), 'See All') and @aria-label='See All Deals']")
    public static WebElement seeAllDailyDeals;
    @FindBy(xpath = "//button[@aria-label = 'Trending Deals - Move Next']")public static WebElement trendingDealsMoveNext;
    @FindBy(xpath = "//button[@aria-label = 'Trending Deals - Move Previous']")
    public static WebElement trendingDealsMovePrevious;
    @FindBy(xpath = "//a[contains(text(), 'See All Trends')]") public static WebElement seeAllTrends;
    @FindBy(xpath = "//a[starts-with (@href, 'http://www.ebay.com/rpp/sale-events?')]")
    public static WebElement seeAllFeaturedSalesAndEvents;
    @FindBy(xpath = "//a[starts-with (@href, 'http://www.ebay.com/rpp/editorspicks?')]")
    public static WebElement seeAllEditorsPicks;
    @FindBy(xpath = "//h2[contains (text(),'Shop Fashion Events')]")
    public static WebElement featuresSalesHeader;



    public void seeAllDailyDeals(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeAllDailyDeals.click();
    }
    public void trendingDealsArrowButtons(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       seeAllDailyDeals.click();
       trendingDealsMoveNext.click();
       trendingDealsMovePrevious.click();
    }
    public void seeAllTrends(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeAllTrends.click();
    }
    public void seeAllFeaturedSalesAndEvents(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeAllFeaturedSalesAndEvents.click();
        String Actual = featuresSalesHeader.getText();
        String Expected = "Shop Fashion Events";
        Assert.assertEquals(Actual,Expected);
    }
    public void seeAllEditorPicks(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        seeAllEditorsPicks.click();
    }

}
