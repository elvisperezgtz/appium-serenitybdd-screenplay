package gt.com.tigo.qa.tasks;

import gt.com.tigo.qa.interactions.Esperar;
import gt.com.tigo.qa.userinterfaces.HomeAppUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class Selecciona implements Task{

    private String linea;
    public Selecciona(String linea) {
        this.linea = linea;
    }

    @Override
    @Step("{0} selecciona del listado la linea #linea")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Esperar.por(20)
        );

        if (HomeAppUI.LISTADO_LINEA.resolveFor(actor).isVisible())
        //if (HomeAppUI.LISTADO_LINEA.waitingForNoMoreThan(Duration.ofSeconds(10)).resolveFor(actor).isVisible())
        {
            actor.attemptsTo(
                    Click.on(HomeAppUI.LINEA.of(linea))
            );
        }
    }

    public static Selecciona laLinea (String linea)
    {
        return Tasks.instrumented(Selecciona.class,linea);
    }

}
