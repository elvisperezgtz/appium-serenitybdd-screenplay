package gt.com.tigo.qa.stepsdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gt.com.tigo.qa.questions.TituloDetalles;
import gt.com.tigo.qa.tasks.IrA;
import gt.com.tigo.qa.tasks.Seleccionar;
import gt.com.tigo.qa.userinterfaces.HomeAppUI;
import gt.com.tigo.qa.utils.actions.actions;
import gt.com.tigo.qa.utils.enums.Direccion;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.hamcrest.Matchers;

import static java.time.Duration.ofSeconds;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DetailsSteps {

    private String tipoLinea;

      @When("^El usuario esta en la seccion consumos$")
    public void Elusuarioestaenlaseccionconsumos() {
          theActorInTheSpotlight().attemptsTo(IrA.laSeccionConsumos());

    }

    @When("^El usuario hace scroll en la pantalla$")
    public void elUsuarioHaceScrollEnLaPantalla() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(HomeAppUI.BOTON_DETALLES_INTERNET.waitingForNoMoreThan(ofSeconds(15))).isDisplayed());
    }


    @Then("^la app despliega las cards Internet$")
    public void laAppDespliegaLasCardsInternet() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(HomeAppUI.CARD_INTERNET.waitingForNoMoreThan(ofSeconds(10))).isDisplayed());
    }

    @Then("^la app despliega el card Llamadas$")
    public void laAppDespliegaElCardLlamadas() {
        actions.deslizaHacia(Direccion.ABAJO,
                HomeAppUI.CARD_LLAMADAS.resolveFor(theActorInTheSpotlight()),
                BrowseTheWeb.as(theActorInTheSpotlight()).getDriver());
           }

    @Then("^la app despliega el card Mensajes$")
    public void laAppDespliegaElCardMensajes() {
        actions.deslizaHacia(Direccion.ABAJO,
                HomeAppUI.CARD_MENSAJES.resolveFor(theActorInTheSpotlight()),
                BrowseTheWeb.as(theActorInTheSpotlight()).getDriver());
    }

    @When("^el usuario selecciona ver (.*)$")
    public void elUsuarioSeleccionaVer(String tipoLlamada) {
        IrA.laSeccion(tipoLlamada);
    }

    @Then("^la app despliega Detalles de Llamadas$")
    public void laAppDespliegaDetallesDeLlamadas() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(TituloDetalles.esVisible(), Matchers.is(true)));
    }

    @When("^el usuario selecciona opcion Detalles de Internet$")
    public void elUsuarioSeleccionaOpcionDetallesDeInternet() {
        theActorInTheSpotlight().attemptsTo(Click.on(HomeAppUI.BOTON_DETALLES_INTERNET));
    }


    @Then("^la app despliega Detalles de consumo de Internet$")
    public void laAppDespliegaDetallesDeConsumoDeInternet() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(HomeAppUI.TITULO_DETALLES.waitingForNoMoreThan(ofSeconds(10))).isDisplayed());
                theActorInTheSpotlight().should(GivenWhenThen.seeThat(TituloDetalles.esVisible(), Matchers.is(true)));
    }

    @When("^el usuario selecciona los Detalles de Mensajes$")
    public void elUsuarioSeleccionaLosDetallesDeMensajes() {
        theActorInTheSpotlight().attemptsTo(Seleccionar.losDetallesDeMensajes());

    }

    @Then("^la app despliega Detalles de consumo de Mensajes$")
    public void laAppDespliegaDetallesDeConsumoDeMensajes() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(HomeAppUI.TITULO_DETALLES.waitingForNoMoreThan(ofSeconds(10))).isDisplayed());
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(TituloDetalles.esVisible(), Matchers.is(true)));
        }
}

