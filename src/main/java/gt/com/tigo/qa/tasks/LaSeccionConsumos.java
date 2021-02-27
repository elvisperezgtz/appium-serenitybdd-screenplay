package gt.com.tigo.qa.tasks;

import gt.com.tigo.qa.userinterfaces.HomeAppUI;
import gt.com.tigo.qa.userinterfaces.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Step;

import static java.time.Duration.ofSeconds;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LaSeccionConsumos implements Task {
    private String tipoLinea;
    @Override
    @Step("{0} ingresa a la seccion de consumos")

    public <T extends Actor> void performAs(T actor) {
        tipoLinea = LoginUI.LISTADO_LINEA.resolveFor(theActorInTheSpotlight()).getText().split(" - ")[0];
        if (tipoLinea.equals("Prepago")) {
            theActorInTheSpotlight().attemptsTo(Click.on(HomeAppUI.BOTON_DETALLE_PRE));
        }
        else {
            theActorInTheSpotlight().attemptsTo(Click.on(HomeAppUI.BOTON_DETALLES_POS));
            theActorInTheSpotlight().attemptsTo(
                    Ensure.that(HomeAppUI.BOTON_DETALLES_INTERNET.waitingForNoMoreThan(ofSeconds(3))).isDisplayed());
        }
    }

}
