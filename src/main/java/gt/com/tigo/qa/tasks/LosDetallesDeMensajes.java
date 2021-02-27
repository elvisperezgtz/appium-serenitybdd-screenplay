package gt.com.tigo.qa.tasks;

import gt.com.tigo.qa.utils.actions.actions;
import gt.com.tigo.qa.utils.enums.Direccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static gt.com.tigo.qa.userinterfaces.HomeAppUI.BOTON_DETALLES_MENSAJES;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LosDetallesDeMensajes implements Task {
    @Override
    @Step("{0} selecciona la card ver detalles mensajes")
    public <T extends Actor> void performAs(T actor) {
        actions.deslizaHacia(Direccion.ABAJO,
                BOTON_DETALLES_MENSAJES.resolveFor(theActorInTheSpotlight()),
                BrowseTheWeb.as(theActorInTheSpotlight()).getDriver());
        actor.attemptsTo(Click.on(BOTON_DETALLES_MENSAJES));
    }


}
