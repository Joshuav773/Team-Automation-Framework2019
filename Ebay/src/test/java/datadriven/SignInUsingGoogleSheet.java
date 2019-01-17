package datadriven;

import base.CommonAPI;
import eBayUtil.GoogleSheetPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class SignInUsingGoogleSheet extends GoogleSheetPage {

    GoogleSheetPage googleSheetPage;
    @BeforeMethod
    public void initiElements(){
        googleSheetPage = PageFactory.initElements(driver, GoogleSheetPage.class);
    }
    @Test
    public void LogInByUsingGoogleSheetTest()throws IOException, InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        testSignInUsingGoogleSheet();
    }
}
