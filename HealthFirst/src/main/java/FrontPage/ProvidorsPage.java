package FrontPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProvidorsPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div[5]/div[1]/div/div/a")
    public static WebElement ClaimsandBilling;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div[5]/div[2]/div/div/a")
    public static WebElement ProvidorsManual;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div[5]/div[3]/div/div/a")
    public static WebElement  ProvidorResources;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div[5]/div[4]/div/div/a")
    public static WebElement Compliance;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div[5]/div[5]/div/div/a")
    public static WebElement ClinicalPartnerships;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div[5]/div[6]/div/div/a")
    public static WebElement LongTermCarePatient;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div[1]/p[2]/a[1]")
    public static WebElement ProvidorLogIn;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div[2]/ul/li[5]/a")
    public static WebElement ProvidorAlerts;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div[2]/ul/li[6]/a")
    public static WebElement ProvidorForms;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div/div[2]/ul/li[4]/a")
    public static WebElement Referral;

    public void ClaimsandBilling() { ClaimsandBilling.click(); }
    public void ProvidorsManual() { ProvidorsManual.click(); }
    public void ProvidorResources() { ProvidorResources.click(); }
    public void Compliance() { Compliance.click(); }
    public void ClinicalPartnerships() { ClinicalPartnerships.click(); }
    public void LongTermCarePatient() { LongTermCarePatient.click(); }
    public void ProvidorLongIn() { ProvidorLogIn.click(); }
    public void ProvidorAlerts() { ProvidorAlerts.click(); }
    public void ProvidorForms() { ProvidorForms.click(); }
    public void Referral() { Referral.click(); }
}
