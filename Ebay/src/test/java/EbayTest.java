import homepage.HomepageUtilities;
import org.testng.annotations.Test;

public class EbayTest extends HomepageUtilities {
    @Test
    public void test1(){
        typeOnTheBar();
    }
    @Test
    public void test2(){
        typeAndEnter();
    }
    @Test
    public void test3(){
        typeEnterNavigate();
    }
    @Test
    public void test4(){
        clickSearchButton();
    }
}
