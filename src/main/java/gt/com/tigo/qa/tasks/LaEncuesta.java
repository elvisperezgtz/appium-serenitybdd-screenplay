package gt.com.tigo.qa.tasks;

import gt.com.tigo.qa.interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.thucydides.core.annotations.Step;

import static gt.com.tigo.qa.userinterfaces.EncuestaUI.BOTON_CERRAR;

public class LaEncuesta implements Task {
    @Override
    @Step("{0} cierra la encuenta")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Esperar.por(5),
                Check.whether(BOTON_CERRAR.resolveFor(actor).isVisible())
                        .andIfSo(Click.on(BOTON_CERRAR))
        );

    }

}
