package ebayUtil;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListItemForSale extends CommonAPI {

    @FindBy(xpath = "//a[@href='https://www.ebay.com/sl/sell']")public static WebElement sellOption;
    @FindBy(css = "#smac_complete")public static WebElement inputBox;
    @FindBy(xpath = "//em[contains (text(), 'Clothing, Shoes & Accessories > Men')]")
    public static WebElement mensAthleticShoes;


    public void listItemForSale(){
        sellOption.click();
        inputBox.sendKeys("shoes", Keys.ENTER);
        mensAthleticShoes.click();
    }
}
