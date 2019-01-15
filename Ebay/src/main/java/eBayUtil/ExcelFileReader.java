package eBayUtil;

import base.CommonAPI;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ExcelFileReader extends CommonAPI {

    @FindBy(css = "#gh-ac")public static WebElement searchBar;

        File file = new File("/Users/joshuasmba/Documents/amazon/Web-Automation-Framkework/Ebay/ExcelFile/Items.xlsx");
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

        int numOfRows = sheet1.getLastRowNum();

        public void searchDataFound(){
            for (int a = 0; a < numOfRows; a++){
                String data = sheet1.getRow(a).getCell(0).getStringCellValue();
                searchBar.sendKeys(data, Keys.ENTER);
                searchBar.clear();
            }
        }
}

