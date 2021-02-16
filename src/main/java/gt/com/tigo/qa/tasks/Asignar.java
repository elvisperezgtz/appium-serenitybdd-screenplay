package gt.com.tigo.qa.tasks;


import gt.com.tigo.qa.interactions.Abrir;
import gt.com.tigo.qa.interactions.Close;
import gt.com.tigo.qa.utils.correos.ManejadorDeCorreos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import javax.mail.MessagingException;
import java.io.IOException;

import static gt.com.tigo.qa.userinterfaces.TigoResetUI.CONTINUAR;
import static gt.com.tigo.qa.userinterfaces.TigoResetUI.CONTRASENIA;
import static gt.com.tigo.qa.utils.correos.PasswordGenerator.*;


public class Asignar implements Task {

    private String url;

    {
        try {
            url = ManejadorDeCorreos.obtenerElLink("reset.IndraGt@gmail.com", "Tigo#Indra.2021");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    @Override
    @Step("Abre el navegador desde movil en la url #url y asigna una nueva contraseña")
    public <T extends Actor> void performAs(T actor) {
        Abrir.laApp(BrowseTheWeb.as(actor).getDriver(), "com.android.chrome", "com.google.android.apps.chrome.Main");

        String password=getPassword(MAYUSCULAS+ NUMEROS,10);

        actor.remember("nuevoPassword", password);

        actor.attemptsTo(
                AbrirElNavegador.en(BrowseTheWeb.as(actor).getDriver(),url),
                Enter.theValue(password).into(CONTRASENIA),
                Click.on(CONTINUAR),
                Close.theActivity(BrowseTheWeb.as(actor).getDriver())
                );
    }

    public static Asignar nuevaContrasenia() {
        return Tasks.instrumented(Asignar.class);
    }
}
