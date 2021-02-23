package gt.com.tigo.qa.tasks;

import gt.com.tigo.qa.interactions.Esperar;
import gt.com.tigo.qa.userinterfaces.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;


public class Quitar implements Task {
    @Override
    @Step("{0} selecciona Actualizar - Ahora no")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Esperar.por(10)
        );

        if(LoginUI.MENSAJE_ACTUALIZACION.resolveFor(actor).isVisible()){
            actor.attemptsTo(
                    Click.on(LoginUI.BOTON_AHORA_NO)
            );
        }
    }
    public static Quitar elBanner(){
        return Tasks.instrumented(Quitar.class);
    }
}
