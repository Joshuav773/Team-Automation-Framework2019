package NewYorkTimesBrowse;

import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static GoogleApis.GoogleSheetReader.getSheetsService;

public class GoogleSheet extends CommonAPI{

    @FindBy(xpath = "//a[contains (text(), 'Sign in')]")public static WebElement signInlink;
    @FindBy(css = "#sgnBt")public static WebElement signInButton;
    @FindBy(css ="#userid")public static WebElement userIdInputBar;
    @FindBy(css = "#pass")public static WebElement passwordInputBar;
    //ALI_GS_TC1
    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        // Build a new authorized API client service.
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;
        }
    }
    //LogIn by using Google Sheet sheet data
    public List<String> signInByReadingFromGoogleSheet(String spreadsheetId, String range) throws IOException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList();
        for (List row : col2Value) {
            inputValueInTextBoxByWebElement(userIdInputBar,row.get(0).toString());
            inputValueInTextBoxByWebElement(passwordInputBar,row.get(1).toString());
            break;
        }
        return actual;
    }
    public void testSignInUsingGoogleSheet() throws IOException, InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        signInlink.click();
        Thread.sleep(2000);
        int i = 0;
        String spreadsheetId = "1im31XVbjJQf-LbevD-FX_LEbc4jX8TTwbrleyDrWMsE";
        String range = "Sheet1";
        signInByReadingFromGoogleSheet(spreadsheetId, range);
        List<List<Object>> expectedErrorMessage = getSpreadSheetRecords(spreadsheetId, range);
        for (List row : expectedErrorMessage) {
            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
            i++;
        }
        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
    }
}


