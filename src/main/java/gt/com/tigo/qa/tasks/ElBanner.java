package gt.com.tigo.qa.tasks;

import gt.com.tigo.qa.interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static gt.com.tigo.qa.userinterfaces.LoginUI.BOTON_AHORA_NO;
import static gt.com.tigo.qa.userinterfaces.LoginUI.MENSAJE_ACTUALIZACION;

public class ElBanner implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Esperar.por(10)
        );

        if(MENSAJE_ACTUALIZACION.resolveFor(actor).isVisible()){
            actor.attemptsTo(
                    Click.on(BOTON_AHORA_NO)
            );
        }
    }

}
