package datadriven;

import base.CommonAPI;
import eBayUtil.ExcelFileReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class ExcelFileReaderTest extends ExcelFileReader {

    ExcelFileReader excelFileReader;
    @BeforeMethod
    public void initElements(){
        excelFileReader = PageFactory.initElements(driver, ExcelFileReader.class);
    }
    @Test
    public void searchDataFoundTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){
        }.getClass().getEnclosingMethod().getName()));
        searchDataFound();
    }
}
