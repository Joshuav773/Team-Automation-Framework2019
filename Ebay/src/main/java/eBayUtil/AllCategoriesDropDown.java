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
    }
    public void selectConsumerElectronicsFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Consumer Electronics");
    }
    public void selectCraftsFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Crafts");
    }
    public void selectDollsAndBearsFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Dolls & Bears");
    }
    public void selectDvdsAndMoviesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("DVDs & Movies");
    }
    public void selectEbayMotorsFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("eBay Motors");
    }
    public void selectEntertainmentMemorabiliaFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Entertainment Memorabilia");
    }
    public void selectGiftCardsAndCouponsFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Gift Cards & Coupons");
    }
    public void selectHealthAndBeautyFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Health & Beauty");
    }
    public void selectHomeAndGardenFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Home & Garden");
    }
    public void selectJewelryAndWatchesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Jewelry & Watches");
    }
    public void selectMusicFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Music");
    }
    public void selecMusicalInstrumentsAndGearFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Musical Instruments & Gear");
    }
    public void selectPetSuppliesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Pet supplies");
    }
    public void selectPotteryAndGlassFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Pottery & Glass");
    }
    public void selectRealstateFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Real State");
    }
    public void selectSpecialtyServicesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Specialty Services");
    }
    public void selectSportingGoodsFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Sporting Goods");
    }
    public void selectSportsMemCardsAndFanShopFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Sports Mem, Cards & Fan Shop");
    }
    public void selectStampsFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Stamps");
    }
    public void selectTicketsAndExperiencesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText(" Tickets & Experiences");
    }
    public void selectToysAndHobbiesfromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Toys & Hobbies");
    }
    public void selectTravelFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Travel");
    }
    public  void selectVideoGamesAndConsolesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Video Games & Consoles");
    }
    public void selectEverythingElseFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Everything Else");
    }
}
