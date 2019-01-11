package ebayUtil;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AllCategoriesDropDown extends CommonAPI {

    @FindBy(css = "#gh-cat")public static WebElement allCategoriesDropDown;


    public void selectAntiquesFromDropDown(){
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Antiques");

    }
    public void selectArtFromDropDwon(){
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Art");
    }
    public void selectBabyFromDropdown(){
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Baby");
    }
    public void

}
