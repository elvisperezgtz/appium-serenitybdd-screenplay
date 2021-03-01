package gt.com.tigo.qa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Step;

import static gt.com.tigo.qa.userinterfaces.ExitosaUI.DETALLES_DE_LA_TRANSACCION;
import static gt.com.tigo.qa.userinterfaces.ExitosaUI.VOLVER_AL_INICIO;

public class Verificar implements Task {
    @Override
    @Step("{Verifica que la transacción fue exitosa}")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Quitar.laEncuesta(),
                Ensure.that(DETALLES_DE_LA_TRANSACCION).isDisplayed(),
                Click.on(VOLVER_AL_INICIO),
                Quitar.laEncuesta()
        );
    }

    public static Verificar compra() {
        return Tasks.instrumented(Verificar.class);
    }

}
