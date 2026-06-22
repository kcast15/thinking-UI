package testing.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actors.OnStage;
import testing.questions.MensajeErrorCrearContacto;
import testing.questions.MensajeSuccessCrearContacto;
import testing.tasks.CrearContactoConDatos;
import testing.tasks.LoginConDatos;
import testing.ui.CrearContactoPage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class crearContacto {
    public static final String PAGE_URL = "pages.url";
    @Given("el usuario está logueado nombre")
    public void elUsuarioEstáLogueadoNombre() {
        theActorInTheSpotlight().wasAbleTo(Open.browserOn().thePageNamed(PAGE_URL));
        theActorInTheSpotlight().wasAbleTo(LoginConDatos.conDatos("ana.nieta@test.com", "fidsifa78"));

    }

    @When("ingresa {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string} y {string}")
    public void ingresaY(String firstName, String lastName, String birthdate, String email, String phone, String address1, String address2, String city, String state, String postalCode, String country) {
        theActorInTheSpotlight().attemptsTo(
                CrearContactoConDatos.conDatos(firstName, lastName, birthdate, email, phone, address1, address2, city, state, postalCode, country)
        );
    }

    @Then("el contacto se guarda correctamente")
    public void elContactoSeGuardaCorrectamente() {
        theActorInTheSpotlight().asksFor(MensajeSuccessCrearContacto.semuestra());
    }

    @Given("el usuario está logueado")
    public void elUsuarioEstáLogueado() {
        theActorInTheSpotlight().wasAbleTo(Open.browserOn().thePageNamed(PAGE_URL));
        theActorInTheSpotlight().wasAbleTo(LoginConDatos.conDatos("ana.nieta@test.com", "fidsifa78"));
    }

    @When("intenta crear un contacto sin datos")
    public void intentaCrearUnContactoSinDatos() {
        Click.on(CrearContactoPage.NEWCONTACT_BUTTON);
        theActorInTheSpotlight().attemptsTo(
                CrearContactoConDatos.conDatos("", "", "", "", "", "", "", "", "", "", "")
        );
    }

    @Then("se muestran errores de validación")
    public void seMuestranErroresDeValidación() {
        theActorInTheSpotlight().asksFor(MensajeErrorCrearContacto.semuestra());
    }

    @When("ingresa email inválido correo@")
    public void ingresaEmailInválidoCorreo() {
        Click.on(CrearContactoPage.NEWCONTACT_BUTTON);
        theActorInTheSpotlight().attemptsTo(
                CrearContactoConDatos.conDatos("Ana", "Nieta", "1990-01-01", "correo@", "1234567890", "Calle45", "APT2", "San Diego", "Inventado", "12345", "Peru")
        );

    }


}
