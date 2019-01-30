package NewYorkTimesBrowse;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class SelectArticles extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/header/div[4]/ul/li[18]/a")
    public static WebElement realEstate;
    @FindBy(xpath = "//*[@id=\"collection-realestate\"]/header/nav/ol/li[1]/a")
    public static WebElement highEnd;
    @FindBy(xpath = "//*[@id=\"masthead\"]/div[1]/div[1]/button[2]")
    public static WebElement generalPage;
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/header/div[4]/ul/li[17]/a")
    public static WebElement tMagazine;
    @FindBy(xpath = "//*[@id=\"collection-t-magazine\"]/header/nav/ol/li[1]/a")
    public static WebElement designInteriors;
    @FindBy(xpath = "//*[@id=\"site-index\"]/div/div[2]/div/section[2]/ul/li[1]/a")
    public static WebElement opinionPage;
    @FindBy(xpath = "//*[@id=\"collection-opinion\"]/header/nav/ol/li[13]/a")
    public static WebElement culturePage;
    @FindBy(xpath = "//*[@id=\"site-index\"]/div/div[2]/div/section[2]/ul/li[5]/a")
    public static WebElement lettersPage;
    @FindBy(xpath = "//*[@id=\"site-index\"]/div/div[2]/div/section[2]/ul/li[3]/a")
    public static WebElement editorialsPage;
    @FindBy(xpath = "//*[@id=\"site-index\"]/div/div[2]/div/section[3]/ul/li[7]/a")
    public static WebElement popCulture;

    public void realEstate(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        realEstate.click();
    }
    public void highEnd(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        highEnd.click();
    }
    public void generalPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        generalPage.click();
    }
    public void tMagazine(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        tMagazine.click();
    }
    public void designInteriors(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        designInteriors.click();
    }
    public void opinionPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        opinionPage.click();
    }
    public void culturePage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        culturePage.click();
    }
    public void lettersPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        lettersPage.click();
    }
    public void editorialsPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        editorialsPage.click();
    }
    public void popCulture(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        popCulture.click();

    }
}
