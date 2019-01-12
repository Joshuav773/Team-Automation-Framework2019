package ebayUtil;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ListItemForSale {

    @FindBy(xpath = "//a[@href='https://www.ebay.com/sl/sell']")public static WebElement sellOption;


    public void listItemForSale(){
        sellOption.click();

    }
}
