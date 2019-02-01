package NewYorkTimesBrowse;

import base.CommonAPI;
import database.ConnectToMySqlDb;
import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class SearchUsingDataBase extends CommonAPI {

    @FindBy(xpath = "//button[@data-test-id = 'search-button']")public static WebElement searchButton;
    @FindBy(xpath = "//input[@data-testid = 'search-input']")public static WebElement searchBar;
    ConnectToMySqlDb connectToSqlDb = new ConnectToMySqlDb();
    public void searchUsingDB() throws Exception{
        BasicConfigurator.configure();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("programming");
        list.add("macbook pro");
        list.add("samsung s9");
        connectToSqlDb.insertDataFromArrayListToSqlTable(list, "Items", "keywords");
        List<String> list1 = connectToSqlDb.readDataBase("Items", "keywords");
        for(String items : list1){
            searchButton.click();
            searchBar.sendKeys(items, Keys.ENTER);
            searchBar.clear();
        }
    }
}
