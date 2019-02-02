package FrontPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployersPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"section-519\"]/div/div[1]/div/div[1]/div[2]/a")
    public static WebElement RequestAQuoteNow;
    @FindBy(xpath = "//*[@id=\"section-519\"]/div/div[1]/div/div[1]/div[1]/a")
    public static WebElement LearnMore;
    @FindBy(xpath = "//*[@id=\"section-373\"]/div/div[1]/div/div[1]/div[1]/div[1]/a")
    public static WebElement HealthFirstProEPO181;
    @FindBy(xpath = "//*[@id=\"section-373\"]/div/div[1]/div/div[1]/div[1]/div[2]/a")
    public static WebElement HealthFirstProPlusEPO182;
    @FindBy(xpath = "//*[@id=\"section-373\"]/div/div[1]/div/div[1]/div[2]/div[1]/a")
    public static WebElement HealthFirstProEPO191;
    @FindBy(xpath = "//*[@id=\"section-373\"]/div/div[1]/div/div[1]/div[2]/div[2]/a")
    public static WebElement HealthFirstProPlusEPO192;
    @FindBy(xpath = "//*[@id=\"section-375\"]/div/div[1]/div/div[1]/div[5]/div[2]/a")
    public static WebElement ComprehensiveFormulary;
    @FindBy(xpath = "//*[@id=\"section-375\"]/div/div[1]/div/div[1]/div[3]/div[3]/a")
    public static WebElement HealthyLiving;
    @FindBy(xpath = "//*[@id=\"section-375\"]/div/div[1]/div/div[1]/div[1]/div[1]/a")
    public static WebElement NetworkandUrgentCareCenterList;
    @FindBy(xpath = "//*[@id=\"section-375\"]/div/div[1]/div/div[1]/div[1]/div[2]/a")
    public static WebElement ProvidorTool;
    @FindBy(xpath = "//*[@id=\"section-375\"]/div/div[1]/div/div[1]/div[3]/div[2]/a")
    public static WebElement Benefits;
    @FindBy(xpath = "//*[@id=\"section-375\"]/div/div[1]/div/div[1]/div[1]/div[3]/a")
    public static WebElement MemberBenefits;
    @FindBy(xpath = "//*[@id=\"section-375\"]/div/div[1]/div/div[1]/div[3]/div[1]/a")
    public static WebElement AccessToCare;
    @FindBy(xpath = "//*[@id=\"section-375\"]/div/div[1]/div/div[1]/div[5]/div[1]/a")
    public static WebElement FluVaccine;

    public void RequestAQuoteNow() { RequestAQuoteNow.click(); }
    public void LearnMore() { LearnMore.click(); }
    public void HealthFirstProPlusEPO181() { HealthFirstProEPO181.click(); }
    public void HealthFirstProPlusEPO182() { HealthFirstProPlusEPO182.click(); }
    public void HealthFirstProEPO191() { HealthFirstProEPO191.click(); }
    public void HealthFirstProPlusEPO192() { HealthFirstProPlusEPO192.click(); }
    public void ComprehensiveFormulary() { ComprehensiveFormulary.click(); }
    public void DentalAndVisionBenefits19() { HealthyLiving.click(); }
    public void NetworkandUrgentCareCenterList() { NetworkandUrgentCareCenterList.click(); }
    public void ProvidorTool() { ProvidorTool.click(); }
    public void MemberPortal() { Benefits.click(); }
    public void MemberBeneifts() { MemberBenefits.click(); }
    public void AccessToCare() { AccessToCare.click(); }
    public void FluVaccine() { FluVaccine.click(); }
}
