import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deneme {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();


        By usernameBy = By.id("L-UserNameField");
        System.out.println(">>> "+usernameBy);
        driver.get("https://www.gittigidiyor.com");
        System.out.println(driver.getTitle());
        /*
        WebElement username= driver.findElement(By.id("L-UserNameField"));
        username.click();
        username.sendKeys("Mert Deveci");
        */




        /*
        WebElement username2 = driver.findElement(By.id(usernameBy.toString()));
        System.out.println(">> "+ username2.getAttribute("value"));
        */
    }
}
