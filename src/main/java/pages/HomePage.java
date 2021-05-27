package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    By searchBox = By.name("k");
    By searchButton = new By.ByCssSelector("button[data-cy='search-find-button']");

    By loginButton = new By.ByCssSelector("gekhq4-4 egoSnI");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public String Title(){
        return getTitle();
    }


    public void gotoLoginScreen(){
        /*
        find(loginButton).click();
        */

    }

    public void searchBox(String wanted){
        find(searchBox).click();
        type(searchBox, wanted);
        find(searchButton).click();
    }






}
