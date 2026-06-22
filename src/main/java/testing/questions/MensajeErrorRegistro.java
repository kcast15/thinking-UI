package testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Visibility;
import testing.ui.RegistroPage;

@Subject("el mensaje de error")
public class MensajeErrorRegistro implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return actor.asksFor(Visibility.of(RegistroPage.ERROR_MESSAGE));
    }

    public static MensajeErrorRegistro semuestra() {
        return new MensajeErrorRegistro();
    }
}