package ebayTests;

import ebayUtil.AllCategoriesDropDown;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownTests extends AllCategoriesDropDown {

    AllCategoriesDropDown allCategoriesDropDown;

    @BeforeMethod
    public void initElements(){
        allCategoriesDropDown = PageFactory.initElements(driver, AllCategoriesDropDown.class);
    }

    @Test
    public void selectAntiquesFromDropDownTest(){
        selectAntiquesFromDropDown();
    }
    @Test
    public void selectArtFromDropDwonTest(){
        selectArtFromDropDwon();
    }
    @Test
    public void selectBabyFromDropDownTest(){
        selectBabyFromDropdown();
    }
    @Test
    public void selectBooksFromDropDownTest(){

    }
}
