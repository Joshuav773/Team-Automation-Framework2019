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

    public void HealthInsurance() { HealthyResources.click(); }
    public void InfoMembers() { CommunityOffices.click(); }
    public void InfoBroker() { Events.click(); }
    public void Employers() { Glossary.click(); }
    public void Providers() { Pressroom.click(); }
    public void BecomeMember() { NYStateOfHealth.click(); }
    public void FindHospital() { CMSWebsite.click(); }
    public void PayBill() { LookUpTool.click(); }
    public void FindPlans() { AccountHelp.click(); }
    public void Press() { FrequentlyAskedQuestions.click(); }
}
