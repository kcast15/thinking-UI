package testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import testing.ui.RegistroPage;

public class RegistrarseConDatos implements Task {
    private final String nombre;
    private final String apellido;
    private final String email;
    private final String password;

    public RegistrarseConDatos(String nombre, String apellido, String email, String password) {
        this.nombre = nombre;
        this.apellido=apellido;
        this.email = email;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(RegistroPage.NEWREG_BUTTON),
            Enter.theValue(nombre).into(RegistroPage.NOMBRE_INPUT),
            Enter.theValue(email).into(RegistroPage.EMAIL_INPUT),
            Enter.theValue(apellido).into(RegistroPage.LAST_NAME),
            Enter.theValue(password).into(RegistroPage.PASSWORD_INPUT),
                Click.on(RegistroPage.REGISTRARSE_BUTTON)
        );
    }

    public static RegistrarseConDatos conDatos(String nombre,String apellido, String email, String password) {
        return new RegistrarseConDatos(nombre,apellido, email, password);
    }
}