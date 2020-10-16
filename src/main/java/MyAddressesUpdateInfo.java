import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;

public class MyAddressesUpdateInfo {

    /*
       En la vista "YOUR ADDRESSES", se actualizan los datos:
        phone, phone_mobile,address1,company y alias
    */
    public static void updateAddressesInfo (String phone,
                                            String phone_mobile,
                                            String address1,
                                            String company,
                                            String alias) {
        WebDriver driver = WebDriverSupliter.getChromeDriver();

        driver.findElement(By.id("phone")).clear();
        driver.findElement(By.id("phone")).sendKeys(phone);

        driver.findElement(By.id("phone_mobile")).clear();
        driver.findElement(By.id("phone_mobile")).sendKeys(phone_mobile);

        driver.findElement(By.id("address1")).clear();
        driver.findElement(By.id("address1")).sendKeys(address1);

        driver.findElement(By.id("company")).clear();
        driver.findElement(By.id("company")).sendKeys(company);

        driver.findElement(By.id("alias")).clear();
        driver.findElement(By.id("alias")).sendKeys(alias);

        driver.findElement(By.cssSelector("#submitAddress > span")).click();
    }
}
