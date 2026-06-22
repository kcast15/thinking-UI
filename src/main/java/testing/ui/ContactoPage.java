package testing.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ContactoPage {

    public static final Target CONTACTO_POR_EMAIL = Target.the("contacto con email {0}")
            .located(By.xpath("//*[contains(normalize-space(), '{0}')]"));
}
