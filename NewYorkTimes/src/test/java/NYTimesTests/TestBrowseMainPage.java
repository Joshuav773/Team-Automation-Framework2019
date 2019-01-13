package NYTimesTests;

import NYTimesBrowse.BrowseMainPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestBrowseMainPage extends BrowseMainPage {

    BrowseMainPage objBrowseMainPage;

    @BeforeMethod
    public void initElements(){
        objBrowseMainPage = PageFactory.initElements(driver, BrowseMainPage.class);
    }

    @Test
    public void worldClickTest(){
        worldClick();
    }
    @Test
    public void americasClickTest(){
        americasClick();
    }
    @Test
    public void homeButtonTest(){
        homeButton();
    }
    @Test
    public void usClickTest(){
        usClick();
    }
    @Test
    public void articleClickTest(){
        articleClick();
    }
    @Test
    public void sportsClickTest(){
        sportsClick();
    }
    @Test
    public void nflSectionTest(){
        nflSection();
    }
    @Test
    public void techSectionTest(){
        techSection();
    }
    @Test
    public void scienceSectionTest(){
        scienceSection();
    }
    @Test
    public void politicsSectionTest(){
        politicsSection();
    }
    @Test
    public void nySectionTest(){
        nySection();
    }
    @Test
    public void frontPageTest(){
        frontPage();
    }
    @Test
    public void contactButtonTest(){
        contactButton();
    }
    @Test
    public void chatButtonTest(){
        chatButton();
    }
    @Test
    public void backHomeTest(){
        backHome();
    }

}
