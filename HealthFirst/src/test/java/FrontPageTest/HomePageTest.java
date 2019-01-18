package FrontPageTest;

import FrontPage.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class HomePageTest extends HomePage {
    HomePage objHomePage;

    @BeforeMethod
    public void initializePageObjects() {

        objHomePage = PageFactory.initElements(driver, HomePage.class);
    }
}
