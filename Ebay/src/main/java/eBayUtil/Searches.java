package eBayUtil;

import base.CommonAPI;
import database.ConnectToMySqlDb;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class Searches extends CommonAPI {

    @FindBy(css = "#sgnBt")public static WebElement signInButton;
    @FindBy(css = "#gh-ac")public static WebElement searchBar;
    @FindBy(css = "#gh-btn")public static WebElement searchButton;
    @FindBy(css = "#gh-as-a")public static WebElement advancedSearchOption;
    @FindBy(xpath = "//a[contains(text(), 'By item number')]")public static WebElement byItemNumber;
    @FindBy(css = "#e1-2")public static WebElement itemNumberInputBox;
    @FindBy(css = "#_nkw")public static WebElement keyWordInputBox;
    @FindBy(xpath = "//a[@class = 'wnd-c']")public static WebElement xPopUp;
    @FindBy(xpath = "//div[@class = 'heartIcon']")public static WebElement saveThisSearchOption;
    @FindBy(id = "LIGHTWEIGHT_CREATION_DISMISS")public static WebElement closePopUp;

    public void usingSearchbar(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBar.sendKeys("car parts", Keys.ENTER);
    }
    public void searchbutton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchBar.sendKeys("Selenium books");
        searchButton.click();
    }
    public void searchByUsingKeyword(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        advancedSearchOption.click();
        keyWordInputBox.sendKeys("tools set");

    }
    //selenium book example
    public void searchItemWithItemNumber(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        advancedSearchOption.click();
        byItemNumber.click();
        itemNumberInputBox.sendKeys("123353444068");
    }
    //must be signed in
   public void saveTheSearchOfSpecificItem(){
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        advancedSearchOption.click();
        byItemNumber.click();
        itemNumberInputBox.sendKeys("123353444068", Keys.ENTER);
        saveThisSearchOption.click();
        signInUserName("#userid", "joshuav773@gmail.com");
        signInPassWord("#pass", "Bball1773");
        signInButton.click();
   }
   ConnectToMySqlDb connectToSqlDb = new ConnectToMySqlDb();
   public void searchFromDb() throws Exception{
       TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       List<String> list = new ArrayList<>();
       list.add("car parts");
       list.add("tool box");
       list.add("selemiun book");
       list.add("iphone xsMax");
       connectToSqlDb.insertDataFromArrayListToSqlTable(list, "Items Table", "Items Name");
       List<String> list1 = connectToSqlDb.readDataBase("Items Table", "Items Name");
       for(String items : list1){
           searchBar.sendKeys(items, Keys.ENTER);
           searchBar.clear();
       }
   }
}
