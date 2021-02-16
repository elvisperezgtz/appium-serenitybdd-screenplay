package gt.com.tigo.qa.tasks;

import gt.com.tigo.qa.interactions.Nueva;
import gt.com.tigo.qa.userinterfaces.ChromeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.thucydides.core.annotations.Step;

public class LaUrl implements Task {
    @Override
    @Step("{0} Abre el navegador")
    public <T extends Actor> void performAs(T actor) {
        if (ChromeUI.TITULO_BIENVENIDA.resolveFor(actor).isVisible()) {
            actor.attemptsTo(Configurar.elNavegador());
        } else {
            actor.attemptsTo(Nueva.pestania());
        }
    }
}
