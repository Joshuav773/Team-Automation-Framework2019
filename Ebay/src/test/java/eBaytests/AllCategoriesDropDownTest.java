package eBaytests;

import base.CommonAPI;
import eBayUtil.AllCategoriesDropDown;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class AllCategoriesDropDownTest extends AllCategoriesDropDown {

    AllCategoriesDropDown allCategoriesDropDown;

    @BeforeMethod
    public void initElements(){
        allCategoriesDropDown = PageFactory.initElements(driver, AllCategoriesDropDown.class);
    }
    @Test
    public void antiquesTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectAntiquesFromDropDown();
    }
    @Test
    public void artTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectArtFromDropDwon();
    }
    @Test
    public void babyTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectBabyFromDropdown();
    }
    @Test
    public void booksTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectBooksFromDropDown();
    }
    @Test
    public void businessAndIndusrialTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectBusinessAndIndusrialFromDropDrown();
    }
    @Test
    public void camerasAndPhotoTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectCamerasAndFotoFromDropDown();
    }
    @Test
    public void cellPhonesAndAccesoriesTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectCellPhonesAndAccesoriesFromDropDown();
    }
    @Test
    public void clothingShoesAndAccesoriesTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectClothingShoesAndAccesoriesFromDropDown();
    }
}
