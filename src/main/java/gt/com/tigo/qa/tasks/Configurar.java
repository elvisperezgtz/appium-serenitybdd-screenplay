package gt.com.tigo.qa.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;


import static gt.com.tigo.qa.userinterfaces.ChromeUI.BOTON_ACEPTAR;
import static gt.com.tigo.qa.userinterfaces.ChromeUI.BOTON_SIGUIENTE;
import static gt.com.tigo.qa.userinterfaces.ChromeUI.BOTON_SI_ACEPTO;

public class Configurar implements Task {
    @Override
    @Step("{0} configura el navegador chrome")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BOTON_ACEPTAR),
                Click.on(BOTON_SIGUIENTE),
                Click.on(BOTON_SI_ACEPTO)
        );
    }

    public static Configurar elNavegador() {
        return Tasks.instrumented(Configurar.class);
    }
}
