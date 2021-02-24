package gt.com.tigo.qa.tasks;

import gt.com.tigo.qa.userinterfaces.EncuestaUI;
import gt.com.tigo.qa.userinterfaces.ExitosaUI;
import gt.com.tigo.qa.userinterfaces.HomeAppUI;
import gt.com.tigo.qa.utils.actions.actions;
import gt.com.tigo.qa.utils.enums.Direccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class VerificarEncolado implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
       /* if (EncuestaUI.BOTON_CERRAR.resolveFor(actor).isVisible()) {
            actor.attemptsTo(
                    Click.on(EncuestaUI.BOTON_CERRAR)
            );
        }
        actor.attemptsTo(
                Ensure.that(ExitosaUI.DETALLES_DE_LA_TRANSACCION).isDisplayed(),
                Click.on(ExitosaUI.VOLVER_AL_INICIO)
        );*/

        if (HomeAppUI.PAQUETE_ACTIVO_INTERNET.resolveFor(actor).isVisible()) {
            actions.deslizaHacia(Direccion.ABAJO,
                    HomeAppUI.CARD_MINUTOS.resolveFor(theActorInTheSpotlight()),
                    BrowseTheWeb.as(theActorInTheSpotlight()).getDriver());

                    }
            }

    public static VerificarEncolado compra() {
        return Tasks.instrumented(VerificarEncolado.class);
    }
}
