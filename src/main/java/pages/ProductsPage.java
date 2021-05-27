package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductsPage extends BasePage{
    By page_numbers = new By.ByCssSelector(".pager a");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public void click_page_number(int page_no){
        List<WebElement>pages =findAll(page_numbers);

        try{
            pages.get(page_no-1).click();
        }catch (Exception e){
            System.out.println("Hata ! "+e);
        }


    }
}
