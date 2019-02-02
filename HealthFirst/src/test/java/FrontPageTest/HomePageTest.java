package FrontPageTest;

import FrontPage.HomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HomePageTest extends HomePage {
    HomePage objHomePage;

    @BeforeMethod
    public void initializePageObjects() {

        objHomePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void HealthInsrance() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objHomePage.HealthInsurance();
    }

    @Test
    public void InfoMembers() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objHomePage.InfoMembers();
    }

    @Test
    public void InfoBroker() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objHomePage.InfoBroker();
    }

    @Test
    public void Employers() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objHomePage.Employers();
    }
    @Test
    public void Providors() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objHomePage.Providers();
    }

    @Test
    public void BecomeMember() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objHomePage.BecomeMember();
    }

    @Test
    public void FindHospital() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objHomePage.FindHospital();
    }

    @Test
    public void PayBill() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objHomePage.PayBill();
    }

    @Test
    public void FindPlans() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objHomePage.FindPlans();
    }

    @Test
    public void Press() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objHomePage.Press();
    }

    @Test
    public void MemberServices() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objHomePage.MemberServices();
    }

    @Test
    public void ContactUs() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objHomePage.ContactUs();
    }

    @Test
    public void PlanRenewals() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objHomePage.PlanRenewals();
    }

    @Test
    public void FindHealthFirstProvidor() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objHomePage.FindHealthfirstProvidor();
    }
    @Test
    public void ReportFrauds() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objHomePage.ReportFrauds();
    }

    @Test
    public void FAQS() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objHomePage.FAQS();
    }

    @Test
    public void Claims() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objHomePage.Claims();
    }

    @Test
    public void ProvidorResource() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objHomePage.ProvidorResource();
    }

    @Test
    public void ClinicalPartnerships() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objHomePage.ClinicalPartnerships();
    }

    @Test
    public void Compliance() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        objHomePage.Compliance();
    }





}
