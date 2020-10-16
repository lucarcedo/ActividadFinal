import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidateAfterUpdate {

    /*Se valida el cambio realizado. Se compara el valor del alias actualizado*/
    public static String validate () {
        WebDriver driver = WebDriverSupliter.getChromeDriver();
        String value = driver.findElement(By.cssSelector(".page-subheading")).getText();

        return value;
    }

}
