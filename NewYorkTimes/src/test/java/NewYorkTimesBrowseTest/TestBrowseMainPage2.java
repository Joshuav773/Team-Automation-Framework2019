package NewYorkTimesBrowseTest;

import NewYorkTimesBrowse.BrowseMainPage2;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestBrowseMainPage2 extends BrowseMainPage2 {

    BrowseMainPage2 objBrowseMainPage2;

    @BeforeMethod
    public void initElements(){
        objBrowseMainPage2 = PageFactory.initElements(driver, BrowseMainPage2.class);
    }
    @Test
    public void stylesSectionTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        stylesSection();
    }
    @Test
    public void televisionSectionTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        televisionSection();
    }
    @Test
    public void photoSectionTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        photoSection();
    }
    @Test
    public void correctionsSectionTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        correctionsSection();
    }
    @Test
    public void automobileSectionTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        automobileSection();
    }
    @Test
    public void multimediaSectionTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        multimediaSection();
    }
    @Test
    public void theaterSectionTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        theaterSection();
    }
    @Test
    public void weddingsSectionTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        weddingsSection();
    }
    @Test
    public void crosswordsSectionTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        crosswordsSection();
    }
    @Test
    public void puzzleSectionTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        puzzleSection();
    }
}
