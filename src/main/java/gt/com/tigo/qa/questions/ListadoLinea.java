package gt.com.tigo.qa.questions;

import gt.com.tigo.qa.userinterfaces.LoginUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.CurrentVisibility;

public class ListadoLinea implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return CurrentVisibility.of(LoginUI.LISTADO_LINEA).viewedBy(actor).asBoolean();
    }

    public static ListadoLinea esVisible(){
        return  new ListadoLinea();
    }
}
