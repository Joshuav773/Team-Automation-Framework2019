package FrontPageTest;

import FrontPage.ProvidorsPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class ProvidorsPageTest extends ProvidorsPage {
        ProvidorsPage objProvidorsPage;

        @BeforeMethod
        public void initializePageObjects() {

            objProvidorsPage = PageFactory.initElements(driver, ProvidorsPage.class);
        }

        @Test
        public void ClaimsandBilling() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objProvidorsPage.ClaimsandBilling();
        }

        @Test
        public void ProvidorsManaul() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objProvidorsPage.ProvidorsManual();
        }

        @Test
        public void ProvidorResources() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objProvidorsPage.ProvidorResources();
        }

        @Test
        public void Compliance() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objProvidorsPage.Compliance();
        }
        @Test
        public void ClinicalPartnerships() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objProvidorsPage.ClinicalPartnerships();
        }

        @Test
        public void LongTermCarePatient() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objProvidorsPage.LongTermCarePatient();
        }

        @Test
        public void ProvidorLongIn() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objProvidorsPage.ProvidorLongIn();
        }

        @Test
        public void ProvidorAlerts() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objProvidorsPage.ProvidorAlerts();
        }

        @Test
        public void ProvidorForms() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objProvidorsPage.ProvidorForms();
        }

        @Test
        public void Referral() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objProvidorsPage.Referral();
        }
}
