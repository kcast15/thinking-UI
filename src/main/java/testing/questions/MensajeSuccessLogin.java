package testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Visibility;
import testing.ui.LoginPage;
import testing.ui.RegistroPage;

@Subject("mensaje de Exitoso")
public class MensajeSuccessLogin implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return actor.asksFor(Visibility.of(LoginPage.SUCCESS_MESSAGE));
    }

    public static MensajeSuccessLogin semuestra() {
        return new MensajeSuccessLogin();
    }
}