package testing.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target EMAIL_INPUT = Target.the("campo email")
            .located(By.id("email"));

    public static final Target PASSWORD_INPUT = Target.the("campo password")
            .located(By.id("password"));

    public static final Target LOGIN_BUTTON = Target.the("botón login")
            .located(By.id("submit"));

    public static final Target SUCCESS_MESSAGE = Target.the("mensaje de éxito")
            .located(By.id("logout"));

    public static final Target ERROR_MESSAGE = Target.the("mensaje de error")
            .located(By.id("error"));
}
