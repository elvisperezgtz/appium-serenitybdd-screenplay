package gt.com.tigo.qa.interactions;


import gt.com.tigo.qa.utils.actions.actions;
import gt.com.tigo.qa.utils.enums.Direccion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static gt.com.tigo.qa.userinterfaces.MenuUsurioUI.LAYOUT;


public class Scroll implements Interaction {


    Direccion direccion;

    public Scroll( Direccion direccion) {

        this.direccion = direccion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actions.deslizaHacia(direccion, LAYOUT.resolveFor(actor), BrowseTheWeb.as(actor).getDriver());
    }
    public static Scroll toElement( Direccion direccion){
        return Tasks.instrumented(Scroll.class , direccion);
    }

}
