package NewYorkTimesBrowseTest;

import NewYorkTimesBrowse.SelectArticles;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestSelectArticles extends SelectArticles {
    SelectArticles objSelectArticles;

    @BeforeMethod
    public void initElements() {
        objSelectArticles = PageFactory.initElements(driver, SelectArticles.class);
    }
    @Test
    public void realEstateTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        realEstate();
    }
    @Test
    public void highEndTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        highEnd();
    }
    @Test
    public void generalPageTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        generalPage();
    }
    @Test
    public void tMagazineTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        tMagazine();
    }
    @Test
    public void designInteriorsTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        designInteriors();
    }
    @Test
    public void opinionPageTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        opinionPage();
    }
    @Test
    public void culturePageTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        culturePage();
    }
    @Test
    public void lettersPageTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        lettersPage();
    }
    @Test
    public void editorialsPageTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        editorialsPage();
    }
    @Test
    public void popCultureTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        popCulture();
    }
}
