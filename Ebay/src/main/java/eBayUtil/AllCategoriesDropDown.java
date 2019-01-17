package eBayUtil;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import reporting.TestLogger;

public class AllCategoriesDropDown extends CommonAPI {

    @FindBy(css = "#gh-cat")public static WebElement allCategoriesDropDown;
    @FindBy(css = "#gh-btn")public static WebElement searchButton;
    @FindBy(xpath = "//h1")public static WebElement header;

    public void selectAntiquesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Antiques");
        searchButton.click();
    }
    public void selectArtFromDropDwon(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Art");
        searchButton.click();
    }
    public void selectBabyFromDropdown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Baby");
        searchButton.click();
    }
    public void selectBooksFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Books");
        searchButton.click();
    }
    public void selectBusinessAndIndusrialFromDropDrown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Business & Industrial");
        searchButton.click();
    }
    public void selectCamerasAndFotoFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Cameras & Photo");
        searchButton.click();
    }
    public void selectCellPhonesAndAccesories(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Cell Phones & Accessories");
        searchButton.click();
    }
    public void selectClothingShoesAndAccesories(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Clothing, Shoes & Accessories");
        searchButton.click();
    }
    public void selectCoinsAndPaperMoney(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Coins & Paper Money");
        searchButton.click();
    }
    public void selectCollectibles(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Collectibles");
        searchButton.click();
    }
    public void selectComputerTabletsAndNetworking(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Computers/Tablets & Networking");
    }
    public void selectConsumerElectronics(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Consumer Electronics");
    }
}
