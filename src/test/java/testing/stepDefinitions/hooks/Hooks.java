package testing.stepDefinitions.hooks;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static final Actor ACTOR = Actor.named("user");

    @Before(order = 0)
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Before(order = 1)
    public void setUpBrowser(Scenario scenario) {
        WebDriverManager.chromedriver().setup(); // Esto descarga el driver si no está
        WebDriver driver = new ChromeDriver();
        OnStage.theActorCalled("Usuario").can(BrowseTheWeb.with(driver));

        // Guardamos el nombre del escenario en la sesión de Serenity (opcional)
        Serenity.setSessionVariable("ScenarioName").to(scenario.getName());
    }
//
//    @Before
//    public void ConfigurarElEscenarioWeb(Scenario scenario) {
//        Serenity.setSessionVariable("ScenarioName").to(scenario.getName());
//    }
//
//    @After
//    public void VerificarCasoDePrueba(Scenario scenario) {
//        if (getProperty("environment").startsWith("BS")) {
//            JavascriptExecutor jse = (JavascriptExecutor) getDriver();
//            if (scenario.isFailed()) {
//                jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\","
//                        + " \"arguments\": {\"status\": \"failed\", \"reason\": \"TestFailed\"}}");
//            } else {
//                jse.executeScript(
//                        "browserstack_executor: {\"action\": \"setSessionStatus\","
//                                + " \"arguments\": {\"status\": \"passed\", \"reason\": \"TestPassed\"}}");
//            }
//        }
//    }
}
