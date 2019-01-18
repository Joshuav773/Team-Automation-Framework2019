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
    public void selectAntiquesFromDropDownTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectAntiquesFromDropDown();
    }
    @Test
    public void selectArtFromDropDwonTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectArtFromDropDwon();
    }
    @Test
    public void selectBabyFromDropDownTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectBabyFromDropdown();
    }
    @Test
    public void selectBooksFromDropDownTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectBooksFromDropDown();
    }
    @Test
    public void selectBusinessAndIndusrialFromDropDrownTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectBusinessAndIndusrialFromDropDrown();
    }
    @Test
    public void selectCamerasAndPhotoFromDropDownTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectCamerasAndFotoFromDropDown();
    }
    @Test
    public void selectCellPhonesAndAccesoriesTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectCellPhonesAndAccesoriesFromDropDown();
    }
    @Test
    public void selectClothingShoesAndAccesoriesTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        selectClothingShoesAndAccesoriesFromDropDown();
    }
}
