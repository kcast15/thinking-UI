package testing.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearContactoPage {

    public static final Target NEWCONTACT_BUTTON = Target.the("botón nuevo contacto")
            .located(By.id("add-contact"));

    public static final Target FIRSTNAME_INPUT = Target.the("campo nombre")
            .located(By.id("firstName"));

    public static final Target LASTNAME_INPUT = Target.the("campo apellido")
            .located(By.id("lastName"));

    public static final Target BIRTHDATE_INPUT = Target.the("campo fecha de nacimiento")
            .located(By.id("birthdate"));

    public static final Target EMAIL_INPUT = Target.the("campo email")
            .located(By.id("email"));

    public static final Target PHONE_INPUT = Target.the("campo teléfono")
            .located(By.id("phone"));

    public static final Target ADDRESS1_INPUT = Target.the("campo dirección 1")
            .located(By.id("street1"));

    public static final Target ADDRESS2_INPUT = Target.the("campo dirección 2")
            .located(By.id("street2"));

    public static final Target CITY_INPUT = Target.the("campo ciudad")
            .located(By.id("city"));

    public static final Target STATE_INPUT = Target.the("campo estado")
            .located(By.id("stateProvince"));

    public static final Target POSTALCODE_INPUT = Target.the("campo código postal")
            .located(By.id("postalCode"));

    public static final Target COUNTRY_INPUT = Target.the("campo país")
            .located(By.id("country"));

    public static final Target SAVE_BUTTON = Target.the("botón guardar")
            .located(By.id("submit"));

    public static final Target MODIFICAR = Target.the("Editar contacto")
            .located(By.xpath("/html/body/div/div/table/tr[1]/td[2]"));

    public static final Target MODIFICAR_BUTTON = Target.the("Editar contacto Button")
            .located(By.id("edit-contact"));

    public static final Target ELIMINAR = Target.the("Eliminar contacto")
            .located(By.id("delete"));

    public static final Target SUCCESS_MESSAGE = Target.the("mensaje de éxito")
            .located(By.xpath("//*[normalize-space()='Contact List']"));

    public static final Target ERROR_MESSAGE = Target.the("mensaje de error")
            .located(By.id("error"));
}
