package gt.com.tigo.qa.tasks;

import gt.com.tigo.qa.userinterfaces.LoginUI;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

import static gt.com.tigo.qa.userinterfaces.LoginUI.MENSAJE_ACTUALIZACION;

public class Quitar implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {


        if(MENSAJE_ACTUALIZACION.resolveFor(actor).isDisplayed()){
            actor.attemptsTo(
                    Click.on(LoginUI.BOTON_AHORA_NO)
            );
        }
    }
    public static Quitar elBanner(){
        return Tasks.instrumented(Quitar.class);
    }
}
