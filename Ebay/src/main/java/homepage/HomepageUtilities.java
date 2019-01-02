package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomepageUtilities extends CommonAPI {

    @FindBy(css = "#gh-ac")
    public static WebElement searchBar;
    @FindBy(css = "#gh-btn")
    public static WebElement searchButton;
}
