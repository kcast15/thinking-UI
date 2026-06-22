package testing.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import testing.questions.MensajeErrorLogin;
import testing.questions.MensajeSuccessCrearContacto;
import testing.questions.MensajeSuccessLogin;
import testing.tasks.CrearContactoConDatos;
import testing.tasks.EditarContactoConDatos;
import testing.tasks.LoginConDatos;
import testing.ui.CrearContactoPage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class editarContacto {
    public static final String PAGE_URL = "pages.url";
    @Given("el usuario tiene un contacto existente")
    public void elUsuarioTieneUnContactoExistente() {
        theActorInTheSpotlight().wasAbleTo(Open.browserOn().thePageNamed(PAGE_URL));
        theActorInTheSpotlight().wasAbleTo(LoginConDatos.conDatos("ana.nieta@test.com", "fidsifa78"));
    }

    @When("modifica los datos del contacto")
    public void modificaLosDatosDelContacto() {
        theActorInTheSpotlight().attemptsTo(
                EditarContactoConDatos.conDatos("AFOA", "CAST", "1990-01-01", "k@345.edu", "1234567890", "Calle123", "APT28", "San Diego", "Inventado", "12345", "Canada"));
    }

    @Then("los cambios se guardan correctamente")
    public void losCambiosSeGuardanCorrectamente() {
        theActorInTheSpotlight().asksFor(MensajeSuccessCrearContacto.semuestra());
    }

    @When("deja campos obligatorios vacíos")
    public void dejaCamposObligatoriosVacíos() {
        theActorInTheSpotlight().attemptsTo(
                EditarContactoConDatos.conDatos("", "", "1990-01-01", "k@345", "1234567890", "Calle123", "APT28", "San Diego", "Inventado", "12345", "Canada"));
    }
}
