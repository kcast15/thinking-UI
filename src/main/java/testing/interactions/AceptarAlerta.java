package testing.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AceptarAlerta implements Interaction {

    private static final Duration TIEMPO_ESPERA = Duration.ofSeconds(5);

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            WebDriverWait wait = new WebDriverWait(
                    ThucydidesWebDriverSupport.getDriver(),
                    TIEMPO_ESPERA
            );

            // Esperar y cambiar el contexto a la alerta
            Alert alerta = wait.until(ExpectedConditions.alertIsPresent());

            // Pausa pequeña para asegurar que la alerta esté completamente lista
            Thread.sleep(500);

            // Aceptar la alerta
            alerta.accept();

        } catch (NoAlertPresentException e) {
            System.out.println("No se encontró alerta para aceptar");
            throw new IllegalStateException("La alerta no se encontró en el tiempo especificado", e);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Se interrumpió la espera de la alerta", e);
        }
    }

    public static AceptarAlerta confirmacion() {
        return Tasks.instrumented(AceptarAlerta.class);
    }
}