package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;

public class HomepageUtilities extends CommonAPI {

    public void typeOnTheBar(){
        typeOnsearchBar("#gh-ac", "Car Parts");
    }
    public void typeAndEnter(){
        typeAndEnter("#gh-ac", "Car Parts");
    }
    public void typeEnterNavigate(){
        typeAndEnter("#gh-ac", "Toys for girls");
        navigateBack();
        typeAndEnter("#gh-ac", "Toys for boys");
    }
    public void clickSearchButton(){
        clickOnSearchButton("#gh-btn");
    }
    public void searchByClickOnSearchButton(){
        searchByClickOnSearchButton("#gh-ac", "Books");
        clickSearchButton();
    }
}
