package eBaytests;

import eBayUtil.AllCategoriesDropDown;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class AllCategoriesDropDownTest2 extends AllCategoriesDropDown{

     AllCategoriesDropDown allCategoriesDropDown;

    @BeforeMethod
    public void initElements(){
         allCategoriesDropDown = PageFactory.initElements(driver, AllCategoriesDropDown.class);
    }
    @Test
    public void coinsAndPaperMoneyTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectCoinsAndPaperMoneyFromDropDown();
    }
    @Test
    public void collectiblesTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectCollectiblesFromDropDown();
    }
    @Test
    public void computerTabletsAndNetworkingTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectComputerTabletsAndNetworkingFromDropDown();
    }
    @Test
    public void consumerElectronicsTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectConsumerElectronicsFromDropDown();
    }
    @Test
    public void cellPhonesAndAccesoriesTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectCellPhonesAndAccesoriesFromDropDown();
    }
    @Test
    public void craftsTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectCraftsFromDropDown();
    }
    @Test
    public void dollsAndBearsTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectDollsAndBearsFromDropDown();
    }
    @Test
    public void dvdsAndMoviesTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectDvdsAndMoviesFromDropDown();
    }
    @Test
    public void videoGamesAndConsolesTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectVideoGamesAndConsolesFromDropDown();
    }

}
