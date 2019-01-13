package ebayTests;

import eBayUtil.HomepageUtilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageUtilitiesTests2 extends HomepageUtilities {

    HomepageUtilities homepageUtilities;

    @BeforeMethod
    public void initElements(){
        homepageUtilities = PageFactory.initElements(driver, HomepageUtilities.class);
    }
    @Test
    public void homeAndGardenTest(){
        homeAndGarden();
    }
    @Test
    public void sportingGoodsTest(){
        sportingGoodsUtility();
    }
    @Test
    public void toysUtilityTest(){
        toysUtility();
    }
    @Test
    public void businessAndIndustrialUtilityTest(){
        businessAndIndustrialUtility();
    }
    @Test
    public void musicUtilityTest(){
        musicUtility();
    }
    @Test
    public void dealsUtilityTest(){
        dealsUtility();
    }
    @Test
    public void under10utilityTest(){
        under10Utility();
    }
}
