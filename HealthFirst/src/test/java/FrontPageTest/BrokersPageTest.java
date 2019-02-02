package FrontPageTest;

import FrontPage.BrokersPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class BrokersPageTest extends BrokersPage {
        BrokersPage objBrokersPage;

        @BeforeMethod
        public void initializePageObjects() {

            objBrokersPage = PageFactory.initElements(driver, BrokersPage.class);
        }

        @Test
        public void ApplyNow() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objBrokersPage.ApplyNow();
        }

        @Test
        public void HealthFirstProPLusEPO1() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objBrokersPage.HealthFirstProPlusEPO1();
        }

        @Test
        public void HealthFirstProEPO1() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objBrokersPage.HealthFirstProEPO1();
        }

        @Test
        public void HealthFirstProPLusEPO2() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objBrokersPage.HealthFirstProPlusEPO2();
        }
        @Test
        public void HealthFirstProEPO2() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objBrokersPage.HealthFirstProEPO2();
        }

        @Test
        public void Guidelines() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objBrokersPage.Guidelines();
        }

        @Test
        public void DentalAndVisionBenefits18() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objBrokersPage.DentalAndVisionBenefits18();
        }

        @Test
        public void DentalAndVisionBenefits19() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objBrokersPage.DentalAndVisionBenefits19();
        }

        @Test
        public void NetworkandUrgentCareCenterList() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objBrokersPage.NetworkandUrgentCareCenterList();
        }

        @Test
        public void ProvidorTool() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objBrokersPage.ProvidorTool();
        }

        @Test
        public void MemberPortal() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objBrokersPage.MemberPortal();
        }

        @Test
        public void MemberBenefits() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objBrokersPage.MemberBeneifts();
        }

        @Test
        public void AccessToCare() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objBrokersPage.AccessToCare();
        }

        @Test
        public void FluVaccine() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objBrokersPage.FluVaccine();
        }
        @Test
        public void HealthyLiving() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objBrokersPage.HealthyLiving();
        }

        @Test
        public void GymBenefits() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objBrokersPage.GymBenefits();
        }

        @Test
        public void ComprehensiveFormulary() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objBrokersPage.ComprehensiveFormulary();
        }
}
