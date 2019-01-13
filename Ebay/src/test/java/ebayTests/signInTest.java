package ebayTests;

import eBayUtil.SignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class signInTest extends SignIn {

    public SignIn signIn;

    @BeforeMethod
    public void initElements(){
        signIn = PageFactory.initElements(driver,SignIn.class);
    }
    @Test
    public void signInTest(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signIn();
    }
    @Test
    public void registerNewUserTest(){
       registerNewUser();
    }
}
