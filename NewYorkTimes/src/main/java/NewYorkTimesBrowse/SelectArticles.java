package NewYorkTimesBrowse;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
        realEstate.click();
    }
    public void highEnd(){
        highEnd.click();
    }
    public void generalPage(){
        generalPage.click();
    }
    public void tMagazine(){
        tMagazine.click();
    }
    public void designInteriors(){
        designInteriors.click();
    }
    public void opinionPage(){
        opinionPage.click();
    }
    public void culturePage(){
        culturePage.click();
    }
    public void lettersPage(){
        lettersPage.click();
    }
    public void editorialsPage(){
        editorialsPage.click();
    }
    public void popCulture(){
        popCulture.click();

    }
}
