package datadriven;

import eBayUtil.SearchFromDB;
import eBayUtil.Searches;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataBaseTest extends SearchFromDB {

    Searches searches;

    @BeforeMethod
    public void initElements(){
       searches = PageFactory.initElements(driver, Searches.class);
    }
    @Test
    public void searchFromDbTest() throws Exception {
        searchFromDb();
    }
}

