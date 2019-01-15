package eBayUtil;

import Excel.ExcelReader;
import base.CommonAPI;

public class ExcelFileReader extends CommonAPI {

    public static void main(String[] args) {
        ExcelReader reader = new ExcelReader("/Users/joshuasmba/Documents/amazon/Web-Automation-Framkework/Ebay/ExcelFile/Items.xlsx");
        reader.getData(0,0,0);
        reader.getRowCount(0);
    }
    public void searchFromExcelFile(){

    }
}

