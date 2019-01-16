package eBaytests;

import base.CommonAPI;
import eBayUtil.ListItemForSale;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class ListItemForSaleTest extends ListItemForSale {

    ListItemForSale listItemForSale;

    @BeforeMethod
    public void initElements(){
        listItemForSale = PageFactory.initElements(driver, ListItemForSale.class);
    }
    @Test
    public void listItemForSaleTest() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        listItemForSale();
    }
}
