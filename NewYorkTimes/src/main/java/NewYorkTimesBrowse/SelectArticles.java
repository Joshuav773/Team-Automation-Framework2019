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
    @FindBy(xpath = "//*[@id=\"site-content\"]/div[1]/div[2]/div/div[3]/div/section/div[2]/div[6]/article/div/a/div[2]/h2")
    public static WebElement appleNews;
    @FindBy(xpath = "//*[@id=\"comments-speech-bubble-top\"]/i")
    public static WebElement openComments;
    @FindBy(xpath = "//*[@id=\"story\"]/div[5]/button/svg")
    public static WebElement closeComments;
    @FindBy(xpath = "//*[@id=\"site-index\"]/div/div[2]/div/section[5]/ul/li[1]/a")
    public static WebElement readerCenter;
    @FindBy(xpath = "//*[@id=\"collection-reader-center\"]/div[1]/section[1]/div/ol/li[3]/article/div/h2/a")
    public static WebElement projectLens;
    @FindBy(xpath = "//*[@id=\"story\"]/div[4]/div[2]/ul/li[1]/a")
    public static WebElement  oneLawyer;
    @FindBy(xpath = "//*[@id=\"related-coverage\"]/div/ul/li[5]/article/a/h2")
    public static WebElement senateRebukes;
    @FindBy(xpath = "//*[@id=\"story\"]/div[4]/div[1]/div[3]/div/div[2]/div/div/div[2]/a/h2")
    public static WebElement theNfl;
    @FindBy(xpath = "//*[@id=\"story\"]/div[3]/div[1]/div[1]/div/div[4]/div/div/div[2]/a/h2")
    public static WebElement superbowlWeek;
    @FindBy(xpath = "//*[@id=\"story\"]/section/div[3]/aside/div/article[1]/a/h3")
    public static WebElement lbobStory;
    @FindBy(xpath = "//*[@id=\"story\"]/div[4]/div[1]/div[2]/div/div[1]/div/div/div[2]/a/h2")
    public static WebElement bestMovies;
    @FindBy(xpath = "//*[@id=\"story\"]/div[3]/div[1]/div[2]/div/div[4]/div/div/div[2]/a/h2")
    public static WebElement artsWeek;
    @FindBy(xpath = "//*[@id=\"story\"]/div[3]/div[1]/div[1]/div/div[1]/div/div/div[2]/a/h2")
    public static WebElement civilHistory;
    @FindBy(xpath = "//*[@id=\"story\"]/div[4]/div[1]/div[2]/div/div[2]/div/div/div[2]/a/h2")
    public static WebElement churchHistory;
    @FindBy(xpath = "//*[@id=\"story\"]/div[3]/div[1]/div[1]/div/div[5]/div/div/div[2]/a/h2")
    public static WebElement taxiCosts;

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
    public void appleNews(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        appleNews.click();
    }
    public void openComments(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        openComments.click();
    }
    public void closeComments(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        closeComments.click();
    }
    public void readerCenter(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        readerCenter.click();
    }
    public void projectLens(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        projectLens.click();
    }
    public void oneLawyer(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        oneLawyer.click();
    }
    public void senateRebukes(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        senateRebukes.click();
    }
    public void theNfl(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        theNfl.click();
    }
    public void superbowlWeek(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        superbowlWeek.click();
    }
    public void lbobStory(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        lbobStory.click();
    }
    public void bestMovies(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        bestMovies.click();
    }
    public void artsWeek(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        artsWeek.click();
    }
    public void civilHistory(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        civilHistory.click();
    }
    public void churchHistory(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        churchHistory.click();
    }
    public void taxiCosts(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        taxiCosts.click();
    }
}
