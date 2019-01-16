package eBaytests;

import base.CommonAPI;
import eBayUtil.Purchase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class PurchseTest extends Purchase {

    Purchase purchase;

    @BeforeMethod
    public void initElements(){
        purchase = PageFactory.initElements(driver, Purchase.class);
    }
    @Test
    public void purchaseAnItemTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        purchaseAnItem();
    }
    @Test
    public void addItemToCartTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        addItemToCart();
    }
}
