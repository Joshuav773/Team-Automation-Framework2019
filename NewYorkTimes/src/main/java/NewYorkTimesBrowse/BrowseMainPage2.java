package NewYorkTimesBrowse;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class BrowseMainPage2 extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/header/div[4]/ul/li[13]/a")
    public static WebElement stylesSection;
    @FindBy(xpath = "//*[@id=\"site-index\"]/div/div[2]/div/section[3]/ul/li[8]/a")
    public static WebElement televisionSection;
    @FindBy(xpath = "//*[@id=\"site-index\"]/div/div[2]/div/section[5]/ul/li[8]/a")
    public static WebElement photoSection;
    @FindBy(xpath = "//*[@id=\"site-index\"]/div/div[2]/div/section[1]/ul/li[14]/a")
    public static WebElement correctionsSection;
    @FindBy(xpath = "//*[@id=\"site-index\"]/div/div[2]/div/section[4]/ul/li[1]/a")
    public static WebElement automobileSection;
    @FindBy(xpath = "//*[@id=\"site-index-navigation\"]/div/div[5]/ul/li[5]/a")
    public static WebElement multimediaSection;
    @FindBy(xpath = "//*[@id=\"site-index\"]/div/div[2]/div/section[3]/ul/li[9]/a")
    public static WebElement theaterSection;
    @FindBy(xpath = "//*[@id=\"site-index\"]/div/div[2]/div/section[4]/ul/li[13]/a")
    public static WebElement weddingsSection;
    @FindBy(xpath = "//*[@id=\"site-index\"]/div/div[2]/div/section[4]/ul/li[2]/a")
    public static WebElement crosswordsSection;
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[5]/div[2]/section[4]/ul/li[3]/a")
    public static WebElement puzzleSection;

    public void stylesSection(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        stylesSection.click();
    }
    public void televisionSection(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        televisionSection.click();
    }
    public void photoSection(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        photoSection.click();
    }
    public void correctionsSection(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        correctionsSection.click();
    }
    public void automobileSection(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        automobileSection.click();
    }
    public void multimediaSection(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        multimediaSection.click();
    }
    public void theaterSection(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        theaterSection.click();
    }
    public void weddingsSection(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        weddingsSection.click();
    }
    public void crosswordsSection(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        crosswordsSection.click();
    }
    public void puzzleSection(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        puzzleSection.click();
    }
}
