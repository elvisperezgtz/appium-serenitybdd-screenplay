package gt.com.tigo.qa.stepsdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gt.com.tigo.qa.models.Paquetes;
import gt.com.tigo.qa.questions.ElPaquetigo;
import gt.com.tigo.qa.questions.ElPaquetigoMensajes;
import gt.com.tigo.qa.questions.ElPaquetigominutos;
import gt.com.tigo.qa.questions.PaquetigoEncolado;
import gt.com.tigo.qa.tasks.*;
import gt.com.tigo.qa.userinterfaces.HomeAppUI;
import gt.com.tigo.qa.userinterfaces.MetodosPagoUI;
import gt.com.tigo.qa.userinterfaces.VerificacionUI;
import gt.com.tigo.qa.utils.actions.actions;
import gt.com.tigo.qa.utils.enums.Direccion;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.hamcrest.Matchers;

import java.util.List;

import static java.time.Duration.ofSeconds;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ShoppingSteps {

    @When("^El usuario selecciona paquete$")
    public void elUsuarioSeleccionaPaquete(List<Paquetes> paquetes) {
        theActorInTheSpotlight().attemptsTo(Click.on(HomeAppUI.BOTON_COMPRAR_INTERNET));
        theActorInTheSpotlight().attemptsTo(CompraPaqueteInternet.paquetes(paquetes.get(0).getPaquete(), paquetes.get(0).getNombrepaquetigo()));
    }

    @Then("^selecciona el metodos de pago$")
    public void seleccionaElMetodosDePago() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(MetodosPagoUI.TITULO_METODOS.waitingForNoMoreThan(ofSeconds(2))).isDisplayed());
        theActorInTheSpotlight().attemptsTo(Click.on(MetodosPagoUI.SALDO_RECARGA));
    }

    @Then("^despliega formulario de verificacion$")
    public void despliegaFormularioDeVerificacion() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(VerificacionUI.RESUMEN_COMPRA.waitingForNoMoreThan(ofSeconds(2))).isDisplayed());
        theActorInTheSpotlight().attemptsTo(Click.on(VerificacionUI.BOTON_COMPRAR));
    }

    @Then("^Valido que aparezca el mensaje de compra exitosa$")
    public void validoQueAparezcaElMensajeDeCompraExitosa() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                Verificar.compra()        );
    }

    @And("^Valido que el paquetigo se encuentre acreditado$")
    public void validoQueElPaquetigoseEncuentreAcreditado() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(ElPaquetigo.esVisible(), Matchers.is(true)));
        actions.deslizaHacia(Direccion.ABAJO,
                HomeAppUI.CARD_MINUTOS.resolveFor(theActorInTheSpotlight()),
                BrowseTheWeb.as(theActorInTheSpotlight()).getDriver());
    }

    @And("^Valido que el paquetigo se encuentre encolado$")
    public void validoQueElPaquetigoSeEncuentreEncolado() {
      /*  theActorInTheSpotlight().attemptsTo(
                VerificarEncolado.compra()        );*/
        //
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(PaquetigoEncolado.esVisible(),Matchers.is(true))        );
    }


@When("^selecciona el paquete de llamadas a comprar$")
public void seleccionaElPaqueteDeLlamadasAComprar(List<Paquetes> paquetes){
        theActorInTheSpotlight().attemptsTo(CompraPaqueteLlamadas.paquetes(paquetes.get(0).getPaquete(),paquetes.get(0).getNombrepaquetigo()));
        }

@When("^selecciona el paquete de mensajes a comprar$")
public void seleccionaElPaqueteDeMensajesAComprar(List<Paquetes> paquetes){
        theActorInTheSpotlight().attemptsTo(CompraPaqueteMensajes.paquetes(paquetes.get(0).getPaquete(),paquetes.get(0).getNombrepaquetigo()));
        }

@Then("^Valido que el paquetigo de llamadas se encuentre acreditado$")
public void validoQueElPaquetigoDeLlamadasSeEncuentreAcreditado(){
    theActorInTheSpotlight().should(GivenWhenThen.seeThat(ElPaquetigominutos.esVisible(), Matchers.is(true)));
        }

@Then("^Valido que el paquetigo de mensajes se encuentre acreditado$")
public void validoQueElPaquetigoDeMensajesSeEncuentreAcreditado(){
    theActorInTheSpotlight().should(GivenWhenThen.seeThat(ElPaquetigoMensajes.esVisible(), Matchers.is(true)));
}
}