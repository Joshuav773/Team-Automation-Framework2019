package datadriven;

import base.CommonAPI;
import eBayUtil.SearchFromDB;
import eBayUtil.Searches;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class DataBaseTest extends SearchFromDB {

    Searches searches;

    @BeforeMethod
    public void initElements(){
       searches = PageFactory.initElements(driver, Searches.class);
    }
    @Test
    public void searchFromDbTest() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){
        }.getClass().getEnclosingMethod().getName()));
        searchFromDb();
    }
}

