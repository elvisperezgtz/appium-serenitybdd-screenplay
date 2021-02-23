package gt.com.tigo.qa.stepsdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gt.com.tigo.qa.interactions.Abrir;
import gt.com.tigo.qa.models.Credenciales;
import gt.com.tigo.qa.tasks.Asignar;
import gt.com.tigo.qa.tasks.IniciarSesion;
import gt.com.tigo.qa.tasks.SeleccionarLinea;
import gt.com.tigo.qa.tasks.Solicitar;
import gt.com.tigo.qa.userinterfaces.HomeAppUI;
import gt.com.tigo.qa.userinterfaces.LoginUI;
import gt.com.tigo.qa.userinterfaces.TigoResetUI;
import gt.com.tigo.qa.utils.correos.ManejadorDeCorreos;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.Stage;
import net.serenitybdd.screenplay.ensure.Ensure;

import javax.mail.MessagingException;
import java.util.List;

import static gt.com.tigo.qa.utils.enums.Buzones.INBOX;
import static java.time.Duration.ofSeconds;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginSteps {

    @Before
    public void setUp() {
        Stage stage = OnStage.setTheStage(new OnlineCast());
    }

    @Before()
    public void limpiarBuzon() throws MessagingException {
        ManejadorDeCorreos.limpiarBuzon("reset.IndraGt@gmail.com", "Tigo#Indra.2021", INBOX);
    }

    @Given("^El usuario registrado abre la app$")
    public void elUsuarioRegistradoAbreLaApp() {
        theActorCalled("James").attemptsTo();
//        theActorInTheSpotlight().attemptsTo(Quitar.elBanner());
    }

    @When("^El inicia sesion en la app por medio del correo electronico$")
    public void elIniciaSesionEnLaAppPorMedioDelCorreoElectronico(List<Credenciales> credenciales) {
        theActorInTheSpotlight().attemptsTo(
                IniciarSesion.enLaAplicacion(credenciales.get(0).getCorreo(), credenciales.get(0).getContrasenia())
        );
    }

    @When("^El solicita el cambio de contrasenia para el correo electronico (.*)$")
    public void elSolicitaElCambioDeContraseniaParaElCorreoElectronicoTigoindraGmailCom(String correoElectronico) {
        theActorInTheSpotlight().attemptsTo(Solicitar.cambioContrasenia(correoElectronico));
    }

    @And("^El asigna una nueva contrasenia$")
    public void elAsignaUnaNuevaContrasenia() {
        theActorInTheSpotlight().attemptsTo(Asignar.nuevaContrasenia());
    }

    @And("^El inicia sesion en la app con su nueva contrasenia$")
    public void elIniciaSesionEnLaAppConSuNuevaContrasenia() {
        Abrir.laApp(BrowseTheWeb.as(theActorInTheSpotlight()).getDriver(),
                "com.mobiquityinc.mitigo", "com.mobiquityinc.mitigo.MainActivity");
        theActorInTheSpotlight().attemptsTo(
                IniciarSesion.enLaAplicacion(
                        "tigoindra11@gmail.com"
                        , theActorInTheSpotlight().recall("nuevoPassword"))
        );
    }

    @Then("^El deberia poder ver los detalles de la linea$")
    public void elDeberiaPoderVerLosDetallesDeLaLinea() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(HomeAppUI.ICONO_PERFIL.waitingForNoMoreThan(ofSeconds(10))).isDisplayed()
        );
    }
    @When("^selecciona la linea movil (.*)")
    public void seleccionaLaLineaMovilPrepago(String linea) {
        theActorInTheSpotlight().attemptsTo(SeleccionarLinea.seleccionarLinea(linea));
    }
}
