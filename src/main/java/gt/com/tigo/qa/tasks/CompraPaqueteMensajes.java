package gt.com.tigo.qa.tasks;

import gt.com.tigo.qa.userinterfaces.CompraUI;
import gt.com.tigo.qa.userinterfaces.HomeAppUI;
import gt.com.tigo.qa.utils.actions.actions;
import gt.com.tigo.qa.utils.enums.Direccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class CompraPaqueteMensajes implements Task {

    private String paquete;
    private String nombrepaquetigo;

    public CompraPaqueteMensajes(String paquete, String nombrepaquetigo){
        this.paquete = paquete;
        this.nombrepaquetigo = nombrepaquetigo;
    }

    @Override
    @Step("{0} el usuario selecciona el #paquete y #nombrepaquetigo")
    public <T extends Actor> void performAs(T actor) {
        actions.deslizaHacia(Direccion.ABAJO,
                HomeAppUI.BOTON_COMPRAR_MENSAJES.resolveFor(theActorInTheSpotlight()),
                BrowseTheWeb.as(theActorInTheSpotlight()).getDriver());
        theActorInTheSpotlight().attemptsTo(Click.on(HomeAppUI.BOTON_COMPRAR_MENSAJES));
        theActorInTheSpotlight().attemptsTo(Click.on(CompraUI.PESTANA_MINUTO_MENSAJES));
        actor.attemptsTo(Click.on(CompraUI.PAQUETE.of(paquete)));
        actor.attemptsTo(Click.on(CompraUI.NOMBREPAQUETE.of(nombrepaquetigo)));
    }

    public static CompraPaqueteMensajes paquetes (String paquete, String nombrepaquetigo){
        return Tasks.instrumented(CompraPaqueteMensajes.class,paquete, nombrepaquetigo);
    }
}
