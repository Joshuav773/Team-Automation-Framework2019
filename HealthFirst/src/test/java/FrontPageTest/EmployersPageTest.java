package FrontPageTest;

import FrontPage.EmployersPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class EmployersPageTest extends EmployersPage {

    EmployersPage objEmployersPage;

    @BeforeMethod
    public void initializePageObjects() {

        objEmployersPage = PageFactory.initElements(driver, EmployersPage.class);
    }

    @Test
    public void RequestAQuoteNow() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objEmployersPage.RequestAQuoteNow();
    }

    @Test
    public void LearnMore() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objEmployersPage.LearnMore();
    }

    @Test
    public void HealthFirstProPlusEPO181() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objEmployersPage.HealthFirstProPlusEPO181();
    }

    @Test
    public void HealthFirstProPLusEPO182() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objEmployersPage.HealthFirstProPlusEPO182();
    }
    @Test
    public void HealthFirstProEPO191() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objEmployersPage.HealthFirstProEPO191();
    }

    @Test
    public void HealthFirstProPLusEPO192() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objEmployersPage.HealthFirstProPlusEPO192();
    }

    @Test
    public void ComprehensiveFormulary() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objEmployersPage.ComprehensiveFormulary();
    }

    @Test
    public void DentalAndVisionBenefits19() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objEmployersPage.DentalAndVisionBenefits19();
    }

    @Test
    public void NetworkandUrgentCareCenterList() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objEmployersPage.NetworkandUrgentCareCenterList();
    }

    @Test
    public void ProvidorTool() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objEmployersPage.ProvidorTool();
    }

    @Test
    public void MemberPortal() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objEmployersPage.MemberPortal();
    }

    @Test
    public void MemberBenefits() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objEmployersPage.MemberBeneifts();
    }

    @Test
    public void AccessToCare() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objEmployersPage.AccessToCare();
    }

    @Test
    public void FluVaccine() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objEmployersPage.FluVaccine();
    }

}
