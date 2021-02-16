package gt.com.tigo.qa.interactions;

import gt.com.tigo.qa.utils.actions.actions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;


import static gt.com.tigo.qa.utils.enums.Direccion.ABAJO;
import static net.serenitybdd.screenplay.abilities.BrowseTheWeb.as;

public class Select implements Interaction {
    private String visibleText;
    private Target target;

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (target.resolveFor(actor).isVisible()){
            actor.attemptsTo(Click.on(target.of(visibleText)));
        }else{
            actions.deslizaHacia(ABAJO,target.of(visibleText).resolveFor(actor), as(actor).getDriver());
            actor.attemptsTo(Click.on(target.of(visibleText)));
        }
    }
    public static Select byVisibleText(String visibleText){
        return Tasks.instrumented(Select.class, visibleText);
    }
}
