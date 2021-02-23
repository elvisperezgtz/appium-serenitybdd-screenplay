package gt.com.tigo.qa.tasks;

import gt.com.tigo.qa.userinterfaces.EncuestaUI;
import gt.com.tigo.qa.userinterfaces.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class CerrarEncuesta implements Task {


@Override
public <T extends Actor> void performAs(T actor) {

        if(EncuestaUI.TITULO_ENCUESTA.resolveFor(actor).isDisplayed()){
        actor.attemptsTo(
                Click.on(EncuestaUI.BOTON_CERRAR)
        );
    }
}
    public static CerrarEncuesta encuesta(){
        return Tasks.instrumented(CerrarEncuesta.class);
    }

}
