import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverSupliter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpdateAddressesTest {

    private WebDriver driver;/*Se valida el cambio realizado. Se compara el valor del alias actualizado*/

    @BeforeEach
    public void setUp() {
        driver = WebDriverSupliter.getChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        WebDriverSupliter.quitDriver();
    }

    @Test
    public void updateAddresses() {
        Authentication.login("fernandocotrena@gmail.com", "admin123456");
        MyAddressesSection.goToAddressesUpdate();
        MyAddressesUpdateInfo.updateAddressesInfo(
                "123456789","987654321",
                "Street 443", "UTN", "UTN AUTOMATION");

        String valueToAssert = ValidateAfterUpdate.validate();
        assertEquals("UTN AUTOMATION", valueToAssert);
    }

}
