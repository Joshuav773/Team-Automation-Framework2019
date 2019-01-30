package eBayUtil;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
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
        String actual = header.getText();
        String expected = "Antiques";
        Assert.assertEquals(actual, expected);
    }
    public void selectArtFromDropDwon(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Art");
        searchButton.click();
        String actual = header.getText();
        String expected = "Art";
        Assert.assertEquals(actual, expected);
    }
    public void selectBabyFromDropdown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Baby");
        searchButton.click();
        String actual = header.getText();
        String expected = "Baby Essentials";
        Assert.assertEquals(actual, expected);
    }
    public void selectBooksFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Books");
        searchButton.click();
        String actual = header.getText();
        String expected = "Books";
        Assert.assertEquals(actual, expected);
    }
    public void selectBusinessAndIndusrialFromDropDrown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Business & Industrial");
        searchButton.click();
        String actual = header.getText();
        String expected = "Business & Industrial";
        Assert.assertEquals(actual, expected);
    }
    public void selectCamerasAndFotoFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Cameras & Photo");
        searchButton.click();
        String actual = header.getText();
        String expected = "Cameras & Photo";
        Assert.assertEquals(actual, expected);
    }
    public void selectCellPhonesAndAccesoriesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Cell Phones & Accessories");
        searchButton.click();
        String actual = header.getText();
        String expected = "Cell Phones, Smart Watches & Accessories";
        Assert.assertEquals(actual, expected);
    }
    public void selectClothingShoesAndAccesoriesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Clothing, Shoes & Accessories");
        searchButton.click();
        String actual = header.getText();
        String expected = "Clothing, Shoes & Accessories";
        Assert.assertEquals(actual, expected);
    }
    public void selectCoinsAndPaperMoneyFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Coins & Paper Money");
        searchButton.click();
        String actual = header.getText();
        String expected = "Coins & Paper Money";
        Assert.assertEquals(actual, expected);
    }
    public void selectCollectiblesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Collectibles");
        searchButton.click();
        String actual = header.getText();
        String expected = "Collectibles";
        Assert.assertEquals(actual, expected);
    }
    public void selectComputerTabletsAndNetworkingFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Computers/Tablets & Networking");
        searchButton.click();
        String actual = header.getText();
        String expected = "Computers, Tablets & More";
        Assert.assertEquals(actual, expected);
    }
    public void selectConsumerElectronicsFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Consumer Electronics");
        searchButton.click();
        String actual = header.getText();
        String expected = "Electronics";
        Assert.assertEquals(actual, expected);
    }
    public void selectCraftsFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Crafts");
        searchButton.click();
        String actual = header.getText();
        String expected = "Make it Fun With Arts and Crafts";
        Assert.assertEquals(actual, expected);
    }
    public void selectDollsAndBearsFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Dolls & Bears");
        searchButton.click();
        String actual = header.getText();
        String expected = "Dolls & Teddy Bears";
        Assert.assertEquals(actual, expected);
    }
    public void selectDvdsAndMoviesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("DVDs & Movies");
        searchButton.click();
        String actual = header.getText();
        String expected = "DVDs & Movies";
        Assert.assertEquals(actual, expected);
    }
    public void selectEbayMotorsFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("eBay Motors");
        searchButton.click();
        String actual = header.getText();
        String expected = "Motors";
        Assert.assertEquals(actual, expected);
    }
    public void selectEntertainmentMemorabiliaFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Entertainment Memorabilia");
        searchButton.click();
        String actual = header.getText();
        String expected = "Entertainment Memorabilia";
        Assert.assertEquals(actual, expected);
    }
    public void selectGiftCardsAndCouponsFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Gift Cards & Coupons");
        searchButton.click();
        String actual = header.getText();
        String expected = "Gift Cards & Coupons";
        Assert.assertEquals(actual, expected);
    }
    public void selectHealthAndBeautyFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Health & Beauty");
        searchButton.click();
        String actual = header.getText();
        String expected = "Health & Beauty";
        Assert.assertEquals(actual, expected);
    }
    public void selectHomeAndGardenFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Home & Garden");
        searchButton.click();
        String actual = header.getText();
        String expected = "Home & Garden";
        Assert.assertEquals(actual, expected);
    }
    public void selectJewelryAndWatchesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Jewelry & Watches");
        searchButton.click();
        String actual = header.getText();
        String expected = "Jewelry & Watches";
        Assert.assertEquals(actual, expected);
    }
    public void selectMusicFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Music");
        searchButton.click();
        String actual = header.getText();
        String expected = "Music";
        Assert.assertEquals(actual, expected);
    }
    public void selecMusicalInstrumentsAndGearFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Musical Instruments & Gear");
        searchButton.click();
        String actual = header.getText();
        String expected = "Musical Instruments & Gear";
        Assert.assertEquals(actual, expected);
    }
    public void selectPetSuppliesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Pet Supplies");
        searchButton.click();
        String actual = header.getText();
        String expected = "Pet Supplies";
        Assert.assertEquals(actual, expected);
    }
    public void selectPotteryAndGlassFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Pottery & Glass");
        searchButton.click();
        String actual = header.getText();
        String expected = "Pottery & Glass";
        Assert.assertEquals(actual, expected);
    }
    public void selectRealEstateFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Real Estate");
        searchButton.click();
        String actual = header.getText();
        String expected = "Real Estate";
        Assert.assertEquals(actual, expected);
    }
    public void selectSpecialtyServicesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Specialty Services");
        searchButton.click();
        String actual = header.getText();
        String expected = "Specialty Services";
        Assert.assertEquals(actual, expected);
    }
    public void selectSportingGoodsFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Sporting Goods");
        searchButton.click();
        String actual = header.getText();
        String expected = "Sporting Goods to Keep You Moving";
        Assert.assertEquals(actual, expected);
    }
    public void selectSportsMemCardsAndFanShopFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Sports Mem, Cards & Fan Shop");
        searchButton.click();
        String actual = header.getText();
        String expected = "Sports Memorabilia";
        Assert.assertEquals(actual, expected);
    }
    public void selectStampsFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Stamps");
        searchButton.click();
        String actual = header.getText();
        String expected = "Stamps";
        Assert.assertEquals(actual, expected);
    }
    public void selectTicketsAndExperiencesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Tickets & Experiences");
        searchButton.click();
        String actual = header.getText();
        String expected = "Tickets & Experiences";
        Assert.assertEquals(actual, expected);
    }
    public void selectToysAndHobbiesfromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Toys & Hobbies");
        searchButton.click();
        String actual = header.getText();
        String expected = "Toys & Hobbies";
        Assert.assertEquals(actual, expected);
    }
    public void selectTravelFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Travel");
        searchButton.click();
        String actual = header.getText();
        String expected = "Travel & Luggage";
        Assert.assertEquals(actual, expected);
    }
    public  void selectVideoGamesAndConsolesFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Video Games & Consoles");
        searchButton.click();
        String actual = header.getText();
        String expected = "eBay Gaming";
        Assert.assertEquals(actual, expected);
    }
    public void selectEverythingElseFromDropDown(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Everything Else");
        searchButton.click();
        String actual = header.getText();
        String expected = "Everything Else";
        Assert.assertEquals(actual, expected);
    }
}
