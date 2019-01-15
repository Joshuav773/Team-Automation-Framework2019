package datadriven;

import eBayUtil.ExcelFileReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExcelFileReaderTest extends ExcelFileReader {

    ExcelFileReader excelFileReader;
    @BeforeMethod
    public void initElements(){
        excelFileReader = PageFactory.initElements(driver, ExcelFileReader.class);
    }
    @Test
    public void searchDataFoundTest(){
        searchDataFound();
    }
}
