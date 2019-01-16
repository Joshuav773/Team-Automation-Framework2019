package eBaytests;

import base.CommonAPI;
import eBayUtil.Searches;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class SearchTests extends Searches {

    Searches searches;

    @BeforeMethod
    public void initElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searches = PageFactory.initElements(driver, Searches.class);
    }
    @Test
    public void usingSearchBarTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        usingSearchbar();
    }
    @Test
    public void searchbuttonTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchbutton();
    }
    @Test
    public void searchByUsingKeywordTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchByUsingKeyword();
    }
    @Test
    public void searchItemWithItemNumberTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchItemWithItemNumber();
    }
    @Test
    public void saveTheSearchOfSpecificItemTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        saveTheSearchOfSpecificItem();
    }
}
