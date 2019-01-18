package FrontPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"menu-item-424\"]/a")
    public static WebElement HealthInsurance;
    @FindBy(xpath = "//*[@id=\"menu-item-373\"]/a")
    public static WebElement InfoMembers;
    @FindBy(xpath = "//*[@id=\"menu-item-13273\"]/a")
    public static WebElement InfoBroker;
    @FindBy(xpath = "//*[@id=\"menu-item-13283\"]/a")
    public static WebElement Employers;
    @FindBy(xpath = "//*[@id=\"menu-item-2979\"]/a")
    public static WebElement Providers;
    @FindBy(xpath = "//*[@id=\"container\"]/div[1]/div[2]/div[2]/div/div/ul/li[1]/a")
    public static WebElement BecomeMember;
    @FindBy(xpath = "//*[@id=\"container\"]/div[1]/div[2]/div[2]/div/div/ul/li[2]/a")
    public static WebElement FindHospital;
    @FindBy(xpath = "//*[@id=\"container\"]/div[1]/div[2]/div[2]/div/div/ul/li[3]/a")
    public static WebElement PayBill;
    @FindBy(xpath = "//*[@id=\"container\"]/div[1]/div[2]/div[1]/div[1]/div/a[1]")
    public static WebElement FindPlans;
    @FindBy(xpath = "//*[@id=\"press\"]")
    public static WebElement Press;
    @FindBy(xpath = "//*[@id=\"menu-item-387\"]/a")
    public static WebElement MemberServices;
    @FindBy(xpath = "//*[@id=\"menu-item-385\"]/a")
    public static WebElement ContactUs;
    @FindBy(xpath = "//*[@id=\"menu-item-31113\"]/a")
    public static WebElement PlanRenewals;
    @FindBy(xpath = "//*[@id=\"menu-item-431\"]/a")
    public static WebElement FindHealthfirstProvider;
    @FindBy(xpath = "//*[@id=\"menu-item-3314\"]/a")
    public static WebElement ReportFruds;
    @FindBy(xpath = "//*[@id=\"menu-item-437\"]/a")
    public static WebElement FAQS;
    @FindBy(xpath = "//*[@id=\"menu-item-3312\"]/a")
    public static WebElement Claims;
    @FindBy(xpath = "//*[@id=\"menu-item-4361\"]/a")
    public static WebElement ProvidorResource;
    @FindBy(xpath = "//*[@id=\"menu-item-4843\"]/a")
    public static WebElement ClinicalPartnerships;
    @FindBy(xpath = "//*[@id=\"menu-item-3311\"]/a")
    public static WebElement Compliance;


    public void HealthInsurance() { HealthInsurance.click(); }
    public void InfoMembers() { InfoMembers.click(); }
    public void InfoBroker() { InfoBroker.click(); }
    public void Employers() { Employers.click(); }
    public void Providers() { Providers.click(); }
    public void BecomeMember() { BecomeMember.click(); }
    public void FindHospital() { FindHospital.click(); }
    public void PayBill() { PayBill.click(); }
    public void FindPlans() { FindPlans.click(); }
    public void Press() { Press.click(); }
    public void MemberServices() { MemberServices.click(); }
    public void ContactUs() { ContactUs.click(); }
    public void PlanRenewals() { PlanRenewals.click(); }
    public void FindHealthfirstProvidor() { FindHealthfirstProvider.click(); }
    public void ReportFruds() { ReportFruds.click(); }
    public void FAQS() { FAQS.click(); }
    public void Claims() { Claims.click(); }
    public void ProvidorResource() { ProvidorResource.click(); }
    public void ClinicalPartnerships() { ClinicalPartnerships.click(); }
    public void Compliance() { Compliance.click(); }


}
