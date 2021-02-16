package gt.com.tigo.qa.tasks;


import gt.com.tigo.qa.interactions.Nueva;
import gt.com.tigo.qa.userinterfaces.TigoResetUI;
import gt.com.tigo.qa.utils.actions.actions;
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

public class Establecer implements Task {

    private String password;

    public Establecer(String password) {
        this.password = password;
    }

    @Override
    @Step("{0} establece una nueva contraseña para el ingreso a la app")
    public <T extends Actor> void performAs(T actor) {

        try {
            String url = ManejadorDeCorreos.obtenerElLink("reset.IndraGt@gmail.com", "Tigo#Indra.2021");
            actions.abrirApp(BrowseTheWeb.as(actor).getDriver());
            Nueva.pestania();
            actor.attemptsTo(
                    Enter.theValue(password).into(TigoResetUI.CONTRASENIA),
                    Click.on(TigoResetUI.CONTINUAR)
            );
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Establecer nuevaContrasenia(String password) {
        return Tasks.instrumented(Establecer.class, password);
    }
}
