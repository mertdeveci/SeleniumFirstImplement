package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{
    private final By username = By.id("L-UserNameField");
    private final By password = By.id("L-PasswordField");

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void setUsername(String name){
        find(username).click();
        type(username, name);
    }


    public void setPassword(String ps) {
        find(password).click();
        type(password, ps);
    }
}
