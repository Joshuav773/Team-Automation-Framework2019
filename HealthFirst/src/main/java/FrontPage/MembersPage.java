package FrontPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MembersPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div[2]/ul/li[1]/a")
    public static WebElement HealthyResources;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div[2]/ul/li[2]/a")
    public static WebElement CommunityOffices;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div[2]/ul/li[3]/a")
    public static WebElement Events;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div[2]/ul/li[4]/a")
    public static WebElement Glossary;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div[2]/ul/li[5]/a")
    public static WebElement Pressroom;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div[2]/ul/li[6]/a")
    public static WebElement NYStateOfHealth;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div[2]/ul/li[7]/a")
    public static WebElement CMSWebsite;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div[2]/ul/li[8]/a")
    public static WebElement LookUpTool;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div[7]/div[1]/div/div/a")
    public static WebElement AccountHelp;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div[5]/div[3]/div/div/a")
    public static WebElement FrequentlyAskedQuestions;

    public void HealthResources() { HealthyResources.click(); }
    public void CommunityOffices() { CommunityOffices.click(); }
    public void Events() { Events.click(); }
    public void Glossary() { Glossary.click(); }
    public void Pressroom() { Pressroom.click(); }
    public void NYStateOfHealth() { NYStateOfHealth.click(); }
    public void CMSWebsite() { CMSWebsite.click(); }
    public void LookUpTool() { LookUpTool.click(); }
    public void AccountHelp() { AccountHelp.click(); }
    public void FrequentlyAskedQuestions() { FrequentlyAskedQuestions.click(); }
}
