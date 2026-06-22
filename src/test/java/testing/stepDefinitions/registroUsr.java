package testing.stepDefinitions;

    import io.cucumber.java.en.And;
    import io.cucumber.java.en.Given;
    import io.cucumber.java.en.Then;
    import io.cucumber.java.en.When;
    import net.serenitybdd.screenplay.actions.Open;
    import net.serenitybdd.screenplay.actions.Click;
    import testing.questions.MensajeErrorRegistro;
    import testing.questions.MensajeSuccessRegistro;
    import testing.tasks.RegistrarseConDatos;
    import testing.ui.RegistroPage;

    import static net.serenitybdd.screenplay.actors.OnStage.*;
    import static org.assertj.core.api.Assertions.assertThat;

    public class registroUsr {
        private static final String PAGE_URL = "pages.url";

        @Given("el usuario navega a la página de registro")
        public void elUsuarioNavegaALaPáginaDeRegistro() {
            theActorInTheSpotlight().wasAbleTo(Open.browserOn().thePageNamed(PAGE_URL));
        }

        @When("ingresa {string},{string},{string} y {string}")
        public void ingresaY(String nombre, String apellido, String email, String password) {
            theActorInTheSpotlight().attemptsTo(
                    RegistrarseConDatos.conDatos(nombre, apellido, email, password)
            );
        }

        @Then("debe visualizar el mensaje de registro exitoso")
        public void debe_visualizar_el_mensaje_de_registro_exitoso()  {
            theActorInTheSpotlight().asksFor(MensajeSuccessRegistro.semuestra());
        }


    @Given("el usuario ya está registrado con email test@test.com")
    public void elUsuarioYaEstáRegistradoConEmailTestTestCom() {
        theActorInTheSpotlight().wasAbleTo(Open.browserOn().thePageNamed(PAGE_URL));

    }

    @When("intenta registrarse nuevamente con el mismo email")
    public void intentaRegistrarseNuevamenteConElMismoEmail() {
        Click.on(RegistroPage.NEWREG_BUTTON);
            theActorInTheSpotlight().attemptsTo(
                RegistrarseConDatos.conDatos("Test", "User", "juan.morales@test.com", "Test123*")
        );
    }

    @Then("se muestra un mensaje de error")
    public void seMuestraUnMensajeDeError() {
        theActorInTheSpotlight().asksFor(MensajeErrorRegistro.semuestra());
    }

    @Given("el usuario está en la página de registro")
    public void elUsuarioEstáEnLaPáginaDeRegistro() {
        theActorInTheSpotlight().wasAbleTo(Open.browserOn().thePageNamed(PAGE_URL));
    }

    @When("ingresa un email inválido correo")
    public void ingresaUnEmailInválidoCorreo() {
        Click.on(RegistroPage.NEWREG_BUTTON);
        theActorInTheSpotlight().attemptsTo(
                    RegistrarseConDatos.conDatos("Test", "User", "correo_invalido", "Test123*")
            );
    }

    @Then("se muestra error de validación")
    public void seMuestraErrorDeValidación() {
        theActorInTheSpotlight().asksFor(MensajeErrorRegistro.semuestra());
    }

    @When("envía el formulario sin completar datos")
    public void envíaElFormularioSinCompletarDatos() {
        Click.on(RegistroPage.NEWREG_BUTTON);
        theActorInTheSpotlight().attemptsTo(
                RegistrarseConDatos.conDatos("", "", "", "")
        );
    }

    @Then("se muestran mensajes de campos requeridos")
    public void seMuestranMensajesDeCamposRequeridos() {
        theActorInTheSpotlight().asksFor(MensajeErrorRegistro.semuestra());
    }

    @When("ingresa password {string}")
    public void ingresaPasswordPassword(String password) {
        Click.on(RegistroPage.NEWREG_BUTTON);
        theActorInTheSpotlight().attemptsTo(
                RegistrarseConDatos.conDatos("Test", "User", "qewrqwe@test.com", password));
    }
    }
