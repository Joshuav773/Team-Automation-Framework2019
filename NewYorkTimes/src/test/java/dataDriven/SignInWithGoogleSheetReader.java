package dataDriven;

import NewYorkTimesBrowse.GoogleSheetReader;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;

public class SignInWithGoogleSheetReader extends GoogleSheetReader {
    GoogleSheetReader googleSheetReader;
    @BeforeMethod
    public void initiElements(){
        googleSheetReader = PageFactory.initElements(driver, GoogleSheetReader.class);
    }
    @Test
    public void LogInByUsingGoogleSheetTest()throws IOException, InterruptedException{
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        testSignInUsingGoogleSheet();
    }
}

