package gt.com.tigo.qa.tasks;

import gt.com.tigo.qa.userinterfaces.EncuestaUI;
import gt.com.tigo.qa.userinterfaces.ExitosaUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

public class Verificar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        if (EncuestaUI.BOTON_CERRAR.resolveFor(actor).isVisible()) {
            actor.attemptsTo(
                    Click.on(EncuestaUI.BOTON_CERRAR)
            );
        }
        actor.attemptsTo(
                Ensure.that(ExitosaUI.DETALLES_DE_LA_TRANSACCION).isDisplayed(),
                Click.on(ExitosaUI.VOLVER_AL_INICIO)
        );
    }

    public static Verificar compra() {
        return Tasks.instrumented(Verificar.class);
    }

}
