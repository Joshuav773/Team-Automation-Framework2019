package FrontPageTest;

import FrontPage.MembersPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class MembersPageTest extends MembersPage {
        MembersPage objMembersPage;

        @BeforeMethod
        public void initializePageObjects() {

            objMembersPage = PageFactory.initElements(driver, MembersPage.class);
        }

        @Test
        public void HealthResources() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objMembersPage.HealthResources();
        }

        @Test
        public void CommunityOffices() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objMembersPage.CommunityOffices();
        }

        @Test
        public void Events() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objMembersPage.Events();
        }

        @Test
        public void Glossary() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objMembersPage.Glossary();
        }
        @Test
        public void Pressroom() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objMembersPage.Pressroom();
        }

        @Test
        public void NYStateOfHealth() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objMembersPage.NYStateOfHealth();
        }

        @Test
        public void CMSWebsite() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objMembersPage.CMSWebsite();
        }

        @Test
        public void LookUpTool() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objMembersPage.LookUpTool();
        }

        @Test
        public void AccountHelp() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objMembersPage.AccountHelp();
        }

        @Test
        public void FrequentlyAskedQuestions() {
            TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            objMembersPage.FrequentlyAskedQuestions();
        }
}
