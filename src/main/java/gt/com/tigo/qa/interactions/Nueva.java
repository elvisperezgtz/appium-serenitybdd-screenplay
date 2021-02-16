package gt.com.tigo.qa.interactions;


import gt.com.tigo.qa.userinterfaces.ChromeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static gt.com.tigo.qa.userinterfaces.ChromeUI.BOTON_MAS_OPCIONES;
import static gt.com.tigo.qa.userinterfaces.ChromeUI.NUEVA_PESTANIA;

public class Nueva implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BOTON_MAS_OPCIONES),
                Click.on(NUEVA_PESTANIA),
                Click.on(ChromeUI.CAJA_BUSQUEDA)
        );
    }
    public static Nueva pestania(){
        return Tasks.instrumented(Nueva.class);
    }
}
