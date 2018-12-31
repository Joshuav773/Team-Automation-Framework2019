package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;

public class HomepageUtilities extends CommonAPI {

    public void typeOnTheBar(){
        typeOnsearchBar("#gh-ac", "Car Parts");
        cleanUp();
    }
    public void typeAndEnter(){
        typeAndEnter("#gh-ac", "Car Parts");
        cleanUp();
    }
    public void typeEnterNavigate(){
        typeAndEnter("#gh-ac", "Toys for girls");
        navigateBack();
        typeAndEnter("#gh-ac", "Toys for boys");
        cleanUp();
    }
    public void clickSearchButton(){
        clickOnSearchButton("#gh-btn");
    }
}
