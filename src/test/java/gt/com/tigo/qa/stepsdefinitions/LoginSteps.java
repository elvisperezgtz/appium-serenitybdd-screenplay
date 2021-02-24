package gt.com.tigo.qa.stepsdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gt.com.tigo.qa.interactions.Abrir;
import gt.com.tigo.qa.models.Credenciales;
import gt.com.tigo.qa.questions.ElMensajeContraseniaInvalida;
import gt.com.tigo.qa.questions.ElMensajeDeCorreoInvalido;
import gt.com.tigo.qa.questions.ElMenuInferior;
import gt.com.tigo.qa.tasks.*;
import gt.com.tigo.qa.utils.correos.ManejadorDeCorreos;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.actors.Stage;
import org.hamcrest.Matchers;

import javax.mail.MessagingException;
import java.util.List;

import static gt.com.tigo.qa.utils.enums.Buzones.INBOX;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginSteps {

    @Before
    public void setUp() {
        Stage stage = OnStage.setTheStage(new OnlineCast());
    }

    @Before(value = "@buzonReset")
    public void limpiarBuzonReset() throws MessagingException {
        ManejadorDeCorreos.limpiarBuzon("reset.IndraGt@gmail.com", "Tigo#Indra.2021", INBOX);
    }
    @Before(value = "@buzonOTP")
    public void limpiarBuzonOTP() throws MessagingException {
        ManejadorDeCorreos.limpiarBuzon("otp.pacamara@gmail.com", "gt#otp.2021", INBOX);
    }

    @Given("^El usuario registrado abre la app$")
    public void elUsuarioRegistradoAbreLaApp() {
        theActorCalled("James").attemptsTo();
        theActorInTheSpotlight().attemptsTo(Quitar.elBanner());
    }

    @When("^El inicia sesion en la app por medio del correo electronico$")
    public void elIniciaSesionEnLaAppPorMedioDelCorreoElectronico(List<Credenciales> credenciales)
    {
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

    @And("^El selecciona la linea (.*)$")
    public void ElSeleccionaLaLinea(String linea)
    {
        theActorInTheSpotlight().attemptsTo(
                Selecciona.laLinea(linea)
        );
    }

    @Then("^El deberia poder ver los detalles de la linea$")
    public void elDeberiaPoderVerLosDetallesDeLaLinea() {
        theActorInTheSpotlight().should(seeThat(ElMenuInferior.esVisible(), Matchers.is(true)));
    }

    @When("^El inicia sesion en la app por Header Enrichment$")
    public void elIniciaSesionEnLaAppPorHeaderEnrichment()
    {
        theActorInTheSpotlight().attemptsTo(
                IniciarSesionHE.porHeaderEnrichment()
        );
    }

    @When("^El inicia sesion en la app por medio del numero de telefono (.*)$")
    public void elIniciaSesionEnLaAppPorMedioDelNumeroDeTelefono(String telefono)
    {
        theActorInTheSpotlight().attemptsTo(
                IniciarSesionOTP.porCodigoOTP(telefono)
        );
    }

    @And("^El ingresa codigo OTP correcto$")
    public void elIngresaCodigoOTPCorrecto()
    {
        theActorInTheSpotlight().attemptsTo(
                IngresarOTP.correcto()
        );
    }

    @And("^el deberia salir de la sesion$")
    public void elDeberiaSalirDeLaSesion()
    {
        theActorInTheSpotlight().attemptsTo(
                Terminar.laSesion()
        );
    }

    @When("^El selecciona ingresar con el correo (.*)$")
    public void elSeleccionaIngresarConElCorreoInvalido(String correoInvalido)
    {
        theActorInTheSpotlight().attemptsTo(
                IngresarCorreo.invalido(correoInvalido)
        );
    }

    @Then("^El deberia poder ver el mensaje de correo invalido$")
    public void elDeberiaPoderVerElMensajeDeCorreoInvalido()
    {
        theActorInTheSpotlight().should(seeThat(ElMensajeDeCorreoInvalido.esVisible(),Matchers.is(true)));
    }

    @Then("^El deberia poder ver el mensaje de contrasenia invalida$")
    public void elDeberiaPoderVerElMensajeDeContraseniaInvalida()
    {
        theActorInTheSpotlight().should(seeThat(ElMensajeContraseniaInvalida.esVisible(),Matchers.is(true)));
    }

}
