package eBayUtil;

import base.CommonAPI;
import database.ConnectToMySqlDb;
import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.Keys;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

import static eBayUtil.Searches.searchBar;

public class SearchFromDB extends CommonAPI {

    ConnectToMySqlDb connectToSqlDb = new ConnectToMySqlDb();
    public void searchFromDb() throws Exception{
        BasicConfigurator.configure();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> list = new ArrayList<>();
        list.add("car parts");
        list.add("tool box");
        list.add("selemiun book");
        list.add("iphone xsMax");
        connectToSqlDb.insertDataFromArrayListToSqlTable(list, "Items", "keywords");
        List<String> list1 = connectToSqlDb.readDataBase("Items", "keywords");
        for(String items : list1) {
            searchBar.sendKeys(items, Keys.ENTER);
            searchBar.clear();
        }
    }
}
