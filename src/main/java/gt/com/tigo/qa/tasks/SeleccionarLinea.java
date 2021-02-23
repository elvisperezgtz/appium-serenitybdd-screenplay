package gt.com.tigo.qa.tasks;

import gt.com.tigo.qa.userinterfaces.HomeAppUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarLinea implements Task {

    private String linea;

    public SeleccionarLinea(String linea) {
        this.linea = linea;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(HomeAppUI.LINEA.of(linea)));
    }

    public static SeleccionarLinea seleccionarLinea(String linea){
        return Tasks.instrumented(SeleccionarLinea.class,linea);
    }
}
