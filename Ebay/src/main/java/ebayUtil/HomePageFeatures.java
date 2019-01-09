package ebayUtil;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageFeatures extends CommonAPI {

    @FindBy(xpath = "//a[contains (text(), 'See All') and @aria-label='See All Deals']")
    public static WebElement seeAllDailyDeals;




    public void seeAllDailyDeals(){
        seeAllDailyDeals.click();
    }
}
