package NewYorkTimesBrowse;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class BrowseMainPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/header/div[4]/ul/li[1]/a")
    public static WebElement worldClick;
    @FindBy(xpath = "//*[@id=\"collection-world\"]/header/nav/ol/li[2]/a")
    public static WebElement americasClick;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/header/section[1]/div[3]/a/svg/path")
    public static WebElement homeButton;
    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/header/div[4]/ul/li[2]/a")
    public static WebElement usClick;
    @FindBy(xpath = "//*[@id=\"collection-us\"]/div[1]/section/div[1]/ol/li[1]/article/div/h2/a")
    public static WebElement articleClick;
    @FindBy(xpath = "//*[@id=\"site-index\"]/div/div[2]/div/section[1]/ul/li[10]/a")
    public static WebElement sportsClick;
    @FindBy(xpath = "//*[@id=\"collection-sports\"]/header/nav/ol/li[2]/a")
    public static WebElement nflSection;
    @FindBy(xpath = "//*[@id=\"site-index\"]/div/div[2]/div/section[1]/ul/li[7]/a")
    public static WebElement techSection;
    @FindBy(xpath = "//*[@id=\"site-index\"]/div/div[2]/div/section[1]/ul/li[8]/a")
    public static WebElement scienceSection;
    @FindBy(xpath = "//*[@id=\"site-index\"]/div/div[2]/div/section[1]/ul/li[4]/a")
    public static WebElement politicsSection;
    @FindBy(xpath = "//*[@id=\"site-index\"]/div/div[2]/div/section[1]/ul/li[5]/a")
    public static WebElement nySection;
    @FindBy(xpath = "//*[@id=\"app\"]/div/div/header/section[1]/div[3]/a/svg")
    public static WebElement frontPage;
    @FindBy(xpath = "//*[@id=\"app\"]/footer/nav/ul[2]/li[1]/a")
    public static WebElement contactButton;
    @FindBy(xpath = "//*[@id=\"Help_New\"]/img")
    public static WebElement chatButton;
    @FindBy(xpath = "/html/body/header/div[1]/a")
    public static WebElement backHome;

    public void worldClick(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        worldClick.click();
    }
    public void americasClick(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        americasClick.click();
    }
    public void homeButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        homeButton.click();
    }
    public void usClick(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        usClick.click();
    }
    public void articleClick(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        articleClick.click();
    }
    public void sportsClick(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sportsClick.click();
    }
    public void nflSection(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        nflSection.click();
    }
    public void techSection(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        techSection.click();
    }
    public void scienceSection(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        scienceSection.click();
    }
    public void politicsSection(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        politicsSection.click();
    }
    public void nySection(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        nySection.click();
    }
    public void frontPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        frontPage.click();
    }
    public void contactButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        contactButton.click();
    }
    public void chatButton(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        chatButton.click();
    }
    public void backHome(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        backHome.click();
    }
}


