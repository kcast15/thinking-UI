package testing.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import testing.questions.MensajeErrorLogin;
import testing.questions.MensajeSuccessLogin;
import testing.tasks.LoginConDatos;


import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class loginUsr {
    private static final String PAGE_URL = "pages.url";
    @Given("el usuario está registrado con {string} y {string}")
    public void elUsuarioEstáRegistradoConY(String email, String  password) {
        theActorInTheSpotlight().wasAbleTo(Open.browserOn().thePageNamed(PAGE_URL));
        theActorInTheSpotlight().attemptsTo(LoginConDatos.conDatos(email, password));
    }

    @When("ingresa credenciales válidas")
    public void ingresaCredencialesVálidas() {
    }

    @Then("accede al sistema correctamente")
    public void accedeAlSistemaCorrectamente() {
        theActorInTheSpotlight().asksFor(MensajeSuccessLogin.semuestra());
    }

    @Given("el usuario está registrado")
    public void elUsuarioEstáRegistrado() {
        theActorInTheSpotlight().wasAbleTo(Open.browserOn().thePageNamed(PAGE_URL));
    }

    @When("ingresa password incorrecto")
    public void ingresaPasswordIncorrecto() {
        theActorInTheSpotlight().attemptsTo(LoginConDatos.conDatos("juan.morales@test.com", "WrongPassword123*"));
    }

    @Then("se muestra mensaje de error")
    public void seMuestraMensajeDeError() {
        theActorInTheSpotlight().asksFor(MensajeErrorLogin.semuestra());
    }

    @Given("el usuario no está registrado")
    public void elUsuarioNoEstáRegistrado() {
        theActorInTheSpotlight().wasAbleTo(Open.browserOn().thePageNamed(PAGE_URL));
    }

    @When("intenta iniciar sesión")
    public void intentaIniciarSesión() {
        theActorInTheSpotlight().attemptsTo(LoginConDatos.conDatos("kenny@test.com", "WrongPassword123*"));
    }

    @Then("se muestra error de autenticación")
    public void seMuestraErrorDeAutenticación() {
        theActorInTheSpotlight().asksFor(MensajeErrorLogin.semuestra());
    }

    @Given("el usuario está en la página de login")
    public void elUsuarioEstáEnLaPáginaDeLogin() {
        theActorInTheSpotlight().wasAbleTo(Open.browserOn().thePageNamed(PAGE_URL));
    }

    @When("envía el formulario vacío")
    public void envíaElFormularioVacío() {
        theActorInTheSpotlight().attemptsTo(LoginConDatos.conDatos("", ""));
    }

    @Then("se muestran validaciones de campos")
    public void seMuestranValidacionesDeCampos() {
        theActorInTheSpotlight().asksFor(MensajeErrorLogin.semuestra());
    }

    @Given("el usuario ha iniciado sesión correctamente")
    public void elUsuarioHaIniciadoSesiónCorrectamente() {
        theActorInTheSpotlight().wasAbleTo(Open.browserOn().thePageNamed(PAGE_URL));
        theActorInTheSpotlight().attemptsTo(LoginConDatos.conDatos(" juan.morales@test.com", "233241235"));
    }

    @When("refresca la página")
    public void refrescaLaPágina() {
        ThucydidesWebDriverSupport.getDriver().navigate().refresh();

    }

    @Then("permanece autenticado")
    public void permaneceAutenticado() {
        theActorInTheSpotlight().asksFor(MensajeSuccessLogin.semuestra());
    }


}
