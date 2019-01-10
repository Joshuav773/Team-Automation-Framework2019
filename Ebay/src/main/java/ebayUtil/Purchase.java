package ebayUtil;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Purchase extends CommonAPI {
    @FindBy(css = "#gh-ac") public static WebElement searchBar;
    @FindBy(css = "#gh-btn") public static WebElement searchButton;
    @FindBy(css = "#gh-as-a")public static WebElement advancedSearchOption;
    @FindBy(xpath = "//a[contains(text(), 'By item number')]")public static WebElement byItemNumber;
    @FindBy(css = "#e1-2")public static WebElement itemNumberInputBox;
    @FindBy(xpath = "//*[@id=\"srp-river-results-listing1\"]/div/div[2]/a/h3")public static WebElement item;
    @FindBy(css = "#binBtn_btn")public static WebElement buyItNow;

    @FindBy(css = "#sbin-gxo-btn")public static WebElement continueAsGuest;
    @FindBy(css = "#firstName")public static WebElement shipToFirstName;
    @FindBy(css = "#lastName")public static WebElement shipToLastName;
    @FindBy(css = "#addressLine1")public static WebElement shipToAddress;
    @FindBy(css = "#email")public static WebElement shipToEmail;
    @FindBy(css = "#emailConfirm")public static WebElement shipToConfirmEmail;
    @FindBy(css = "#phoneNumber")public static WebElement shipToPhoneNumber;
    @FindBy(xpath = "//button[@data-test-id = 'ADD_ADDRESS_SUBMIT']")public static WebElement shipToDoneButton;




    public void addItemToCart(){
        advancedSearchOption.click();
        byItemNumber.click();
        itemNumberInputBox.sendKeys("153227833175");
        item.click();


    }
    public void purchaseAnItem() throws InterruptedException {
        searchBar.sendKeys("Keychains");
        searchButton.click();
        item.click();
        buyItNow.click();
        continueAsGuest.click();
        shipToFirstName.sendKeys("joshua");
        shipToLastName.sendKeys("vargas");
        shipToAddress.sendKeys("2150 sw 36th ave");
        shipToEmail.sendKeys("joshuav773@gmail.com");
        shipToConfirmEmail.sendKeys("joshuav773@gmail.com");
        shipToPhoneNumber.sendKeys("7872231716");
        shipToDoneButton.click();



    }

}
