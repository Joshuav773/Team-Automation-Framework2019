package dataDriven;

import NewYorkTimesBrowse.GoogleSheet;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class GoogleSheetTest extends GoogleSheet {

    GoogleSheet googleSheet;
    @BeforeMethod
    public void initiElements(){
        googleSheet = PageFactory.initElements(driver, GoogleSheet.class);
    }
    @Test
    public void LogInByUsingGoogleSheetTest()throws IOException, InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        testSignInUsingGoogleSheet();
    }
}

