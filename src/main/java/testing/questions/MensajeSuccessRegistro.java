package testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Visibility;
import testing.ui.RegistroPage;

@Subject("mensaje de Exitoso")
public class MensajeSuccessRegistro implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return actor.asksFor(Visibility.of(RegistroPage.SUCCESS_MESSAGE));
    }

    public static MensajeSuccessRegistro semuestra() {
        return new MensajeSuccessRegistro();
    }
}