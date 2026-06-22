package testing.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import testing.tasks.EliminarContactoConDatos;
import testing.ui.CrearContactoPage;
import net.serenitybdd.screenplay.actions.AcceptAlert;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class eliminarContacto {
    @When("elimina el contacto")
    public void eliminaElContacto() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(CrearContactoPage.MODIFICAR),
                Click.on(CrearContactoPage.ELIMINAR),
                AcceptAlert.theAlert()
        );

    }

    @Then("el contacto desaparece de la lista")
    public void elContactoDesapareceDeLaLista() {


    }

    @When("cancela la eliminación")
    public void cancelaLaEliminación() {
    }

    @Then("el contacto permanece en la lista")
    public void elContactoPermaneceEnLaLista() {
    }
}
