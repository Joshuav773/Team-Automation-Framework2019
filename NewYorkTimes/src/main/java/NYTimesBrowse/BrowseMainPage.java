package NYTimesBrowse;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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



    public void worldClick(){
        worldClick.click();
    }
    public void americasClick(){
        americasClick.click();
    }
    public void homeButton(){
        homeButton.click();
    }
    public void usClick(){
        usClick.click();
    }
    public void articleClick(){
        articleClick.click();
    }
    public void sportsClick(){
        sportsClick.click();
    }
    public void nflSection(){
        nflSection.click();
    }
    public void techSection(){
        techSection.click();
    }
    public void scienceSection(){
        scienceSection.click();
    }
    public void politicsSection(){
        politicsSection.click();
    }

}
