import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;

public class Authentication {

    /*Se inicia sesión en la aplicación*/
    public static void login(String email, String password) {
        WebDriver driver = WebDriverSupliter.getChromeDriver();

        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        // "fernandocotrena@gmail.com"  - "admin123456"
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
    }
}
