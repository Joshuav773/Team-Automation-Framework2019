package FrontPage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HealthPlansPage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div[1]/div[1]/div/div/div/a")
    public static WebElement HealthFirstLeafPlans;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div[1]/div[2]/div/div/div/a")
    public static WebElement MedicaidCare;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div[1]/div[3]/div/div/div/a")
    public static WebElement HealthFirstEssentialPlans;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div[1]/div[4]/div/div/div/a")
    public static WebElement MedicarePlans;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div[1]/div[5]/div/div/div/a")
    public static WebElement ManageLongTermCarePlan;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div[1]/div[6]/div/div/div/a")
    public static WebElement AbsoluteCareFidaPlan;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div[1]/div[7]/div/div/div/a")
    public static WebElement ChildHealthPlus;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div[1]/div[8]/div/div/div/a")
    public static WebElement PersonalWellnessPlan;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div[1]/div[9]/div/div/div/a")
    public static WebElement HealthFirstProPlans;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div[1]/div[10]/div/div/div/a")
    public static WebElement FindHealthPlan;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div[1]/div[11]/div/div/div/a")
    public static WebElement RenewPlan;

    public void HealthFirstLeafPlans() { HealthFirstLeafPlans.click(); }
    public void MedicaidCare() { MedicaidCare.click(); }
    public void HealthFirstEssentialPlans() { HealthFirstEssentialPlans.click(); }
    public void MedicarePlans() { MedicarePlans.click(); }
    public void ManageLongTemCarePlan() { ManageLongTermCarePlan.click(); }
    public void AbsoluteCareFidaPlan() { AbsoluteCareFidaPlan.click(); }
    public void ChildHealthPlus() { ChildHealthPlus.click(); }
    public void PersonalWellnessPlan() { PersonalWellnessPlan.click(); }
    public void HealthfirstProPlans() { HealthFirstProPlans.click(); }
    public void FindHealthPlan() { FindHealthPlan.click(); }
    public void RenewPlan() { RenewPlan.click(); }


}
