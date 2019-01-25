package eBayUtil;

import base.CommonAPI;
import org.apache.log4j.BasicConfigurator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ExcelFileReader extends CommonAPI {

    @FindBy(css = "#gh-ac")public static WebElement searchBar;

    File file = new File("/Users/joshuasmba/Documents/MyGroupProject/Web-Automation-Framkework/Ebay/ExcelFile/Items.xlsx");
    FileInputStream fileInputStream;
    {
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    XSSFWorkbook workbook;
    {
        try {
            workbook = new XSSFWorkbook(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    XSSFSheet sheet1 = workbook.getSheet("Sheet1");

    public void searchDataFound() {
        BasicConfigurator.configure();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        int numOfRows = sheet1.getLastRowNum();
        for (int a = 0; a <= numOfRows; a++) {
        String data = sheet1.getRow(a).getCell(0).getStringCellValue();
        System.out.println(data);
        searchBar.sendKeys(data, Keys.ENTER);
        searchBar.clear();
        }
    }
}

