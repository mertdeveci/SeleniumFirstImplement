package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductsPage;

public class GittigidiyorTest extends BaseTest {

    HomePage homePage;
    ProductsPage producksPage;
    LoginPage loginPage;


    @Test
    @Order(1)
    @DisplayName("Sayfa açıldı.")
    public void isPageOpened(){
        homePage=new HomePage(driver);
        Assertions.assertEquals("GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi", homePage.Title());
    }


    @Test
    @Order(2)
    public void checkLogin(){
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);

        homePage.gotoLoginScreen();
       //  loginPage.setUsername("mertdeveci");
        // loginPage.setPassword("123");

    }


    @Test
    public void pagingControl(){
        /*
        homePage=new HomePage(driver);
        producksPage=new ProducksPage(driver);
        homePage.searchBox("Bilgisayar");
        // Artık ProductsPage'tesin
        producksPage.click_page_number(2);
        */



    }


    @Test
    public void controlCardAndPage(){

    }

    @Test
    public void controlByIncreasing(){

    }

    @Test
    public void isCardEmpty(){

    }





}
