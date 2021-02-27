package gt.com.tigo.qa.tasks;

import gt.com.tigo.qa.userinterfaces.HomeAppUI;
import gt.com.tigo.qa.utils.actions.actions;
import gt.com.tigo.qa.utils.enums.Direccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Step;

import static java.time.Duration.ofSeconds;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LaSeccion implements Task {
    private String tipoLLamada;

    public LaSeccion(String tipoLLamada) {
        this.tipoLLamada = tipoLLamada;
    }

    //TODO mejorar el step
    @Override
    @Step("{0} va a la seccion ")
    public <T extends Actor> void performAs(T actor) {

        actions.deslizaHacia(Direccion.ABAJO,
                HomeAppUI.CARD_LLAMADAS.resolveFor(theActorInTheSpotlight()),
                BrowseTheWeb.as(theActorInTheSpotlight()).getDriver());
        switch (tipoLLamada){
            case "Detalles de Llamadas a Tigo":
                theActorInTheSpotlight().attemptsTo(
                        Ensure.that(HomeAppUI.TITULO_DETALLES.waitingForNoMoreThan(ofSeconds(10))).isDisplayed());
                theActorInTheSpotlight().attemptsTo(Click.on(HomeAppUI.BOTON_DETALLES_LLAMADAS_TIGO));
                break;

            case "Detalles de Llamadas a otras operadoras":
                actions.deslizaHacia(Direccion.ABAJO,
                        HomeAppUI.BOTON_DETALLES_LLAMADAS_OTROS.resolveFor(theActorInTheSpotlight()),
                        BrowseTheWeb.as(theActorInTheSpotlight()).getDriver());
                theActorInTheSpotlight().attemptsTo(
                        Ensure.that(HomeAppUI.TITULO_DETALLES.waitingForNoMoreThan(ofSeconds(10))).isDisplayed());
                theActorInTheSpotlight().attemptsTo(Click.on(HomeAppUI.BOTON_DETALLES_LLAMADAS_OTROS));
                break;

            case "Detalles de Llamadas":
                theActorInTheSpotlight().attemptsTo(
                        Ensure.that(HomeAppUI.TITULO_DETALLES.waitingForNoMoreThan(ofSeconds(10))).isDisplayed());
                theActorInTheSpotlight().attemptsTo(Click.on(HomeAppUI.BOTON_DETALLES_MINUTOS));
                break;
        }

    }


}
