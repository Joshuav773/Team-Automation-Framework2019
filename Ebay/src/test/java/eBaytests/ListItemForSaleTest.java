package eBaytests;

import eBayUtil.ListItemForSale;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ListItemForSaleTest extends ListItemForSale {

    ListItemForSale listItemForSale;

    @BeforeMethod
    public void initElements(){
        listItemForSale = PageFactory.initElements(driver, ListItemForSale.class);
    }
    @Test
    public void listItemForSaleTest(){
        listItemForSale();
    }
}
