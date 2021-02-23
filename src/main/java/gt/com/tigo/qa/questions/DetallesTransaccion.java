package gt.com.tigo.qa.questions;

import gt.com.tigo.qa.userinterfaces.ExitosaUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.CurrentVisibility;

public class DetallesTransaccion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return CurrentVisibility.of(ExitosaUI.DETALLES_DE_LA_TRANSACCION).viewedBy(actor).asBoolean();
    }
    public static DetallesTransaccion esVisible(){
        return  new DetallesTransaccion();
    }
}
