package ebayUtil;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
        searchBar.sendKeys("car parts", Keys.ENTER);
    }
    public void searchbutton(){
        searchBar.sendKeys("Selenium books");
        searchButton.click();
    }
    public void searchByUsingKeyword(){
        advancedSearchOption.click();
        keyWordInputBox.sendKeys("tools set");

    }
    public void searchItemWithItemNumber(){
        //selenium book example
        advancedSearchOption.click();
        byItemNumber.click();
        itemNumberInputBox.sendKeys("123353444068");
    }
    //must be signed in
   public void saveTheSearchOfSpecificItem(){
        advancedSearchOption.click();
        byItemNumber.click();
        itemNumberInputBox.sendKeys("123353444068", Keys.ENTER);
        saveThisSearchOption.click();
        signInUserName("#userid", "joshuav773@gmail.com");
        signInPassWord("#pass", "Bball1773");
        signInButton.click();
    }

}
