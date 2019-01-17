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
    public void selectCoinsAndPaperMoneyTest(){
         TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
         selectCoinsAndPaperMoney();
    }
    @Test
    public void selectCollectiblesTest(){
         TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
         selectCollectibles();
    }
    @Test
    public void selectComputerTabletsAndNetworkingTest(){
         TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
         selectComputerTabletsAndNetworking();
    }
    @Test
    public void selectConsumerElectronicsTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectConsumerElectronics();
    }
}
