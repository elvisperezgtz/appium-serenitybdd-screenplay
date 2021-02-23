package gt.com.tigo.qa.questions;

import gt.com.tigo.qa.userinterfaces.HomeAppUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.CurrentVisibility;

public class TituloDetalles implements Question <Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return CurrentVisibility.of(HomeAppUI.TITULO_DETALLES).viewedBy(actor).asBoolean();
    }

    public static TituloDetalles esVisible(){
        return  new TituloDetalles();
    }
}
