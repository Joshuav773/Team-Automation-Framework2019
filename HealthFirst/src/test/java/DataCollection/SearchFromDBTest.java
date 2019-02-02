package DataCollection;

import FrontPage.SearchfromDB;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class SearchFromDBTest extends SearchfromDB {

    SearchfromDB searches;

    @BeforeMethod
    public void initElements(){
        searches = PageFactory.initElements(driver, SearchfromDB.class);
    }
    @Test
    public void searchFromDbTest() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){
        }.getClass().getEnclosingMethod().getName()));
        searchFromDb();
    }
}
