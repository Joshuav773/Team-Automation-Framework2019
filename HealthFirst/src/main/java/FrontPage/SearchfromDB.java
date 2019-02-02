package FrontPage;

import base.CommonAPI;
import database.ConnectToMySqlDb;
import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class SearchfromDB extends CommonAPI {

    @FindBy(xpath = "//input[@aria-label = 'Type search word …']")public static WebElement searchBar;
    ConnectToMySqlDb connectToSqlDb = new ConnectToMySqlDb();
        public void searchFromDb() throws Exception{
            BasicConfigurator.configure();
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            List<String> list = new ArrayList<>();
            list.add("Health Care");
            list.add("Insurance");
            list.add("Provider");
            list.add("State");
            connectToSqlDb.insertDataFromArrayListToSqlTable(list, "Items", "keywords");
            List<String> list1 = connectToSqlDb.readDataBase("Items", "keywords");
            for(String items : list1) {
                searchBar.sendKeys(items, Keys.ENTER);
                searchBar.clear();
            }
        }
}
