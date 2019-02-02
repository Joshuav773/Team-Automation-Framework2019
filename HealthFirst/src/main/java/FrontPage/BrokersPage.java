package FrontPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BrokersPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"section-385\"]/div/div[1]/div/div/div[1]/p[5]/a")
    public static WebElement ApplyNow;
    @FindBy(xpath = "//*[@id=\"section-373\"]/div/div[1]/div/div[1]/div[1]/a")
    public static WebElement HealthFirstProPlusEPO1;
    @FindBy(xpath = "//*[@id=\"section-373\"]/div/div[1]/div/div[1]/div[2]/a")
    public static WebElement HealthFirstProEPO1;
    @FindBy(xpath = "//*[@id=\"section-373\"]/div/div[1]/div/div[1]/div[3]/a")
    public static WebElement HealthFirstProPlusEPO2;
    @FindBy(xpath = "//*[@id=\"section-373\"]/div/div[1]/div/div[1]/div[4]/a")
    public static WebElement HealthFirstProEPO2;
    @FindBy(xpath = "//*[@id=\"section-373\"]/div/div[1]/div/div[3]/div[1]/a")
    public static WebElement Guidelines;
    @FindBy(xpath = "//*[@id=\"section-373\"]/div/div[1]/div/div[3]/div[2]/a")
    public static WebElement DentalAndVisionBenefits18;
    @FindBy(xpath = "//*[@id=\"section-373\"]/div/div[1]/div/div[3]/div[3]/a")
    public static WebElement DentalAndVisionBenefits19;
    @FindBy(xpath = "//*[@id=\"section-375\"]/div/div[1]/div/div[2]/div[1]/a")
    public static WebElement NetworkandUrgentCareCenterList;
    @FindBy(xpath = "//*[@id=\"section-375\"]/div/div[1]/div/div[2]/div[2]/a")
    public static WebElement ProvidorTool;
    @FindBy(xpath = "//*[@id=\"section-375\"]/div/div[1]/div/div[2]/div[3]/a")
    public static WebElement MemberPortal;
    @FindBy(xpath = "//*[@id=\"section-375\"]/div/div[1]/div/div[4]/div[1]/a")
    public static WebElement MemberBenefits;
    @FindBy(xpath = "//*[@id=\"section-375\"]/div/div[1]/div/div[4]/div[2]/a")
    public static WebElement AccessToCare;
    @FindBy(xpath = "//*[@id=\"section-375\"]/div/div[1]/div/div[4]/div[3]/a")
    public static WebElement FluVaccine;
    @FindBy(xpath = "//*[@id=\"section-375\"]/div/div[1]/div/div[6]/div[1]/a")
    public static WebElement HealthyLiving;
    @FindBy(xpath = "//*[@id=\"section-375\"]/div/div[1]/div/div[6]/div[2]/a")
    public static WebElement GymBenefits;
    @FindBy(xpath = "//*[@id=\"section-375\"]/div/div[1]/div/div[6]/div[3]/a")
    public static WebElement ComprehensiveFormulary;

    public void ApplyNow() { ApplyNow.click(); }
    public void HealthFirstProPlusEPO1() { HealthFirstProPlusEPO1.click(); }
    public void HealthFirstProEPO1() { HealthFirstProEPO1.click(); }
    public void HealthFirstProPlusEPO2() { HealthFirstProPlusEPO2.click(); }
    public void HealthFirstProEPO2() { HealthFirstProEPO2.click(); }
    public void Guidelines() { Guidelines.click(); }
    public void DentalAndVisionBenefits18() { DentalAndVisionBenefits18.click(); }
    public void DentalAndVisionBenefits19() { DentalAndVisionBenefits19.click(); }
    public void NetworkandUrgentCareCenterList() { NetworkandUrgentCareCenterList.click(); }
    public void ProvidorTool() { ProvidorTool.click(); }
    public void MemberPortal() { MemberPortal.click(); }
    public void MemberBeneifts() { MemberBenefits.click(); }
    public void AccessToCare() { AccessToCare.click(); }
    public void FluVaccine() { FluVaccine.click(); }
    public void HealthyLiving() { HealthyLiving.click(); }
    public void GymBenefits() { GymBenefits.click(); }
    public void ComprehensiveFormulary() { ComprehensiveFormulary.click(); }
}
