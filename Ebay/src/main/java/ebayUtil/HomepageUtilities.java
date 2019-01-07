package ebayUtil;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.cert.X509Certificate;

public class HomepageUtilities extends CommonAPI {

    @FindBy(css = "#gh-ac") public static WebElement searchBar;
    @FindBy(css = "#gh-btn") public static WebElement searchButton;
    @FindBy(xpath = "//span[contains (text(), 'Home')]")public static WebElement homeButton;
    @FindBy(xpath = "//a[contains(text(), 'Saved') and @href='/feed']")public static WebElement savedUtility;
    @FindBy(xpath = "//a[@href = 'https://www.ebay.com/b/Auto-Parts-and-Vehicles/6000/bn_1865334' and contains (text(), 'Motors')]")
    public static WebElement motorsOption;
    @FindBy(xpath = "//a[contains (text(), 'Fashion') and @_sp = 'p2481888.m1380.l3250']")public static WebElement fashionUtility;
    @FindBy(xpath = "//a[contains(text(), 'Electronics') and @_sp='p2481888.m1381.l3250']")public static WebElement electronicsUtility;
    @FindBy(xpath = "//a[contains(text(), 'Collectibles & Art') and @href = 'https://www.ebay.com/b/Collectibles-Art/bn_7000259855']")
    public static WebElement collectiblesAndArt;
    @FindBy(xpath = "")
    public static WebElement homeAndGarden;

    public void usingSearchbar(){
        searchBar.sendKeys("Car Parts");
        searchButton.click();
    }
    public void searchbutton(){
        searchButton.click();
    }
    public void homeButton(){
        homeButton.click();
    }
    //Must be signed in to access feed
    public void savedUtility(){
        savedUtility.click();
    }
    public void motorsUtility(){
        motorsOption.click();
    }
    public void fashionutility(){
        fashionUtility.click();
    }
    public void electronicsUtilitly(){
        electronicsUtility.click();
    }
    public void collectiblesandart(){
        collectiblesAndArt.click();
    }
    public void homeAndGarden(){

    }




}
