package gt.com.tigo.qa.questions;

import gt.com.tigo.qa.userinterfaces.HomeAppUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.CurrentVisibility;

public class ElPaquetigominutos implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return CurrentVisibility.of(HomeAppUI.PAQUETE_ACTIVO_LLAMADAS).viewedBy(actor).asBoolean();
    }
    public static ElPaquetigominutos  esVisible(){
        return  new ElPaquetigominutos();
    }
}

