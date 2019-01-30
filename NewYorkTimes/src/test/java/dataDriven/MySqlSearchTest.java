package dataDriven;

import NewYorkTimesBrowse.SearchUsingDataBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class MySqlSearchTest extends SearchUsingDataBase{

    SearchUsingDataBase searchUsingDataBase;

    @BeforeMethod
    public void initialize(){
        searchUsingDataBase = PageFactory.initElements(driver, SearchUsingDataBase.class);
    }
    @Test
    public void searchUsingDBTest() throws Exception{
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchUsingDB();
    }
}
