package testing.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import testing.questions.MensajeSuccessCrearContacto;
import testing.tasks.EliminarContactoConDatos;
import testing.ui.ContactoPage;
import testing.ui.CrearContactoPage;
//import net.serenitybdd.screenplay.actions.AcceptAlert;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class eliminarContacto {
    @When("elimina el contacto")
    public void eliminaElContacto() {
        theActorInTheSpotlight().attemptsTo(
                EliminarContactoConDatos.conDatos()
        );

    }
    @Then("el contacto con email no debe estar en la lista")
    public void el_contacto_con_email_no_debe_estar_en_la_lista() {
        theActorInTheSpotlight().should(seeThat(MensajeSuccessCrearContacto.semuestra()));
    }
}
