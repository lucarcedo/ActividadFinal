import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;

public class MyAddressesSection {

    /*Se accede a la vista a la opcion MY ADDRESSES y luego a la opcion Update*/
    public static void goToAddressesUpdate () {
        WebDriver driver = WebDriverSupliter.getChromeDriver();
        driver.findElement(By.cssSelector("li:nth-child(3) > a > span:nth-child(2)")).click();
        driver.findElement(By.cssSelector(".address_update .icon-chevron-right")).click();
    }

}
