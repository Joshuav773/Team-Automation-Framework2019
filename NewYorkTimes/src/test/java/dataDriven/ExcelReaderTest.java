package dataDriven;

import NewYorkTimesBrowse.ExcelReader;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class ExcelReaderTest extends ExcelReader {

    ExcelReader excelReader;
    @BeforeMethod
    public void initElements(){
        excelReader = PageFactory.initElements(driver, ExcelReader.class);
    }
    @Test
    public void searchDataFoundTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){
        }.getClass().getEnclosingMethod().getName()));
        searchDataFound();
    }
}

