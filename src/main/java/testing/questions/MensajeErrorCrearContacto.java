package testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Visibility;
import testing.ui.CrearContactoPage;
import testing.ui.LoginPage;

@Subject("el mensaje de error")
public class MensajeErrorCrearContacto implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return actor.asksFor(Visibility.of(CrearContactoPage.ERROR_MESSAGE));
    }

    public static MensajeErrorCrearContacto semuestra() {
        return new MensajeErrorCrearContacto();
    }
}