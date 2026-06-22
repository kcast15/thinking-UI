package testing.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Visibility;
import testing.ui.LoginPage;
import testing.ui.RegistroPage;

@Subject("el mensaje de error")
public class MensajeErrorLogin implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return actor.asksFor(Visibility.of(LoginPage.ERROR_MESSAGE));
    }

    public static MensajeErrorLogin semuestra() {
        return new MensajeErrorLogin();
    }
}