package ebayTests;

import eBayUtil.Searches;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTests extends Searches{

    Searches searches;

    @BeforeMethod
    public void initElements(){
        searches = PageFactory.initElements(driver, Searches.class);
    }

    @Test
    public void usingSearchBarTest(){
        usingSearchbar();
    }
    @Test
    public void searchbuttonTest(){
        searchbutton();
    }
    @Test
    public void searchByUsingKeywordTest(){
        searchByUsingKeyword();
    }
    @Test
    public void searchItemWithItemNumberTest(){
        searchItemWithItemNumber();
    }
    @Test
    public void saveTheSearchOfSpecificItemTest(){
        saveTheSearchOfSpecificItem();
    }
    @Test
    public void searchFromDbTest() throws Exception {
        searchFromDb();
    }
}
