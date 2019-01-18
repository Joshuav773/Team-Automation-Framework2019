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
    public void selectCellPhonesAndAccesoriesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Cell Phones & Accessories");
        searchButton.click();
    }
    public void selectClothingShoesAndAccesoriesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Clothing, Shoes & Accessories");
        searchButton.click();
    }
    public void selectCoinsAndPaperMoneyFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Coins & Paper Money");
        searchButton.click();
    }
    public void selectCollectiblesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Collectibles");
        searchButton.click();
    }
    public void selectComputerTabletsAndNetworkingFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Computers/Tablets & Networking");
        searchButton.click();
    }
    public void selectConsumerElectronicsFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Consumer Electronics");
        searchButton.click();
    }
    public void selectCraftsFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Crafts");
        searchButton.click();
    }
    public void selectDollsAndBearsFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Dolls & Bears");
        searchButton.click();
    }
    public void selectDvdsAndMoviesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("DVDs & Movies");
        searchButton.click();
    }
    public void selectEbayMotorsFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("eBay Motors");
        searchButton.click();
    }
    public void selectEntertainmentMemorabiliaFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Entertainment Memorabilia");
        searchButton.click();
    }
    public void selectGiftCardsAndCouponsFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Gift Cards & Coupons");
        searchButton.click();
    }
    public void selectHealthAndBeautyFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Health & Beauty");
        searchButton.click();
    }
    public void selectHomeAndGardenFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Home & Garden");
        searchButton.click();
    }
    public void selectJewelryAndWatchesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Jewelry & Watches");
        searchButton.click();
    }
    public void selectMusicFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Music");
        searchButton.click();
    }
    public void selecMusicalInstrumentsAndGearFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Musical Instruments & Gear");
        searchButton.click();
    }
    public void selectPetSuppliesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Pet supplies");
        searchButton.click();
    }
    public void selectPotteryAndGlassFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Pottery & Glass");
        searchButton.click();
    }
    public void selectRealstateFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Real State");
        searchButton.click();
    }
    public void selectSpecialtyServicesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Specialty Services");
        searchButton.click();
    }
    public void selectSportingGoodsFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Sporting Goods");
        searchButton.click();
    }
    public void selectSportsMemCardsAndFanShopFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Sports Mem, Cards & Fan Shop");
        searchButton.click();
    }
    public void selectStampsFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Stamps");
        searchButton.click();
    }
    public void selectTicketsAndExperiencesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText(" Tickets & Experiences");
        searchButton.click();
    }
    public void selectToysAndHobbiesfromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Toys & Hobbies");
        searchButton.click();
    }
    public void selectTravelFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Travel");
        searchButton.click();
    }
    public  void selectVideoGamesAndConsolesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Video Games & Consoles");
        searchButton.click();
    }
    public void selectEverythingElseFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Everything Else");
        searchButton.click();
    }
}
