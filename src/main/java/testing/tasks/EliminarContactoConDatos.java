package testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.AcceptAlert;
import testing.ui.CrearContactoPage;


public class EliminarContactoConDatos implements Task    {

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Click.on(CrearContactoPage.MODIFICAR),
                Click.on(CrearContactoPage.ELIMINAR),
                AcceptAlert.acceptAlert()
        );
    }
    public static EliminarContactoConDatos conDatos() {
        return new EliminarContactoConDatos();
    }
}
