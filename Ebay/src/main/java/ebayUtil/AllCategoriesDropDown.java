package ebayUtil;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AllCategoriesDropDown extends CommonAPI {

    @FindBy(css = "#gh-cat")public static WebElement allCategoriesDropDown;
    @FindBy(css = "#gh-btn")public static WebElement searchButton;

    public void selectAntiquesFromDropDown(){
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Antiques");
        searchButton.click();

    }
    public void selectArtFromDropDwon(){
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Art");
        searchButton.click();
    }
    public void selectBabyFromDropdown(){
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Baby");
        searchButton.click();
    }
    public void selectBooksFromDropDown(){
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Books");
        searchButton.click();
    }
    public void selectBusinessAndIndusrialFromDropDrown(){
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Business & Industrial");
        searchButton.click();
    }
    public void selectCamerasAndFotoFromDropDown(){
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Cameras & Photo");
        searchButton.click();
    }
    public void selectCellPhonesAndAccesories(){
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Cell Phones & Accessories");
        searchButton.click();
    }
    public void selectClothingShoesAndAccesories(){
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Clothing, Shoes & Accessories");
        searchButton.click();
    }

}
