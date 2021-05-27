package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(Logger.class)
public class BaseTest {
    WebDriver driver ;

    @BeforeAll
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.gittigidiyor.com.tr/");
        driver.manage().window().maximize();
    }

    @AfterAll
    public void tearDown(){
        driver.quit();
    }
}
