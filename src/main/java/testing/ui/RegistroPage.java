package testing.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroPage {

    public static final Target NEWREG_BUTTON = Target.the("botón registro")
            .located(By.id("signup"));

    public static final Target NOMBRE_INPUT = Target.the("campo nombre")
            .located(By.id("firstName"));

    public static final Target LAST_NAME = Target.the("campo email")
            .located(By.id("lastName"));

    public static final Target EMAIL_INPUT = Target.the("campo email")
            .located(By.id("email"));

    public static final Target PASSWORD_INPUT = Target.the("campo password")
            .located(By.id("password"));

    public static final Target REGISTRARSE_BUTTON = Target.the("botón enviar")
            .located(By.id("submit"));

    public static final Target SUCCESS_MESSAGE = Target.the("mensaje de éxito")
            .located(By.id("logout"));

    public static final Target ERROR_MESSAGE = Target.the("mensaje de error")
            .located(By.id("error"));
}